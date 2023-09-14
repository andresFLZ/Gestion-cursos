/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestor_cursos.GestionCursos.persistencia;

import com.gestor_cursos.GestionCursos.logica.Monitor;
import com.gestor_cursos.GestionCursos.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author limas
 */
public class MonitorJpaController implements Serializable {

    public MonitorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public MonitorJpaController() {
        emf = Persistence.createEntityManagerFactory("GestionCursosPU");
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Monitor monitor) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(monitor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Monitor monitor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            monitor = em.merge(monitor);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = monitor.getCodigo();
                if (findMonitor(id) == null) {
                    throw new NonexistentEntityException("The monitor with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Monitor monitor;
            try {
                monitor = em.getReference(Monitor.class, id);
                monitor.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The monitor with id " + id + " no longer exists.", enfe);
            }
            em.remove(monitor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Monitor> findMonitorEntities() {
        return findMonitorEntities(true, -1, -1);
    }

    public List<Monitor> findMonitorEntities(int maxResults, int firstResult) {
        return findMonitorEntities(false, maxResults, firstResult);
    }

    private List<Monitor> findMonitorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Monitor.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Monitor findMonitor(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Monitor.class, id);
        } finally {
            em.close();
        }
    }

    public int getMonitorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Monitor> rt = cq.from(Monitor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
