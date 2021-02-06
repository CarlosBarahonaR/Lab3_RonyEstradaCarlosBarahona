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
public class Modelo {

    private String nombreMod;
    private Date año;
    private String tipo;
    private int clindrada;
    private int precio;
    private String tecnologia;
    private String carroceria;

    public Modelo() {
    }

    public Modelo(String nombreMod, Date año, String tipo, int clindrada, int precio, String tecnologia, String carroceria) {
        this.nombreMod = nombreMod;
        this.año = año;
        this.tipo = tipo;
        this.clindrada = clindrada;
        this.precio = precio;
        this.tecnologia = tecnologia;
        this.carroceria = carroceria;
    }

    public String getNombreMod() {
        return nombreMod;
    }

    public void setNombreMod(String nombreMod) {
        this.nombreMod = nombreMod;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getClindrada() {
        return clindrada;
    }

    public void setClindrada(int clindrada) {
        this.clindrada = clindrada;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    @Override
    public String toString() {
        return "Modelo{" + "nombreMod=" + nombreMod + ", a\u00f1o=" + año + ", tipo=" + tipo + ", clindrada=" + clindrada + ", precio=" + precio + ", tecnologia=" + tecnologia + ", carroceria=" + carroceria + '}';
    }

}
