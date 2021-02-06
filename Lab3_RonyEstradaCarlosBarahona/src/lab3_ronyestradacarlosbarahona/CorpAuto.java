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
public class CorpAuto {

      private String nombre;
    private String sede;
    private Date año;
    private String presidente;
    private int empleados;
    private int autos;
    private ArrayList marcas = new ArrayList();

    public CorpAuto() {
    }

    public CorpAuto(String nombre, String sede, Date año,String presidente, int empleados, int autos, ArrayList marcas) {
        this.nombre = nombre;
        this.sede = sede;
        this.año=año;
        this.presidente = presidente;
        this.empleados = empleados;
        this.autos = autos;
        this.marcas= marcas;
    }

   

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public int getAutos() {
        return autos;
    }

    public void setAutos(int autos) {
        this.autos = autos;
    }

    public ArrayList<String> getMarcas() {
        return marcas;
    }

    public void setMarcas(ArrayList<String> marcas) {
        this.marcas = marcas;
    }

    @Override
    public String toString() {
        return "CorpAuto{" + "nombre=" + nombre + ", sede=" + sede + ", a\u00f1o=" + año + ", presidente=" + presidente + ", empleados=" + empleados + ", autos=" + autos + ", marcas=" + marcas + '}';
    }

}
