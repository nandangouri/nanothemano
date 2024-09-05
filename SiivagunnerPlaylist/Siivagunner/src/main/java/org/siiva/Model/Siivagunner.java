package org.siiva.Model;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

public class Siivagunner {
    public void setSiivagunner_id(int siivagunner_id) {
        this.siivagunner_id = siivagunner_id;
    }

    private int siivagunner_id;
    @NotBlank(message = "youtube link is required.")
    private String youtube_link;
    @NotBlank(message = "title is required.")
    private String title;

    private boolean worth_listening = false;
    private boolean vocals = false;
    private boolean listened = false;

    public Siivagunner(int siivagunner_id, String youtube_link, String title, boolean worth_listening, boolean vocals, boolean listened) {
        this.siivagunner_id = siivagunner_id;
        this.youtube_link = youtube_link;
        this.title = title;
        this.worth_listening = worth_listening;
        this.vocals = vocals;
        this.listened = listened;
    }

    public Siivagunner() {
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

    public String getYoutube_link() {
        return youtube_link;
    }

    public void setYoutube_link(String youtube_link) {
        this.youtube_link = youtube_link;
    }

    public int getSiivagunner_id() {
        return siivagunner_id;
    }


    @Override
    public int hashCode() {
        return Objects.hash(siivagunner_id, youtube_link, title, worth_listening, vocals, listened);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Siivagunner that = (Siivagunner) o;
        return siivagunner_id == that.siivagunner_id && worth_listening == that.worth_listening && vocals == that.vocals && listened == that.listened && Objects.equals(youtube_link, that.youtube_link) && Objects.equals(title, that.title);
    }
}
