/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author alexni
 */
@Embeddable
public class PlayatPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "THEATERID")
    private String theaterid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "SCHEDULE")
    private String schedule;

    public PlayatPK() {
    }

    public PlayatPK(String theaterid, String title, String schedule) {
        this.theaterid = theaterid;
        this.title = title;
        this.schedule = schedule;
    }

    public String getTheaterid() {
        return theaterid;
    }

    public void setTheaterid(String theaterid) {
        this.theaterid = theaterid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (theaterid != null ? theaterid.hashCode() : 0);
        hash += (title != null ? title.hashCode() : 0);
        hash += (schedule != null ? schedule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlayatPK)) {
            return false;
        }
        PlayatPK other = (PlayatPK) object;
        if ((this.theaterid == null && other.theaterid != null) || (this.theaterid != null && !this.theaterid.equals(other.theaterid))) {
            return false;
        }
        if ((this.title == null && other.title != null) || (this.title != null && !this.title.equals(other.title))) {
            return false;
        }
        if ((this.schedule == null && other.schedule != null) || (this.schedule != null && !this.schedule.equals(other.schedule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.PlayatPK[ theaterid=" + theaterid + ", title=" + title + ", schedule=" + schedule + " ]";
    }
    
}
