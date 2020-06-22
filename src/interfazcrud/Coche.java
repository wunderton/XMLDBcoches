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
public class Coche  implements Serializable{
    String nombre, modelo;
    int matricula, kilometros;

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    Coche(String nombre, int n_modelo) {
      this.nombre = nombre;
      this.matricula = n_modelo;
    }

    public Coche() {
        
    }

    public Coche(String nombre, String modelo, int matricula) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.matricula = matricula;
    }
     public Coche(String nombre, String modelo, int matricula, int año) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.matricula = matricula;
        this.ano = año;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
}
