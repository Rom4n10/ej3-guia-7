/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ1Y2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author roman Diseñar un programa que lea y guarde razas de perros en un
 * ArrayList de tipo String. El programa pedirá una raza de perro en un bucle,
 * el mismo se guardará en la lista y después se le preguntará al usuario si
 * quiere guardar otro perro o si quiere salir. Si decide salir, se mostrará
 * todos los perros guardados en el ArrayList.
 */
public class Servicio {

    Scanner leer = new Scanner(System.in);

    public Entidades crearPerro() {
        Entidades p1 = new Entidades();
        String op;
        p1.perroslist = new ArrayList();
        do {
            System.out.println("INGRESE LA RAZA");
            p1.setRaza(leer.next());
            p1.perroslist.add(p1.getRaza());
            System.out.println("Quiere ingresar otra raza? si/no");
            op = leer.next().toUpperCase();
            System.out.println(p1.perroslist.size());
        } while (!"NO".equals(op));
        int i = 0;
        for (String o : p1.perroslist) {
            System.out.println(o);
        }
       return p1;
    }
    public void eliminarMascota(Entidades p1){
       //SOLUCION CON EL ITERATOR
        Iterator <String> it = p1.perroslist.iterator(); 
        int i =0;
        System.out.println(" ");
        System.out.println("INGRESE LA RAZA A ELIMINAR");
        String perro = leer.next().toUpperCase();
        while (it.hasNext()) {
            String next = it.next().toUpperCase();
            if (next.equals(perro)) {//para remover
                System.out.println("LA RAZA "+perro+" SE ELIMINO CORRECTAMENTE");
                it.remove();
            }else if (i==p1.perroslist.size()-1) {
                System.out.println("LA RAZA A ELIMINAR NO SE ENCUENTRA:(");   
            }
            i++;
            }
        System.out.println(" ");
        System.out.println("MASCOTAS EXISTENTES");
         for (String aux : p1.perroslist) {
                    System.out.println(aux);
                }
         //SOLUCION SIN EL ITERATOR       
         //System.out.println("RAZA");
//               String raza = leer.next();
//               Boolean ra=true;
//               for (int i = 0; i < p1.perroslist.size(); i++) {
//            if(p1.perroslist.get(i).equals(raza)){
//              p1.perroslist.remove(i);
//                System.out.println("LA RAZA: "+raza +" HA SIDO ELIMINADA CORRECTAMENTE");
//            ra=true;
//            }else{
//                System.out.println("LA RAZA NO HA SIDO ENCONTRADA");
//            ra=false;
//            }
//                   System.out.println(p1.perroslist.toString());
//            }
//               if (ra=false){
//                   for (String aux : p1.perroslist) {
//                       System.out.println(aux);
//                   }
//               }
    }
}
        
        
    

/*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.*/