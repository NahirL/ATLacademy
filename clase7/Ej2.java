package clase7;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        //Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.

        int[] numeros = new int[5];
        Scanner cargaDatos = new Scanner(System.in);

        for (int cont = 0; cont < numeros.length; cont++){
            System.out.println("Ingrese un número: ");
            int num = cargaDatos.nextInt();
            numeros[cont] = num;
        }

        int menor = 0;
        int mayor = 0;

        for (int cont = 0; cont < numeros.length; cont++){
            int num = numeros[cont];
            if (num > mayor || cont == 0) {
                mayor = num;
            }
            if (num < menor || cont == 0) {
                menor = num;
            }
        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
