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
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author alexni
 */
@Named(value = "theaterPageBean")
@SessionScoped
public class TheaterPageBean implements Serializable{

    @EJB
    private theaterEJB theaterEJB;
    private Theater theater;
    private List<Movie> movies;
    /**
     * Creates a new instance of TheaterPageBean
     */
    public TheaterPageBean() {
    }

    public theaterEJB getTheaterEJB() {
        return theaterEJB;
    }

    public void setTheaterEJB(theaterEJB theaterEJB) {
        this.theaterEJB = theaterEJB;
    }

    public Theater getTheater() {
        return theater;
    }

    public String setTheater(Theater theater) {
        this.theater = theater;
        return "TheaterPage.xhtml";
    }
    
//    public List<Movie>getMovieList(){
//        return theaterEJB.getMoviesForTheater(theater.getTheaterid());
//    }
//    

    public List<Movie> setMovies() {
        this.movies = theaterEJB.getMoviesForTheater(theater.getTheaterid());
        return movies;
    }
    
    public String backFromMoviePage(){
        return "TheaterPage";
    }
    
}
