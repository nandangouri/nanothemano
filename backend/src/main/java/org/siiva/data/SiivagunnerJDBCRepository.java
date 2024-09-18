package org.siiva.data;

import org.siiva.Model.Siivagunner;
import org.siiva.data.mappers.SiivagunnerMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

@Repository
public class SiivagunnerJDBCRepository implements SiivagunnerRepository {

    private final JdbcTemplate jdbcTemplate;

    public SiivagunnerJDBCRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     *
     * @param song - sql Id of the song to be set to the new current.
     * @return
     */
    @Override
    public boolean setCurrent(int song) {
        String findCurrent = "update siivagunner set current=0 where current=1;";
        jdbcTemplate.update(findCurrent);
        String setCurrent = "update siivagunner set current=1 where siivagunner_id= ?;";
        return jdbcTemplate.update(setCurrent, song) > 0;
    }

    /**
     *
     * @param video_id - video id to reset to. aka siivagunner uploaded 30 new songs, video id
     *                 of the one to stop at, and then compare it to the videos uploaded
     * @param songs - all the songs need to be added.
     * @return - latest video id, if null, knows to keep going;
     */
    @Override
    public String updateNew(String video_id, List<Siivagunner> songs) {
        for (Siivagunner siiva : songs) {
            if(siiva.getYoutube_link().equals(video_id)) {
                return video_id;
            } else {
                add(siiva);
            }
        }
        return null;
    }

    /**
     * @param siivagunner - the song to be added
     * @return - song that was added
     */
    @Override
    public Siivagunner add(Siivagunner siivagunner) {
        String sql = "INSERT INTO siivagunner (youtube_link, title, worth_listening, " +
                "vocals, listened, favorite) values(?,?,?,?,?,?);";

        KeyHolder keyHolder = new GeneratedKeyHolder();
        int rowsAffected = jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,siivagunner.getYoutube_link());
            ps.setString(2,siivagunner.getTitle());
            ps.setBoolean(3,siivagunner.isWorth_listening());
            ps.setBoolean(4,siivagunner.isVocals());
            ps.setBoolean(5,siivagunner.isListened());
            ps.setBoolean(6,siivagunner.isFavorite());
            return ps;
        }, keyHolder);
        if (rowsAffected <= 0){
            return null;
        }

        siivagunner.setSiivagunner_id(keyHolder.getKey().intValue());

        return siivagunner;
    }

    /**
     *
     * @param song_id - SQL song Id
     * @return song that is found, otherwise null.
     */
    @Override
    public Siivagunner getById(int song_id) {
        String sql = "SELECT * FROM siivagunner WHERE siivagunner_id = ?";

        return jdbcTemplate.query(sql, new SiivagunnerMapper(), song_id).stream().findFirst().orElse(null);

    }

    @Override
    public Siivagunner getByVideoId(String video_id) {
        String sql = "SELECT * FROM siivagunner WHERE youtube_link = '?'";

        return jdbcTemplate.query(sql, new SiivagunnerMapper(), video_id).stream().findFirst().orElse(null);
    }

    @Override
    public boolean update(Siivagunner siivagunner) {
        String sql = "UPDATE siivagunner SET " +
                "youtube_link = ?, " +
                "title = ?, " +
                "worth_listening = ?, " +
                "vocals = ?, " +
                "listened = ?, " +
                "favorite = ?" +
                "where siivagunner_id = ? ;";

        return jdbcTemplate.update(sql,
                siivagunner.getYoutube_link(),
                siivagunner.getTitle(),
                siivagunner.isWorth_listening(),
                siivagunner.isVocals(),
                siivagunner.isListened(),
                siivagunner.isFavorite(),
                siivagunner.getSiivagunner_id()) > 0;
    }

    @Override
    public boolean updateListened(int song, boolean listened) {
        String sql = "UPDATE siivagunner SET " +
                "listened = ? " +
                "where siivagunner_id = ? ;";

        return jdbcTemplate.update(sql,
                listened, song) > 0;
    }

    @Override
    public boolean updateWorth(int song, boolean worth) {
        String sql = "UPDATE siivagunner SET " +
                "worth_listening = ? " +
                "where siivagunner_id = ? ;";

        return jdbcTemplate.update(sql,
                worth, song) > 0;
    }

    @Override
    public List<Siivagunner> getAll() {
        final String sql = "Select * from siivagunner";
        return jdbcTemplate.query(sql, new SiivagunnerMapper());
    }

    @Override
    public Siivagunner getNext() {
        final String getSQL = "select siivagunner_id from keeptrack where keeptrack_id=1";
        Siivagunner siiva = jdbcTemplate.query(getSQL, new SiivagunnerMapper()).get(0);
        return getById( (siiva.getSiivagunner_id() + 1) );
    }

    @Override
    public Siivagunner getPrevious() {
        final String getSQL = "select siivagunner_id from keeptrack where keeptrack_id=1";
        Siivagunner siiva = jdbcTemplate.query(getSQL, new SiivagunnerMapper()).get(0);
        return getById( (siiva.getSiivagunner_id() - 1) );
    }
}
