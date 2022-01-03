package com.colorvotes.colorvoteapi;

public class ColorList {
    private int total_votes;
    private int highest_vote_count;
    private Color[] colorList;

    public ColorList(Color[] colorList, int total_votes, int highest_vote_count){
        this.total_votes = total_votes;
        this.highest_vote_count = highest_vote_count;
        this.colorList = colorList;
    }

    public Color[] getColorList() {
        return colorList;
    }

    public int getTotal_votes() {
        return total_votes;
    }

    public int getHighest_vote_count() {
        return highest_vote_count;
    }

    public void setTotal_votes() {
        this.total_votes++;
    }

    public void setHighest_vote_count(int highest_vote_count) {
        this.highest_vote_count = highest_vote_count;
    }

    public void setColorVotesById(int color_id){
        this.colorList[color_id].increaseVotesByOne();
    }


}
