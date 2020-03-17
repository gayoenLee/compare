package com.example.comparelistviewrecyclerview;

public class listviewData {
    private int poster;
    private String movieName;
    private String grade;

    public listviewData(int poster, String movieName, String grade){
        this.poster = poster;
        this.movieName = movieName;
        this.grade = grade;
    }

    public int getPoster()
    {
        return this.poster;
    }

    public String getMovieName()
    {
        return this.movieName;
    }

    public String getGrade()
    {
        return this.grade;
    }


}
