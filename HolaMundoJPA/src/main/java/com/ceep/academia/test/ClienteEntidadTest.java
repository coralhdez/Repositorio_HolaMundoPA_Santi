package com.ceep.academia.test;

import com.ceep.academia.dominio.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author PLANTA 3 DERECHA
 */
public class ClienteEntidadTest {

    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        
        EntityManager em = emf.createEntityManager();
        
        EntityTransaction tx = em.getTransaction();
        
        // Inicio la transacción
        tx.begin();
        
        Persona persona1 = new Persona("Antonio", "Recio", "a.recio@gmail.com", "666666666");
        
        log.debug("Objeto a persistir: " + persona1);
        
        em.persist(persona1);
        
        tx.commit();
        
        log.debug("Objeto persistido: " + persona1);
        
        em.close();
        
    }
    
}
