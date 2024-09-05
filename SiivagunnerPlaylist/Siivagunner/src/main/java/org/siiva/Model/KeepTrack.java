package org.siiva.Model;

public class KeepTrack {


    private int keeptrackId;
    private int youtube_link;
    private int siivagunnerId;

    public KeepTrack(int keeptrackId, int youtube_link, int siivagunnerId) {
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

    public int getYoutube_link() {
        return youtube_link;
    }

    public void setYoutube_link(int youtube_link) {
        this.youtube_link = youtube_link;
    }

    public int getSiivagunnerId() {
        return siivagunnerId;
    }

    public void setSiivagunnerId(int siivagunnerId) {
        this.siivagunnerId = siivagunnerId;
    }

}
