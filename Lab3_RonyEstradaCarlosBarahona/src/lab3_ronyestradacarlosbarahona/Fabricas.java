/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_ronyestradacarlosbarahona;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Fabricas {

    private String nombre;
    private String ubicacion;
    private int fabricado;
    private String masFabricada;
    private int empleados;
    private ArrayList<String> marcas = new ArrayList();
    private int autFabricado;

    public Fabricas() {
    }

    public Fabricas(String nombre, String ubicacion, int fabricado, String masFabricada, int empleados,ArrayList<String> marcas, int autFabricado) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fabricado = fabricado;
        this.masFabricada = masFabricada;
        this.empleados = empleados;
        this.marcas = marcas;
        this.autFabricado = autFabricado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getFabricado() {
        return fabricado;
    }

    public void setFabricado(int fabricado) {
        this.fabricado = fabricado;
    }

    public String getMasFabricada() {
        return masFabricada;
    }

    public void setMasFabricada(String masFabricada) {
        this.masFabricada = masFabricada;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public ArrayList<String> getMarcas() {
        return marcas;
    }

    public void setMarcas(ArrayList<String> marcas) {
        this.marcas = marcas;
    }

    public int getAutFabricado() {
        return autFabricado;
    }

    public void setAutFabricado(int autFabricado) {
        this.autFabricado = autFabricado;
    }

    @Override
    public String toString() {
        return "Fabricas{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", fabricado=" + fabricado + ", masFabricada=" + masFabricada + ", empleados=" + empleados + ", marcas=" + marcas + ", autFabricado=" + autFabricado + '}';
    }

}
