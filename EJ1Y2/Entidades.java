/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ1Y2;

import java.util.ArrayList;

/**
 *
 * @author roman
 */
public class Entidades {
    ArrayList <String> perroslist;
private String Raza;
    public Entidades() {
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public Entidades(String Raza) {
        this.Raza = Raza;
    }

    public Entidades(ArrayList<String> perroslist) {
        this.perroslist = perroslist;
    }
    
}
