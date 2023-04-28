/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_gabrielosorto;

import java.util.Scanner;

/**
 *
 * @author Jahir Corrales
 */
public class Lab2P1_GabrielOsorto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean opcion = true;
        while (opcion) { //inicio while
            System.out.println("       -----Menu-----");
            System.out.println("1. Clasificando numeros");
            System.out.println("2. Aproximando PI");
            System.out.println("3. MCD");
            System.out.println("4. Salir");
            System.out.println("    ---Ingrese su opcion---");
            int respuesta = sc.nextInt();
            switch (respuesta) {//inicio switch
                case 1:
                    System.out.println("-----Clasificacion de numeros------");
                    System.out.println("Ingrese un numero:");
                    int num = sc.nextInt();
                    while (num <= 0) { //while validacion
                        System.out.println("Ingrese un numeo positivo:");
                        num = sc.nextInt();
                    } //Final while validacion
                    boolean par = true;
                    boolean primo = true;
                    if (num % 2 != 0) {//inicio if 1
                        par = false;
                    }
                    int cont = 1;
                    int cont_cero = 0;
                    while (cont <= num)//while 2
                    {
                        if (num % cont == 0) //if 1
                        {
                            cont_cero++;
                        } //final if 1
                        cont++;
                    }//final while 2
                    if (cont_cero <= 2) { //if 2
                        primo = true;
                    }
                    System.out.println("" + cont_cero);
                    if ((par == true) && (primo == true)) {
                        System.out.println(num + " es primo y es par");
                    } else if ((par == false) && (primo == true)) {
                        System.out.println(num + " es primo e impar");
                    } else if ((par == true) && (primo == false)) {
                        System.out.println(num + " es par");
                    } else if ((par == false) && (primo == false)) {
                        System.out.println(num + " es impar");
                    }

                    break;//fin case 1

                case 2:
                    System.out.println("-----Aproximando PI-----");
                    System.out.println("Ingrese el valor de x: ");
                    int x = sc.nextInt();
                    int contador = 1;
                    double resultado = 1;
                    double potencia = 0;
                    double ecu2 = 0;
                    double ecu1 = 0;
                    while (contador <= x) {
                        potencia = Math.pow(contador, 2);
                        ecu1 = 4 * potencia;
                        ecu2 = (4 * potencia) - 1;
                        resultado *= ecu1 / ecu2;
                        contador++;
                    }//fin while
                    resultado=resultado*2;
                    System.out.println("Resultado de PI: " + resultado);

                    break;//fin case 2

                case 3:
                    System.out.println("-----MCD-----");
                    System.out.println("Ingrese su numero A:");
                    int numa = sc.nextInt();
                    System.out.println("Ingrese su numero :");
                    int numb = sc.nextInt();
                    int numa2 = numa;
                    int numb2 = numb;
                    if (numa > 0 && (numb > 0)) {
                        while (numa != numb) {
                            if (numa < numb) {
                                numb = numb - numa;
                            } else if (numa > numb) {
                                numa = numa - numb;
                            }

                        }//fi while
                        System.out.println("El MCD de " + numa2 + " y " + numb2 + "es de: " + numa);
                    }//fin if 1
                    break;//fin case 3

                case 4:
                    opcion = false;
                    break;//fin case 4

                default:
                    System.out.println("Opcion no valida");
                    break;//fin default

            }//fin switch

        }//fin while
        // TODO code application logic here
    }
}
