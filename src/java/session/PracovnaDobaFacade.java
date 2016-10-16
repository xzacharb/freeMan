/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import data.PracovnaDoba;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Pernikar
 */
@Stateless
public class PracovnaDobaFacade extends AbstractFacade<PracovnaDoba> {
    @PersistenceContext(unitName = "zadaniePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PracovnaDobaFacade() {
        super(PracovnaDoba.class);
    }
    
}
