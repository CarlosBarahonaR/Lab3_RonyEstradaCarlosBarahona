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
public class Hatchback extends Modelo {

    private int capacidad;
    private int longitud;
    private int bolsasAire;

    public Hatchback() {
    }

    public Hatchback(int capacidad, int longitud, int bolsasAire, String nombreMod, GregorianCalendar año, String tipo, int clindrada, int precio, String tecnologia, String carroceria) {
        super(nombreMod, año, tipo, clindrada, precio, tecnologia, carroceria);
        this.capacidad = capacidad;
        this.longitud = longitud;
        this.bolsasAire = bolsasAire;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getBolsasAire() {
        return bolsasAire;
    }

    public void setBolsasAire(int bolsasAire) {
        this.bolsasAire = bolsasAire;
    }

    @Override
    public String toString() {
        return "Hatchback{" + "capacidad=" + capacidad + ", longitud=" + longitud + ", bolsasAire=" + bolsasAire + '}';
    }

}
