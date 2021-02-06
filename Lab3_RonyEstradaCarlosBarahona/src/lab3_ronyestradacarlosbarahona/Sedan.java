/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_ronyestradacarlosbarahona;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Admin
 */
public class Sedan extends Modelo {

    private boolean aindroidP;
    private boolean androidA;
    private ArrayList<String> listAssist = new ArrayList();

    public Sedan() {
    }

    public Sedan(boolean aindroidP, boolean androidA, String nombreMod, Date año, String tipo, int clindrada, int precio, String tecnologia, String carroceria) {
        super(nombreMod, año, tipo, clindrada, precio, tecnologia, carroceria);
        this.aindroidP = aindroidP;
        this.androidA = androidA;
    }

    public boolean isAindroidP() {
        return aindroidP;
    }

    public void setAindroidP(boolean aindroidP) {
        this.aindroidP = aindroidP;
    }

    public boolean isAndroidA() {
        return androidA;
    }

    public void setAndroidA(boolean androidA) {
        this.androidA = androidA;
    }

    public ArrayList<String> getListAssist() {
        return listAssist;
    }

    public void setListAssist(ArrayList<String> listAssist) {
        this.listAssist = listAssist;
    }

    @Override
    public String toString() {
        return "Sedan{" + "aindroidP=" + aindroidP + ", androidA=" + androidA + ", listAssist=" + listAssist + '}';
    }

}
