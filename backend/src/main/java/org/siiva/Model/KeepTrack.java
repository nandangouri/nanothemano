package org.siiva.Model;

public class KeepTrack {


    private int keeptrackId;
    private String youtube_link;
    private int siivagunnerId;

    public KeepTrack(int keeptrackId, String youtube_link, int siivagunnerId) {
        this.keeptrackId = keeptrackId;
        this.youtube_link = youtube_link;
        this.siivagunnerId = siivagunnerId;
    }

    public KeepTrack() {
    }

    public int getKeeptrackId() {
        return keeptrackId;
    }

    public void setKeeptrackId(int keeptrackId) {
        this.keeptrackId = keeptrackId;
    }

    public String getYoutube_link() {
        return youtube_link;
    }

    public void setYoutube_link(String youtube_link) {
        this.youtube_link = youtube_link;
    }

    public int getSiivagunnerId() {
        return siivagunnerId;
    }

    public void setSiivagunnerId(int siivagunnerId) {
        this.siivagunnerId = siivagunnerId;
    }

}
