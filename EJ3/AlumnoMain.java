/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author roman
 */
public class AlumnoMain {

    /**
     * @param args the command line arguments
     * 


     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        AlumnoServ ser = new AlumnoServ();
        ArrayList <Alumno> alumnos = new ArrayList();
       String op; 
       do{
           Alumno p1 = new Alumno();
            System.out.println("INGRESE EL NOMBRE DEL ALUMNO");
           p1.setNombre(leer.next().toUpperCase());
           System.out.println("INGRESE EL APELLIDO DEL ALUMNO");
           p1.setApellido(leer.next().toUpperCase());
            System.out.println("Ingrese las notas");
             do{
               int nota=leer.nextInt();
                 p1.notaList.add(nota);
             }while(p1.notaList.size()<3);
            System.out.println("QUIERE INGRESAR OTRO ALUMNO. si/no");
            op = leer.next().toUpperCase();
            System.out.println();
             alumnos.add(p1);
        }while(!"NO".equals(op));
        for (Alumno aux : alumnos) {
            System.out.println(aux.toString());
        }
        ser.notaFinal(alumnos);
    }
    
}
