package com.gestor_cursos.GestionCursos.logica;

import java.util.Date;

public class Profesor {
    
    private String codigo;
    private String nombre;
    private String telefono;
    private Date fecha_nacimiento;
    private String email;
    private String direccion;    

    public Profesor(String codigo, String nombre, String telefono, Date fecha_nacimiento, String email, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.email = email;
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
