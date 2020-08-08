/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import ejb.theaterEJB;
import entity.Theater;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author alexni
 */
@Named(value = "mainPageBean")
@SessionScoped
public class MainPageBean implements Serializable {

    @EJB
    private theaterEJB theaterEJB;
    private List<Theater> theaters;
    private String selectTheaterMessage;
    private Theater theater;
    
    /**
     * Creates a new instance of MainPageBean
     */
    public MainPageBean() {
        selectTheaterMessage = null;
        theaters = null;
    }

    public theaterEJB getTheaterEJB() {
        return theaterEJB;
    }

    public List<Theater> getTheaters() {
        return theaters;
    }

    public Theater getTheater() {
        return theater;
    }
    
    public void setTheaters(){
        theaters = theaterEJB.findAllTheaters();
        selectTheaterMessage = "Select Your Theater: ";
    }
    public String getSelectTheaterMessage(){
        return selectTheaterMessage;
    }
    
//    public void setTheater(Theater theater){
//        this.theater = theater;
//    }
    
//    public List<Theater>getTheaterList(){
//        return theaterEJB.findAllTheaters();
//    }
    public List<Theater>getTheaterList(){
        return theaters;
    }
//    public String setTheater(Theater theater) {
//        this.theater = theater;
//        return "TheaterPage.xhtml";
//    }
    
//    public List<Movie>getMovieList(){
//        return theaterEJB.getMoviesForTheater(theater.getTheaterid());
//    }
    
    public String backFromTheater(){
        selectTheaterMessage = null;
        theaters = null;
        return "MainPage.xhtml";
    }
}
