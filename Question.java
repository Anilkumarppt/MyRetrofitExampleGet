package com.example.dell.myretrofitexampleget;

/**
 * Created by Dell on 09-02-2018.
 */

public class Question {
    public String title,link;
    Question(String title,String link){
        this.title=title;
        this.link=link;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }
}
