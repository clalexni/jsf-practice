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
@Table(name = "SHOWTIME")
@NamedQueries({
    @NamedQuery(name = "Showtime.findAll", query = "SELECT s FROM Showtime s"),
    @NamedQuery(name = "Showtime.findBySchedule", query = "SELECT s FROM Showtime s WHERE s.schedule = :schedule")})
public class Showtime implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "SCHEDULE")
    private String schedule;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "showtime")
    private Collection<Playat> playatCollection;

    
    
    public Showtime() {
    }

    public Showtime(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
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
        hash += (schedule != null ? schedule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Showtime)) {
            return false;
        }
        Showtime other = (Showtime) object;
        if ((this.schedule == null && other.schedule != null) || (this.schedule != null && !this.schedule.equals(other.schedule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Showtime[ schedule=" + schedule + " ]";
    }
    
    
}
