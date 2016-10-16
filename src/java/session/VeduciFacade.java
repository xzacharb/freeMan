/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import data.Veduci;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Pernikar
 */
@Stateless
public class VeduciFacade extends AbstractFacade<Veduci> {
    @PersistenceContext(unitName = "zadaniePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VeduciFacade() {
        super(Veduci.class);
    }
    
}
