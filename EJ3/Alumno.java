/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roman
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
 */
public class Alumno {
    private String nombre,apellido;
     List<Integer> notaList;
    public Alumno() {
        this.notaList = new ArrayList();
    }

    public Alumno(String nombre, String apellido, List<Integer> notaList) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notaList = notaList;
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

    public List<Integer> getNotaList() {
        return notaList;
    }

    public void setNotaList(List<Integer> notaList) {
        this.notaList = notaList;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", notaList=" + notaList + '}';
    }

   

    
}
