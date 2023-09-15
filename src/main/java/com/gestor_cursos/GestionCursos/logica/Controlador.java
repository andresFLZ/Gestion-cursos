package com.gestor_cursos.GestionCursos.logica;

import com.gestor_cursos.GestionCursos.persistencia.ControladorPersistencia;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controlador {
    
    ControladorPersistencia controlPersis = new ControladorPersistencia();

    //Se encarga de pasar al profesor al controlador de persistencia
    public void guardarProfesor(String nombre, String telefono, String fechaNa, 
            String email, String direccion) {
        
        Profesor profe = new Profesor();
        
        //Castea la fecha de String a Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fn = null;
        try {
            fn = dateFormat.parse(fechaNa);
        } catch (ParseException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        profe.setNombre(nombre);
        profe.setTelefono(telefono);
        profe.setFecha_nacimiento(fn);
        profe.setEmail(email);
        profe.setDireccion(direccion);
        
        controlPersis.guardarProfesor(profe);
    }

    //Se encarga de pasar al monitor al controlador de persistencia
    public void guardarMonitor(String nombre, String telefono, String fechaNa, 
            String email, String direccion) {
        
        Monitor monitor = new Monitor();
        
        //Castea la fecha de String a Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fn = null;
        try {
            fn = dateFormat.parse(fechaNa);
        } catch (ParseException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        monitor.setNombre(nombre);
        monitor.setTelefono(telefono);
        monitor.setFecha_nacimiento(fn);
        monitor.setEmail(email);
        monitor.setDireccion(direccion);
        
        controlPersis.guardarMonitor(monitor);
    }

    public List<Profesor> retornarProfesores() {
	return controlPersis.retornarProfesores();
    }

    public List<Monitor> retornarMonitores() {
        return controlPersis.retornarMonitores();
    }

    public void borrarMonitor(int idMonitor) {
        controlPersis.borrarMonitor(idMonitor);
    }

    public void borrarProfesor(int idProfe) {
        controlPersis.borrarProfesor(idProfe);
    }

    public Profesor retornarProfesor(int codigo) {
        return controlPersis.retornarProfesor(codigo);
    }

    public void actualizarProfesor(Profesor profe, String nombre, String telefono, String fechaNa, 
            String email, String direccion) {
        
        //Castea la fecha de String a Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fn = null;
        try {
            fn = dateFormat.parse(fechaNa);
        } catch (ParseException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        profe.setNombre(nombre);
        profe.setTelefono(telefono);
        profe.setFecha_nacimiento(fn);
        profe.setEmail(email);
        profe.setDireccion(direccion);
        
        controlPersis.actualizarProfesor(profe);
    }

    public Monitor retornarMonitor(int codigo) {
        return controlPersis.retornarMonitor(codigo);
    }

    public void actualizarMonitor(Monitor monitor, String nombre, String telefono, String fechaNa, 
            String email, String direccion) {
        
        //Castea la fecha de String a Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fn = null;
        try {
            fn = dateFormat.parse(fechaNa);
        } catch (ParseException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        monitor.setNombre(nombre);
        monitor.setTelefono(telefono);
        monitor.setFecha_nacimiento(fn);
        monitor.setEmail(email);
        monitor.setDireccion(direccion);
        
        controlPersis.actualizarMonitor(monitor);
    }

    public void guardarGrupo(String nombre, String horario, Profesor profe, Monitor monitor) {
        Grupos grupo = new Grupos();
        
        grupo.setNombre(nombre);
        grupo.setHorario(horario);
        if(profe!=null){
            grupo.setProfesor(profe);
        }
        if(monitor!=null){
            grupo.setMonitor(monitor);
        }
        
        controlPersis.guardarGrupo(grupo);
    }

    public List<Grupos> retornarGrupos() {
        return controlPersis.retornarGrupos();
    }

    public void borrarGrupo(int idGrupo) {
        controlPersis.borrarGrupo(idGrupo);
    }
    
}
