/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author alexni
 */
@Entity
@Table(name = "THEATER")
@NamedQueries({
    @NamedQuery(name = "Theater.findAll", query = "SELECT t FROM Theater t"),
    @NamedQuery(name = "Theater.findByTheaterid", query = "SELECT t FROM Theater t WHERE t.theaterid = :theaterid"),
    @NamedQuery(name = "Theater.findByLocation", query = "SELECT t FROM Theater t WHERE t.location = :location"),
    @NamedQuery(name = "Theater.findMoviesForTheater", query = "SELECT m FROM Movie m, Playat p WHERE m.title = p.playatPK.title and p.playatPK.schedule = '10:00 ~ 12:00' and p.playatPK.theaterid= :theaterid "),
    @NamedQuery(name = "Theater.findShowTimesForMovieAtTheater", query = "SELECT s FROM Showtime s, Playat p WHERE s.schedule = p.playatPK.schedule and p.playatPK.theaterid = :theaterid and p.playatPK.title = :title")
})
public class Theater implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "THEATERID")
    private String theaterid;
    @Size(max = 50)
    @Column(name = "LOCATION")
    private String location;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "theater")
    private Collection<Playat> playatCollection;

    public Theater() {
    }

    public Theater(String theaterid) {
        this.theaterid = theaterid;
    }

    public String getTheaterid() {
        return theaterid;
    }

    public void setTheaterid(String theaterid) {
        this.theaterid = theaterid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Collection<Playat> getPlayatCollection() {
        return playatCollection;
    }

    public void setPlayatCollection(Collection<Playat> playatCollection) {
        this.playatCollection = playatCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (theaterid != null ? theaterid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Theater)) {
            return false;
        }
        Theater other = (Theater) object;
        if ((this.theaterid == null && other.theaterid != null) || (this.theaterid != null && !this.theaterid.equals(other.theaterid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Theater[ theaterid=" + theaterid + " ]";
    }
    
}
