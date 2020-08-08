/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import ejb.theaterEJB;
import entity.Movie;
import entity.Theater;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author alexni
 */
@Named(value = "moviePageBean")
@SessionScoped
public class MoviePageBean implements Serializable{

    @EJB
    private theaterEJB theaterEJB;
    private Movie movie;
    private Theater theater;

    public theaterEJB getTheaterEJB() {
        return theaterEJB;
    }

    public void setTheaterEJB(theaterEJB theaterEJB) {
        this.theaterEJB = theaterEJB;
    }


    /**
     * Creates a new instance of MoviePageBean
     */
    public MoviePageBean() {
    }
    
    public String setMovie(Movie movie, Theater theater){
        this.movie = movie;
        this.theater = theater;
        return "MoviePage";
    }

    public Theater getTheater() {
        return theater;
    }
    
    
    public Movie getMovie(){
        return movie;
    }
    
    public String getMovieTitle(){
        return movie.getTitle();
    }
    
    public String getMovieDescription(){
        return movie.getDescription();
    }
    
    public String getMovieYear(){
        return movie.getReleaseyear();
    }
//    public String getMovieImageURL(){
//        String[] list = movie.getTitle().split(" ");
//        String title = "../resources/image/";
//        
//        for (int i = 0; i < list.length; i++){
//            title += list[i];
//            
//            if (i <list.length - 1){
//                title += '+';
//            }
//        }
//        title+=".png";
//        return title;
//    }
//   
    
}
