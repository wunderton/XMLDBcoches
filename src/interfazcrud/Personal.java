/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazcrud;

import java.io.Serializable;

/**
 *
 * @author anton
 */
public class Personal  implements Serializable{
    String nombre, apellido, departamento;
    int id;

    public Personal(String nombre, String apellido, String departamento, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
        this.id = id;
    }

    Personal() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
