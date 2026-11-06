package org.example;

public class Game {
    private String title;
    private String genre;
    private int rating;
    private int count;

    public int getCount (){
        return this.count;
    }

    public void setCount(int count){
        this.count=count;
    }

    public Game(String title, String genre, int rating, int count){
        this(title,genre,rating);
        this.count=count;

    }

    public Game( String title, String genre, int rating){
        this.title= title;
        this.genre=genre;
        this.rating= rating;
    }

    public String GetTitle(){
        return title;
    }

    public String GetGenre(){
        return genre;
    }

    public int GetRating(){
        return rating;
    }

    public boolean isTop(){
        return this.rating >=9;
    }

}
