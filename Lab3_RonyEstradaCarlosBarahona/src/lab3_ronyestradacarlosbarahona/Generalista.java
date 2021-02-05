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
public class Generalista extends Marcas {

    private String tipo;

    public Generalista() {
    }

    public Generalista(String tipo, String nombre, String slogan, Date año, Date integro, String fundador, int ventas, String presidente, int modelos) {
        super(nombre, slogan, año, integro, fundador, ventas, presidente, modelos);
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
