package org.siiva.Model;

public class Genre {
    private int genre_id;
    private String genre_title;

    private String genre_description;

    public Genre(int genre_id, String genre_title, String genre_description) {
        this.genre_id = genre_id;
        this.genre_title = genre_title;
        this.genre_description = genre_description;
    }

    public Genre() {
    }

    public int getGenre_id() {
        return genre_id;
    }

    public String getGenre_description() {
        return genre_description;
    }

    public void setGenre_description(String genre_description) {
        this.genre_description = genre_description;
    }

    public String getGenre_title() {
        return genre_title;
    }

    public void setGenre_title(String genre_title) {
        this.genre_title = genre_title;
    }
}
