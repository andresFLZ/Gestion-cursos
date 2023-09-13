/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestor_cursos.GestionCursos.logica;

import java.util.Date;

/**
 *
 * @author sjgar
 */
public class Profesor extends Funcionario {
    
    public Profesor(String codigo, String nombre, String telefono, Date fecha_nacimiento, String email, String direccion) {
        super(codigo, nombre, telefono, fecha_nacimiento, email, direccion);
    }
    
}
