/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Movie;
import entity.Showtime;
import entity.Theater;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alexni
 */
@Stateless
public class theaterEJB {

    @PersistenceContext(unitName = "TheaterJSFPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    public List<Theater> findAllTheaters(){
        return em.createNamedQuery("Theater.findAll", Theater.class)
                .getResultList();
    }
    
    public List<Movie> getMoviesForTheater(String theaterid){
        return em.createNamedQuery("Theater.findMoviesForTheater", Movie.class)
                .setParameter("theaterid", theaterid).getResultList();
    }
    
    public List<Showtime> getShowTimesForMovieAtTheater(String theaterid, String title){
        return em.createNamedQuery("Theater.findShowTimesForMovieAtTheater", Showtime.class)
                .setParameter("theaterid", theaterid).setParameter("title", title).getResultList();
    }
}
