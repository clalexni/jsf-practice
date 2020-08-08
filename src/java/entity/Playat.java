/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author alexni
 */
@Entity
@Table(name = "PLAYAT")
@NamedQueries({
    @NamedQuery(name = "Playat.findAll", query = "SELECT p FROM Playat p"),
    @NamedQuery(name = "Playat.findByTheaterid", query = "SELECT p FROM Playat p WHERE p.playatPK.theaterid = :theaterid"),
    @NamedQuery(name = "Playat.findByTitle", query = "SELECT p FROM Playat p WHERE p.playatPK.title = :title"),
    @NamedQuery(name = "Playat.findBySchedule", query = "SELECT p FROM Playat p WHERE p.playatPK.schedule = :schedule")})
public class Playat implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PlayatPK playatPK;
    @JoinColumn(name = "TITLE", referencedColumnName = "TITLE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Movie movie;
    @JoinColumn(name = "SCHEDULE", referencedColumnName = "SCHEDULE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Showtime showtime;
    @JoinColumn(name = "THEATERID", referencedColumnName = "THEATERID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Theater theater;

    public Playat() {
    }

    public Playat(PlayatPK playatPK) {
        this.playatPK = playatPK;
    }

    public Playat(String theaterid, String title, String schedule) {
        this.playatPK = new PlayatPK(theaterid, title, schedule);
    }

    public PlayatPK getPlayatPK() {
        return playatPK;
    }

    public void setPlayatPK(PlayatPK playatPK) {
        this.playatPK = playatPK;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public void setShowtime(Showtime showtime) {
        this.showtime = showtime;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (playatPK != null ? playatPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Playat)) {
            return false;
        }
        Playat other = (Playat) object;
        if ((this.playatPK == null && other.playatPK != null) || (this.playatPK != null && !this.playatPK.equals(other.playatPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Playat[ playatPK=" + playatPK + " ]";
    }
    
}
