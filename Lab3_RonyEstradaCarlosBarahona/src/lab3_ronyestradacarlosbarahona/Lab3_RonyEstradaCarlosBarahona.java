/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_ronyestradacarlosbarahona;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab3_RonyEstradaCarlosBarahona {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    public boolean marca2 = false;
    public boolean model3 = false;

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 7) {
            System.out.println("    seleccione una opcion\n"
                    + "1• Corporaciones\n"
                    + "2• Marcas\n"
                    + "3• Modelos\n"
                    + "4• Fábricas "
                    + "5• Divisiones tecnológicas\n"
                    + "6• Informe total.\n"
                    + "7• out");
            opcion = lectura.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Nombre");
                    String nombre = lectura.next();
                    System.out.println("Sede");
                    String sede = lectura.next();
                    System.out.println("Año fabricado");
                    System.out.println("año");
                    int año = lectura.nextInt();
                    System.out.println("mes");
                    int mes = lectura.nextInt();
                    System.out.println("dia");
                    int dia = lectura.nextInt();
                    GregorianCalendar gc = new GregorianCalendar(año, mes, dia);
                    String presidente;
                    int número_empleados;
                    int CantidadAutos_fabrican; // se tiene que sumar 1 por cada nueva adición en fábricas.
                    ArrayList marca;

                }
                break;
                case 2: {
                    String nombre;
                    String sede;
                    Date año;
                    String presidente;
                    int empleados;
                    int autos;
                    ArrayList<String> marcas = new ArrayList();
                }
                break;
            }
        }

    }

}
