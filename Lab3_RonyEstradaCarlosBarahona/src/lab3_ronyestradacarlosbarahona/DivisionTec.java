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
public class DivisionTec {

    private String nombre;
    private Date creacion;
    private String campo;
    private ArrayList<String> tecnologia = new ArrayList();

    public DivisionTec() {
    }

    public DivisionTec(String nombre, Date creacion, String campo, ArrayList<String> tecnologia) {
        this.nombre = nombre;
        this.creacion = creacion;
        this.campo = campo;
        this.tecnologia=tecnologia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setDate(Date creacion) {
        this.creacion = creacion;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public ArrayList<String> getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(ArrayList<String> tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public String toString() {
        return "DivisionTec{" + "nombre=" + nombre + ", creacion=" + creacion + ", campo=" + campo + ", tecnologia=" + tecnologia + '}';
    }

}
