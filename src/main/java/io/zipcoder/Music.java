package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        Integer selectionIndex = 0;
        for(int i = 0; i < playList.length; i++) {
            if(playList[i] == selection) {
                selectionIndex = i;
                //break;
            }
        }
        if(Math.abs(selectionIndex - startIndex) == playList.length-1) {
            return 1;
        }
        return Math.abs(selectionIndex-startIndex);
    }
}
