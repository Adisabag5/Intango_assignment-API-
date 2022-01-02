package com.colorvotes.colorvoteapi;

public class Color {
    private final int id;
    private final String css_code;
    private int votes;

    public Color(int id, String css_code, int votes){
        this.id = id;
        this.css_code = css_code;
        this.votes = votes;
    }

    public int getId() {
        return id;
    }

    public String getCss_code() {
        return css_code;
    }

    public int getVotes() {
        return votes;
    }

    public void increaseVotesByOne() {
        this.votes ++;
    }
}
