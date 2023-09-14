package com.gestor_cursos.GestionCursos.logica;

import com.gestor_cursos.GestionCursos.persistencia.ControladorPersistencia;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    
}
