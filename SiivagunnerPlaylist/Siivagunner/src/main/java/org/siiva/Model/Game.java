package org.siiva.Model;

import java.util.Date;

public class Game {


    private int game_id;
    private int genre_id;
    private String game_title;
    private String game_description;
    private String game_description_source;
    private int review_id;


    private Date date_completed;
    private int status_id;
    private boolean favorite;
    private String image_link;



    public Game(int game_id, int genre_id, String game_title, String game_description, String game_description_source,
                int review_id, Date date_completed, int status_id, boolean favorite, String image_link) {
        this.game_id = game_id;
        this.genre_id = genre_id;
        this.game_title = game_title;
        this.game_description = game_description;
        this.game_description_source = game_description_source;
        this.review_id = review_id;
        this.date_completed = date_completed;
        this.status_id = status_id;
        this.favorite = favorite;
        this.image_link = image_link;
    }

    public Game() {
    }

    public int getGame_id() {
        return game_id;
    }

    public String getGame_title() {
        return game_title;
    }

    public void setGame_title(String game_title) {
        this.game_title = game_title;
    }

    public String getGame_description() {
        return game_description;
    }

    public void setGame_description(String game_description) {
        this.game_description = game_description;
    }

    public String getGame_description_source() {
        return game_description_source;
    }

    public void setGame_description_source(String game_description_source) {
        this.game_description_source = game_description_source;
    }

    public int getReview_id() {
        return review_id;
    }

    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public Date getDate_completed() {
        return date_completed;
    }

    public void setDate_completed(Date date_completed) {
        this.date_completed = date_completed;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    public int getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(int genre_id) {
        this.genre_id = genre_id;
    }
}
