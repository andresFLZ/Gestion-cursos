package com.gestor_cursos.GestionCursos.logica;

public class Grupos {
    
    private String id;
    private String nombre;
    private String horario;
    private Profesor profesor;
    private Monitor monitor;

    public Grupos(String id, String nombre, String horario, Profesor profesor, Monitor monitor) {
        this.id = id;
        this.nombre = nombre;
        this.horario = horario;
        this.profesor = profesor;
        this.monitor = monitor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    
    
}
