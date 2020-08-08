/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import ejb.theaterEJB;
import entity.Movie;
import entity.Showtime;
import entity.Theater;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author alexni
 */
@Named(value = "showtimeBean")
@SessionScoped
public class ShowtimeBean implements Serializable {

    @EJB
    private theaterEJB theaterEJB;
    private Movie movie;
    private Theater theater;
    
    private String firstname;
    private String lastname;
    private String selectedTime;
    private String tickets;
    private String successMessage;
    
    public String getTickets() {
        return tickets;
    }

    public void setTickets(String tickets) {
        this.tickets = tickets;
    }
    
    

    public String getSelectedTime() {
        return selectedTime;
    }

    public void setSelectedTime(String selectedTime) {
        this.selectedTime = selectedTime;
    }
    
    

    public theaterEJB getTheaterEJB() {
        return theaterEJB;
    }

    public void setTheaterEJB(theaterEJB theaterEJB) {
        this.theaterEJB = theaterEJB;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    /**
     * Creates a new instance of ShowtimeBean
     */
    public ShowtimeBean() {
    }
    public String getShowTime(Movie movie, Theater theater){
        this.successMessage = "";
        this.movie = movie;
        this.theater = theater;
        return "ShowtimePage";
    }
//    
//    public List<Showtime> getShowTimeList()
//        return theaterEJB.getShowTimesForMovieAtTheater(theater.getTheaterid(), movie.getTitle());
//    }
    public List<Showtime> getShowTime(){
        return theaterEJB.getShowTimesForMovieAtTheater(theater.getTheaterid(), movie.getTitle());
    }
    public void setSuccessMessage(){
        successMessage = "";
        int order = Integer.parseInt(tickets) * 10;
        successMessage += "Thank you! Your order with a total of $" + order + " is done!";  
    }
    
    public String getSuccessMessage(){
        return successMessage;
    }
}
