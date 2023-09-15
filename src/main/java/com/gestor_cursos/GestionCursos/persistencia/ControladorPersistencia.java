package com.gestor_cursos.GestionCursos.persistencia;

import com.gestor_cursos.GestionCursos.logica.Grupos;
import java.util.List;

import com.gestor_cursos.GestionCursos.logica.Monitor;
import com.gestor_cursos.GestionCursos.logica.Profesor;
import com.gestor_cursos.GestionCursos.persistencia.exceptions.NonexistentEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPersistencia {
    
    GruposJpaController grupoJpa = new GruposJpaController();
    MonitorJpaController monitorJpa = new MonitorJpaController();
    ProfesorJpaController profeJpa = new ProfesorJpaController();

    public void guardarProfesor(Profesor profe) {
        profeJpa.create(profe);
    }

    public void guardarMonitor(Monitor monitor) {
        monitorJpa.create(monitor);
    }

    public List<Profesor> retornarProfesores() {
	return profeJpa.findProfesorEntities();
    }

    public List<Monitor> retornarMonitores() {
        return monitorJpa.findMonitorEntities();
    }

    public void borrarMonitor(int idMonitor) {
        try {
            monitorJpa.destroy(idMonitor);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarProfesor(int idProfe) {
        try {
            profeJpa.destroy(idProfe);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Profesor retornarProfesor(int codigo) {
        return profeJpa.findProfesor(codigo);
    }

    public void actualizarProfesor(Profesor profe) {
        try {
            profeJpa.edit(profe);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Monitor retornarMonitor(int codigo) {
        return monitorJpa.findMonitor(codigo);
    }

    public void actualizarMonitor(Monitor monitor) {
        try {
            monitorJpa.edit(monitor);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guardarGrupo(Grupos grupo) {
        grupoJpa.create(grupo);
    }

    public List<Grupos> retornarGrupos() {
        return grupoJpa.findGruposEntities();
    }
    
}
