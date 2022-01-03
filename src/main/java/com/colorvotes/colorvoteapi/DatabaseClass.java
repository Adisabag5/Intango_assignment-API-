package com.colorvotes.colorvoteapi;

import org.springframework.scheduling.annotation.Async;

public class DatabaseClass {
    public static ColorList globalColorList = new ColorList(
            new Color[]
                    {
                        new Color(0, "#9C27B0", 10),
                        new Color(1, "#6A1B9A", 20),
                        new Color(2, "#C2185B", 30),
                        new Color(3, "#FF8F00", 20),
                        new Color(4, "#FF5252", 30),
                        new Color(5, "#009688", 60),
                        new Color(6, "#689F38", 70),
                        new Color(7, "#2196F3", 70)
                    },310,70);

    public ColorList getColorList(){
        return globalColorList;
    }

    public static Boolean increaseVotesById(int id){
        if(globalColorList.getColorList()[id] != null){
            globalColorList.setTotal_votes();
            globalColorList.getColorList()[id].increaseVotesByOne();
            globalColorList.setHighest_vote_count(getHighestVoteCount());
            return true;
        }
        return false;
    }

    public static Integer getHighestVoteCount(){
        int max = globalColorList.getColorList()[0].getVotes();
        for(int i = 1; i < globalColorList.getColorList().length; i++) {
            if(globalColorList.getColorList()[i].getVotes() > max){
                max = globalColorList.getColorList()[i].getVotes();
            }
        }
        return max;
    }




}
