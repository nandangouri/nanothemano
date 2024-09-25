package org.siiva.data.mappers;

import org.siiva.Model.Siivagunner;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SiivagunnerMapper implements RowMapper<Siivagunner> {

    public Siivagunner mapRow(ResultSet resultSet, int i) throws SQLException {

        Siivagunner siivagunner = new Siivagunner();
        siivagunner.setSiivagunner_id(resultSet.getInt("siivagunner_id"));
        siivagunner.setVideo_id(resultSet.getString("video_id"));
        siivagunner.setTitle(resultSet.getString("title"));
        siivagunner.setListened(resultSet.getBoolean("listened"));
        siivagunner.setWorth_listening(resultSet.getBoolean("worth_listening"));
        siivagunner.setVocals(resultSet.getBoolean("vocals"));
        siivagunner.setDatepublished(resultSet.getTimestamp("date_published"));
        return siivagunner;
    }
}
