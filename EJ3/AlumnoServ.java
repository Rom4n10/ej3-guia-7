/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 * @author roman
 * Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
 */
public class AlumnoServ {
   Scanner leer = new Scanner(System.in);
    public void notaFinal(ArrayList<Alumno>alumnos){
        System.out.println("Ingrese el nombre del alumno");
        String alu1 = leer.next().toUpperCase();
        Iterator<Alumno> it = alumnos.iterator();
       int x=0;
        while (it.hasNext()) {    
            Alumno next = it.next();
            Iterator<Integer> it2 = next.getNotaList().iterator();
            if (alu1.equals(next.getNombre().toUpperCase())) {
                while (it2.hasNext()) {
                    Integer next1 = it2.next();
                    x=x+next1;
                           
                }
                System.out.println("EL PROMEDIO ES: "+x/3);
            }
        }
    }
}
