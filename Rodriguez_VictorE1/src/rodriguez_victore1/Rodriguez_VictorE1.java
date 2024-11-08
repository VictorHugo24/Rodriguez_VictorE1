/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodriguez_victore1;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Rodriguez_VictorE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0;

        do {
            System.out.println("1) PIRAMIDE");
            System.out.println("2) MAYOR");
            System.out.println("3) CANAL");
            System.out.println("4) CARACTERES VOCALES");
            System.out.println("5) SALIR");
            System.out.print("Favor ingrese una opcion: ");
            op = scanner.nextInt();
            scanner.nextLine(); 

            switch (op) {
                case 1:
                  
                    System.out.println("****PIRAMIDE****");
                    System.out.print("Ingrese una cantidad de filas: ");
                    int numeroFilas = scanner.nextInt();
                    scanner.nextLine(); 

                    int numero = 0;
                    for (int filas = 1; filas <= numeroFilas; filas++) {
                        int sumaLinea = 0;
                        for (int espacio = 0; espacio < filas; espacio++) {
                            System.out.print(numero + " ");
                            sumaLinea += numero;
                            numero += 2;
                        }
                        System.out.println("= " + sumaLinea);
                    }
                    break;

                case 2:
               
                    System.out.println("***** MAYOR *****");
                    boolean continuar = true;
                    int mayor = 0;
                    int suma = 0;
                    int cantidadNumeros = 0;

                    while (continuar) {
                        System.out.println("¿Desea ingresar un número? (si/no): ");
                        String respuesta = scanner.nextLine().toLowerCase();

                        if (respuesta.equals("si")) {
                            System.out.println("Ingrese el número: ");
                            int numeroIngresado = scanner.nextInt();
                            scanner.nextLine(); 

                            if (numeroIngresado > mayor) {
                                mayor = numeroIngresado;
                            }
                            suma += numeroIngresado;
                            cantidadNumeros++;
                        } else if (respuesta.equals("no")) {
                            continuar = false;
                        } else {
                            System.out.println("Por favor, escriba 'si' o 'no'.");
                        }
                    }

                    if (cantidadNumeros > 0) {
                        double promedio = (double) suma / cantidadNumeros;
                        System.out.println("El número mayor ingresado es: " + mayor);
                        System.out.println("El promedio de los números ingresados es: " + promedio);
                    } else {
                        System.out.println("No se ingresaron números.");
                    }
                    break;

                case 3:
                   
                    System.out.println("****CANAL****");
                    System.out.println("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();

       
                    int totalNormales = 0;
                    int totalHD = 0;
                    boolean continuar2 = true;

       
                    while (continuar2) {
                    System.out.println("Ingrese el tipo de canal (HD o NORMAL): ");
                    String tipoCanal = scanner.nextLine().toUpperCase();
                    
                if (tipoCanal.equals("HD")) {
                totalHD++;
            } else if (tipoCanal.equals("NORMAL")) {
                totalNormales++;
            } else {
                System.out.println("Tipo de canal no válido. Intente de nuevo.");
                continue; 
            }

            
            System.out.println("¿Desea agregar otro canal? (SI/NO): ");
            String respuesta = scanner.nextLine().toUpperCase();
            if (!respuesta.equals("SI")) {
                continuar2 = false; 
            }
        }

        
        System.out.println("Ingrese el tipo de caja digital (LIGHTBOX, HDBOX, DVRBOX): ");
        String tipoCaja = scanner.nextLine().toUpperCase();

        int costoCaja = 0;
        switch (tipoCaja) {
            case "LIGHTBOX":
                costoCaja = 50;
                break;
            case "HDBOX":
                costoCaja = 100;
                break;
            case "DVRBOX":
                costoCaja = 150;
                break;
            default:
                System.out.println("Tipo de caja no válido. Se asumirá LIGHTBOX por defecto.");
                costoCaja = 50;
        }

      
        int costoCanalNormal = 20;
        int costoCanalHD = 30; 
        int subtotal = (totalNormales * costoCanalNormal) + (totalHD * costoCanalHD) + costoCaja;

        
        double impuesto = subtotal * 0.15; 
        double total = subtotal + impuesto;

       
        System.out.println("***** DETALLE DE SERVICIO *****");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Total canales normales: " + totalNormales);
        System.out.println("Total canales HD: " + totalHD);
        System.out.println("Tipo de caja digital: " + tipoCaja);
        System.out.println("Costo de la caja: " + costoCaja + " Lps");
        System.out.println("Subtotal: " + subtotal + " Lps");
        System.out.println("Impuesto (15%): " + impuesto + " Lps");
        System.out.println("Total a pagar: " + total + " Lps");
                    
                    break;

                case 4:
                    
                    System.out.println("*CARACTERES VOCALES*");
                    System.out.println("Ingrese una cadena de texto (solo minúsculas): ");
                   String cadena = scanner.nextLine();

        int contadorVocales = 0; 

       
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i); 

           
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }

       
        System.out.println("La cantidad de vocales en la cadena es: " + contadorVocales);
                    
                    break;

                case 5:
                
                    System.out.println("Hasta luego!");
                    break;

                default:
               
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (op != 5);

    
    }
}
      
    
    

