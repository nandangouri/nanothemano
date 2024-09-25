package org.siiva.Model;

import javax.validation.constraints.NotBlank;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Objects;

public class Siivagunner {

    //id in database
    private int siivagunner_id;

    //youtube video id
    @NotBlank(message = "youtube link is required.")
    private String video_id;
    //title of video
    @NotBlank(message = "title is required.")
    private String title;
    //has it been deemed listenable
    private boolean worth_listening = false;
    //has vocals or not.
    private boolean vocals;
    //have I listened to it
    private boolean listened = false;
    //Do i love it?
    private boolean favorite = false;


    private Timestamp datepublished;

    public Siivagunner(int siivagunner_id, String video_id, String title, boolean worth_listening,
                       boolean vocals, boolean listened, boolean favorite, Timestamp datepublished) {
        this.siivagunner_id = siivagunner_id;
        this.video_id = video_id;
        this.title = title;
        this.worth_listening = worth_listening;
        this.vocals = vocals;
        this.listened = listened;
        this.favorite = favorite;
        this.datepublished = datepublished;
    }

    public Siivagunner() {
    }
    public void setSiivagunner_id(int siivagunner_id) {
        this.siivagunner_id = siivagunner_id;
    }

    public boolean isListened() {
        return listened;
    }

    public void setListened(boolean listened) {
        this.listened = listened;
    }

    public boolean isVocals() {
        return vocals;
    }

    public void setVocals(boolean vocals) {
        this.vocals = vocals;
    }

    public boolean isWorth_listening() {
        return worth_listening;
    }

    public void setWorth_listening(boolean worth_listening) {
        this.worth_listening = worth_listening;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    public int getSiivagunner_id() {
        return siivagunner_id;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public Timestamp getDatepublished() {
        return datepublished;
    }

    public void setDatepublished(Timestamp datepublished) {
        this.datepublished = datepublished;
    }


    @Override
    public int hashCode() {
        return Objects.hash(siivagunner_id, video_id, title,
                worth_listening, vocals, listened, favorite, datepublished);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Siivagunner that = (Siivagunner) o;
        return siivagunner_id == that.siivagunner_id && worth_listening == that.worth_listening
                && vocals == that.vocals && listened == that.listened
                && Objects.equals(video_id, that.video_id) && Objects.equals(title, that.title)
                && Objects.equals(favorite, that.favorite)
                && Objects.equals(datepublished, that.datepublished);
    }
}
