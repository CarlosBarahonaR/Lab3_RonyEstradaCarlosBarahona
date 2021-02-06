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
import javax.swing.JOptionPane;

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
        ArrayList<Fabricas> fabrica = new ArrayList();
        ArrayList<DivisionTec> divTec = new ArrayList();
        while (opcion != 7) {
            System.out.println("    seleccione una opcion\n"
                    + "1• Corporaciones\n"
                    + "2• Marcas\n"
                    + "3• Modelos\n"
                    + "4• Fábricas\n"
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
                case 4: {
                    while (opcion != 5) {
                        opcion = Integer.parseInt(
                                JOptionPane.showInputDialog("1-	Crear\n"
                                        + "2-	Listar\n"
                                        + "3-	Modificar\n"
                                        + "4-	Eliminar\n"
                                )
                        );

                        if (opcion == 1) {

                            System.out.println("Nombre de la fabrica: ");
                            String nombre = lectura.next();
                            System.out.println("Ubicacion de la fabrica: ");
                            String ubicacion = lectura.nextLine();
                            System.out.println("Cantidad maxima de modelos que se pueden fabricar: ");
                            int maxModelos = lectura.nextInt();
                            System.out.println("Tipo de carroceria mas fabricada\n" + "1) Hatchback\n" + "2) Sedan\n" + "3) SUV\n");
                            String carroceria = lectura.next();
                            System.out.println("Cantidad de empleados: ");
                            int empleados = lectura.nextInt();
                            int resp = 0;
                            ArrayList<String> marcas = new ArrayList();
                            String marca = "";
                            while (resp != 1) {
                                System.out.println("Nombre de la marca: ");
                                marca = lectura.next();
                                marcas.add(marca);
                                System.out.println("¿Desea ingresar otra marca? (1 = SI // 2 = NO): ");
                                resp = lectura.nextInt();

                            }
                            System.out.println("Cantidad de autos que se fabrican actualmente: ");
                            int autos = lectura.nextInt();
                            fabrica.add(new Fabricas(nombre, ubicacion, maxModelos, carroceria, empleados, marcas, autos));
                        }

                        if (opcion == 2) {
                            String salida = "";
                            for (Object t : fabrica) {
                                if (t instanceof Fabricas) {
                                    salida += fabrica.indexOf(t) + "- " + t + "\n";
                                }
                            }
                            System.out.println(salida);
                        }

                        if (opcion == 3) {
                            System.out.println("Seleccione numero de lista");
                            int op = lectura.nextInt();
                            System.out.println("Seleccione variable a cambiar\n"
                                    + "   0. Nombre\n"
                                    + "   1. Ubicacion\n"
                                    + "   2. Cantidad maxima de modelos que se fabrican\n"
                                    + "   3. Tipo de carroceria mas fabricada\n"
                                    + "   4. Cantidad de empleados\n"
                                    + "   5. Nombre de marcas\n  "
                                    + "   6. Cantidad de autos fabricados hasta el momento\n");
                            int variable = lectura.nextInt();
                            if (fabrica.get(op) instanceof Fabricas) {
                                if (variable == 2) {
                                    System.out.println("Ingrese la cantidad maxima de modelos que se fabrican");
                                    ((Fabricas) fabrica.get(op)).setFabricado(lectura.nextInt());
                                }

                            }
                            if (variable == 0) {
                                System.out.println("Cambio de nombre");
                                ((Fabricas) fabrica.get(op)).setNombre(lectura.next());
                            }
                            if (variable == 1) {
                                System.out.println("Ubicacion");
                                ((Fabricas) fabrica.get(op)).setUbicacion(lectura.next());

                            }
                            if (variable == 3) {
                                System.out.println("Tipo de carroceria mas fabricada");
                                ((Fabricas) fabrica.get(op)).setMasFabricada(lectura.next());
                            }

                        }
                        if (opcion == 4) {
                            System.out.println("Ingrese la posicion de la fabrica a elimnar: ");
                            int p = lectura.nextInt();

                            if (fabrica.get(p) instanceof Fabricas) {
                                fabrica.remove(p);
                            } else {
                                System.out.println("La posicion es incorrecta");
                            }

                        }

                    }

                }
                break;
                case 5: {
                    if (marca2 == true) {
                        while (opcion != 5) {
                            opcion = Integer.parseInt(
                                    JOptionPane.showInputDialog("1-	Crear\n"
                                            + "2-	Listar\n"
                                            + "3-	Modificar\n"
                                            + "4-	Eliminar\n"
                                    )
                            );

                            if (opcion == 1) {

                                System.out.println("Nombre de la division tecnologica: ");
                                String nombre = lectura.next();
                                System.out.println("Año de creacion");
                                System.out.println("año");
                                int año = lectura.nextInt();
                                System.out.println("mes");
                                int mes = lectura.nextInt();
                                System.out.println("dia");
                                int dia = lectura.nextInt();
                                Date gc = new Date(dia, mes, año);
                                System.out.println("Campo al que se dedican: ");
                                String campo = lectura.nextLine();
                                int resp = 0;
                                ArrayList<String> Tecnologias = new ArrayList();
                                while (resp != 1) {
                                    System.out.println("Ingrese 1 de las tecnologias desarrolladas: ");
                                    String tecDesarrollada = lectura.nextLine();
                                    Tecnologias.add(tecDesarrollada);
                                    System.out.println("¿Desea ingresar otra tecnologia desarrollada? (1 = SI // 2 = NO): ");
                                    resp = lectura.nextInt();

                                }
                                divTec.add(new DivisionTec(nombre, gc, campo, Tecnologias));
                            }

                            if (opcion == 2) {
                                String salida = "";
                                for (Object t : divTec) {
                                    if (t instanceof DivisionTec) {
                                        salida += divTec.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                System.out.println(salida);
                            }

                            if (opcion == 3) {
                                System.out.println("Seleccione numero de lista");
                                int op = lectura.nextInt();
                                System.out.println("Seleccione variable a cambiar\n"
                                        + "   0. Nombre;\n"
                                        + "   1. Año de creacion\n"
                                        + "   2. Campo al que se dedican\n"
                                        + "   3. Tecnologia desarrollada\n");
                                int variable = lectura.nextInt();
                                if (divTec.get(op) instanceof DivisionTec) {
                                    if (variable == 2) {
                                        System.out.println("Campo al que se dedican");
                                        ((DivisionTec) divTec.get(op)).setCampo(lectura.next());
                                    }

                                }
                                if (variable == 0) {
                                    System.out.println("Cambio de nombre");
                                    ((DivisionTec) divTec.get(op)).setNombre(lectura.next());
                                }
                                if (variable == 1) {
                                    System.out.println("Cambio de año");
                                    System.out.println("Año");
                                    int años = lectura.nextInt();
                                    System.out.println("Mes");
                                    int mes = lectura.nextInt();
                                    System.out.println("Dia");
                                    int dia = lectura.nextInt();
                                    Date año = new Date(años, mes, dia);
                                    ((DivisionTec) divTec.get(op)).setDate(año);

                                }
                                if (variable == 3) {
                                      System.out.println("cambio empleados");
                                }

                            }
                            if (opcion == 4) {
                                System.out.println("Ingrese la posicion de la division tecnologica a elimnar: ");
                                int p = lectura.nextInt();

                                if (divTec.get(p) instanceof DivisionTec) {
                                    divTec.remove(p);
                                } else {
                                    System.out.println("La posicion es incorrecta");
                                }

                            }
                        }
                    }
                }
                break;
                case 6: {

                }
            }
        }

    }

}
