/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_ronyestradacarlosbarahona;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Admin
 */
public class Marcas {

    private String nombre;
    private String slogan;
    private GregorianCalendar año;
    private GregorianCalendar integracion;
    private String fundador;
    private int ventas;
    private String presidente;
    private int modelos;

    public Marcas() {
    }

    public Marcas(String nombre, String slogan, GregorianCalendar año, GregorianCalendar integracion, String fundador, int ventas, String presidente, int modelos) {
        this.nombre = nombre;
        this.slogan = slogan;
        this.año = año;
        this.integracion = integracion;
        this.fundador = fundador;
        this.ventas = ventas;
        this.presidente = presidente;
        this.modelos = modelos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public GregorianCalendar getAño() {
        return año;
    }

    public void setAño(GregorianCalendar año) {
        this.año = año;
    }

    public GregorianCalendar getIntegracion() {
        return integracion;
    }

    public void setIntegracion(GregorianCalendar integracion) {
        this.integracion = integracion;
    }

    public String getFundador() {
        return fundador;
    }

    public void setFundador(String fundador) {
        this.fundador = fundador;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public int getModelos() {
        return modelos;
    }

    public void setModelos(int modelos) {
        this.modelos = modelos;
    }

    @Override
    public String toString() {
        return "Marcas{" + "nombre=" + nombre + ", slogan=" + slogan + ", año=" + año + ", integracion=" + integracion + ", fundador=" + fundador + ", ventas=" + ventas + ", presidente=" + presidente + ", modelos=" + modelos + '}';
    }

}
