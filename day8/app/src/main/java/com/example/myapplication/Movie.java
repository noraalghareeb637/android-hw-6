package com.example.myapplication;

public class Movie {
    private String title ;
    private String mainActor ;
    private double movieRate ;
    private int pgRate ;
    private String gener ;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public double getMovieRate() {
        return movieRate;
    }

    public void setMovieRate(double movieRate) {
        this.movieRate = movieRate;
    }

    public int getPgRate() {
        return pgRate;
    }

    public void setPgRate(int pgRate) {
        this.pgRate = pgRate;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }
    public void whichoneisthebest(Movie a , Movie a2){
        if (a.getTitle()>a2.getTitle())
            System.out.println(a.getTitle()+"is the best movie");
        else if (a2.getTitle()>a.getTitle()){
            System.out.println(a2.getTitle()+"is the best movie");
        }

        }
    }

