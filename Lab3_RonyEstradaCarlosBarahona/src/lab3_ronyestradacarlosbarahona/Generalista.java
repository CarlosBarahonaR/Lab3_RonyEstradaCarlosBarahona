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
public class Generalista extends Marcas {

    private String tipo;

    public Generalista() {
    }

    public Generalista(String tipo) {
        this.tipo = tipo;
    }

    public Generalista(String tipo, String nombre, String slogan, GregorianCalendar año, GregorianCalendar integracion, String fundador, int ventas, String presidente, int modelos) {
        super(nombre, slogan, año, integracion, fundador, ventas, presidente, modelos);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Generalista{" + "tipo=" + tipo + '}';
    }

}
