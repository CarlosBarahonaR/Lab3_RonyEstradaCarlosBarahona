/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_ronyestradacarlosbarahona;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class SUV extends Modelo {

    private boolean CuatroXCuatro;
    private int pasajeros;
    private String navegador;

    public SUV() {
    }

    public SUV(boolean CuatroXCuatro, int pasajeros, String navegador) {
        this.CuatroXCuatro = CuatroXCuatro;
        this.pasajeros = pasajeros;
        this.navegador = navegador;
    }

    public SUV(boolean CuatroXCuatro, int pasajeros, String navegador, String nombreMod, Date año, String tipo, int clindrada, int precio, String tecnologia, String carroceria) {
        super(nombreMod, año, tipo, clindrada, precio, tecnologia, carroceria);
        this.CuatroXCuatro = CuatroXCuatro;
        this.pasajeros = pasajeros;
        this.navegador = navegador;
    }

    public boolean isCuatroXCuatro() {
        return CuatroXCuatro;
    }

    public void setCuatroXCuatro(boolean CuatroXCuatro) {
        this.CuatroXCuatro = CuatroXCuatro;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }

    @Override
    public String toString() {
        return "SUV{" + "CuatroXCuatro=" + CuatroXCuatro + ", pasajeros=" + pasajeros + ", navegador=" + navegador + '}';
    }

}
