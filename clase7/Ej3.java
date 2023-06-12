package clase7;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        //Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5,
        // ya que el usuario agregó 5 números

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

        int sum = 0;

        for (int cont = 0; cont < numeros.length; cont++){
            int num = numeros[cont];
            sum += num;
        }

        System.out.println("La suma de los números ingresados es: " + sum);
        float promedio = (float) sum / numeros.length;
        System.out.println("El promedio de los números ingresados es: " + promedio);
    }
}
