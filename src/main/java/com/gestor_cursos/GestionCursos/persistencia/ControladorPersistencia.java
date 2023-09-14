package com.gestor_cursos.GestionCursos.persistencia;

import java.util.List;

import com.gestor_cursos.GestionCursos.logica.Monitor;
import com.gestor_cursos.GestionCursos.logica.Profesor;

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
    
}
