package org.siiva.data.mappers;

import org.siiva.Model.KeepTrack;
import org.siiva.Model.Siivagunner;

import java.sql.ResultSet;
import java.sql.SQLException;

public class KeepTrackMapper {
    public KeepTrack mapRow(ResultSet resultSet, int i) throws SQLException {

        KeepTrack keepTrack = new KeepTrack();
        keepTrack.setKeeptrackId(resultSet.getInt(0));
        keepTrack.setYoutube_link(resultSet.getString(1));
        keepTrack.setSiivagunnerId(resultSet.getInt(2));
        return keepTrack;
    }
}
