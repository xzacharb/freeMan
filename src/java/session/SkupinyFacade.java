/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import data.Skupiny;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Pernikar
 */
@Stateless
public class SkupinyFacade extends AbstractFacade<Skupiny> {
    @PersistenceContext(unitName = "zadaniePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SkupinyFacade() {
        super(Skupiny.class);
    }
    
}
