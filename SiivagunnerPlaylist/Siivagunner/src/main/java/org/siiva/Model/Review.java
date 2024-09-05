package org.siiva.Model;

public class Review {
    private int review_id;
    private String gameplay;
    private String story;
    private String music;
    private String misc;
    private float gameplay_weight;
    private float story_weight;
    private float music_weight;
    private float misc_weight;
    private float gameplay_score;
    private float story_score;
    private float music_score;
    private float misc_score;


    public Review(int review_id, String gameplay, String story, String music, String misc,
                  float gameplay_weight, float story_weight, float music_weight, float misc_weight,
                  float gameplay_score, float story_score, float music_score, float misc_score) {
        this.review_id = review_id;
        this.gameplay = gameplay;
        this.story = story;
        this.music = music;
        this.misc = misc;
        this.gameplay_weight = gameplay_weight;
        this.story_weight = story_weight;
        this.music_weight = music_weight;
        this.misc_weight = misc_weight;
        this.gameplay_score = gameplay_score;
        this.story_score = story_score;
        this.music_score = music_score;
        this.misc_score = misc_score;
    }

    public Review() {
    }

    public String getGameplay() {
        return gameplay;
    }

    public void setGameplay(String gameplay) {
        this.gameplay = gameplay;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getMisc() {
        return misc;
    }

    public void setMisc(String misc) {
        this.misc = misc;
    }

    public float getGameplay_weight() {
        return gameplay_weight;
    }

    public void setGameplay_weight(float gameplay_weight) {
        this.gameplay_weight = gameplay_weight;
    }

    public float getStory_weight() {
        return story_weight;
    }

    public void setStory_weight(float story_weight) {
        this.story_weight = story_weight;
    }

    public float getMusic_weight() {
        return music_weight;
    }

    public void setMusic_weight(float music_weight) {
        this.music_weight = music_weight;
    }

    public float getMisc_weight() {
        return misc_weight;
    }

    public void setMisc_weight(float misc_weight) {
        this.misc_weight = misc_weight;
    }

    public float getGameplay_score() {
        return gameplay_score;
    }

    public void setGameplay_score(float gameplay_score) {
        this.gameplay_score = gameplay_score;
    }

    public float getStory_score() {
        return story_score;
    }

    public void setStory_score(float story_score) {
        this.story_score = story_score;
    }

    public float getMusic_score() {
        return music_score;
    }

    public void setMusic_score(float music_score) {
        this.music_score = music_score;
    }

    public float getMisc_score() {
        return misc_score;
    }

    public void setMisc_score(float misc_score) {
        this.misc_score = misc_score;
    }
}
