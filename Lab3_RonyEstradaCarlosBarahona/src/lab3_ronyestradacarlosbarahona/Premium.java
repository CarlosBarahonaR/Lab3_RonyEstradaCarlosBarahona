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
public class Premium extends Marcas {

    private String mardepo;
    private String nomlujo;
    private String carroceria;

    public Premium() {
    }

    public Premium(String mardepo, String nomlujo, String carroceria, String nombre, String slogan, Date año, Date integro, String fundador, int ventas, String presidente, int modelos) {
        super(nombre, slogan, año, integro, fundador, ventas, presidente, modelos);
        this.mardepo = mardepo;
        this.nomlujo = nomlujo;
        this.carroceria = carroceria;
    }

    public String getMardepo() {
        return mardepo;
    }

    public void setMardepo(String mardepo) {
        this.mardepo = mardepo;
    }

    public String getNomlujo() {
        return nomlujo;
    }

    public void setNomlujo(String nomlujo) {
        this.nomlujo = nomlujo;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    @Override
    public String toString() {
        return "Premium{" + "mardepo=" + mardepo + ", nomlujo=" + nomlujo + ", carroceria=" + carroceria + '}';
    }

}
