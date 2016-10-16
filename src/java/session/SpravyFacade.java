/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import data.Spravy;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Pernikar
 */
@Stateless
public class SpravyFacade extends AbstractFacade<Spravy> {
    @PersistenceContext(unitName = "zadaniePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SpravyFacade() {
        super(Spravy.class);
    }
    
}
