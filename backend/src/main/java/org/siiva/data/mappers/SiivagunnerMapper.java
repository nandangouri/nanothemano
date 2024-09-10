package org.siiva.data.mappers;

import org.siiva.Model.Siivagunner;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SiivagunnerMapper implements RowMapper<Siivagunner> {

    public Siivagunner mapRow(ResultSet resultSet, int i) throws SQLException {

        Siivagunner siivagunner = new Siivagunner();
        siivagunner.setSiivagunner_id(resultSet.getInt("siivagunner_id"));
        siivagunner.setYoutube_link(resultSet.getString("youtube_link"));
        siivagunner.setTitle(resultSet.getString("title"));
        siivagunner.setListened(resultSet.getBoolean("listened"));
        siivagunner.setWorth_listening(resultSet.getBoolean("worth_listening"));
        siivagunner.setVocals(resultSet.getBoolean("vocals"));
        return siivagunner;
    }
}
