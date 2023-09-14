package com.gestor_cursos.GestionCursos.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Grupos implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String horario;
    @OneToOne
    private Profesor profesor;
    @OneToOne
    private Monitor monitor;

    public Grupos() {
    }

    public Grupos(int id, String nombre, String horario, Profesor profesor, Monitor monitor) {
        this.id = id;
        this.nombre = nombre;
        this.horario = horario;
        this.profesor = profesor;
        this.monitor = monitor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
