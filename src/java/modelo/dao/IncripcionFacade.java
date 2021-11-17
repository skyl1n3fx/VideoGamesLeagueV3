/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.dto.Incripcion;

/**
 *
 * @author jorge
 */
@Stateless
public class IncripcionFacade extends AbstractFacade<Incripcion> {

    @PersistenceContext(unitName = "NextLevelPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public IncripcionFacade() {
        super(Incripcion.class);
    }
    
}
