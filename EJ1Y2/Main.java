/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ1Y2;

import java.util.Scanner;

/**
 *
 * @author roman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.*/
        Scanner leer = new Scanner(System.in);
        Servicio serv = new Servicio();
    Entidades p1 = new Entidades();
    p1=serv.crearPerro();
   serv.eliminarMascota(p1);
        
    }
    
}
