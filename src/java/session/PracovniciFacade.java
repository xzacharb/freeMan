/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import data.Pracovnici;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Pernikar
 */
@Stateless
public class PracovniciFacade extends AbstractFacade<Pracovnici> {
    @PersistenceContext(unitName = "zadaniePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PracovniciFacade() {
        super(Pracovnici.class);
    }
    public List<Pracovnici> SortByMeno(int poradie){
    if (poradie == 0)
        return em.createQuery("SELECT s FROM Pracovnici s ORDER BY s.meno ASC").getResultList();
    else
        return em.createQuery("SELECT s FROM Pracovnici s ORDER BY s.meno DESC").getResultList();
    }
    public List<Pracovnici> SortByPriezvisko(int poradie){
    if (poradie == 0)
        return em.createQuery("SELECT s FROM Pracovnici s ORDER BY s.priezvisko ASC").getResultList();
    else
        return em.createQuery("SELECT s FROM Pracovnici s ORDER BY s.priezvisko DESC").getResultList();
    }
     public List<Pracovnici> vyhladavaniePodlaMena(String meno){
            return em.createQuery("SELECT s FROM Pracovnici s where s.meno like '%"+meno+"%'").getResultList();
    }
     public List<Pracovnici> vyhladavaniePodlaPriezviska(String priezvisko){
            return em.createQuery("SELECT s FROM Pracovnici s where s.priezvisko like '%"+priezvisko+"%'").getResultList();
    }
}
