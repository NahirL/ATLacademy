package clase7;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        //Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.

        int[] numeros = new int[5];
        Scanner cargaDatos = new Scanner(System.in);

        int cont = 0;

        do {
            System.out.println("Ingrese un número");
            int num = cargaDatos.nextInt();
            numeros[cont] = num;
            cont++;
        } while(cont < numeros.length);

        int cont1 = 0;
        System.out.println("Los números ingresados son: ");

        do {
            System.out.print(numeros[cont1]);
            cont1++;
        } while(cont1 < numeros.length);


    }
}
