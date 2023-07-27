package clase6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Clase6 {
    public static void main(String[] args) {

        //1)Ejercicio-1

        /*
        System.out.println("Ingrese un país");

        Scanner cargaDatos = new Scanner(System.in);
        String pais = cargaDatos.nextLine();

        System.out.println("https://www.google.com/maps/search/" + pais);

         */

        //Ejercicio-2

        /*
        System.out.println("Ingrese el nombre de una celebridad");

        Scanner cargaDatos = new Scanner(System.in);
        String celebridad = cargaDatos.nextLine();

        System.out.println("https://twitter.com/search?q=" + celebridad);

         */

        //Ejercicio-3
        /*
        System.out.println("Ingrese un número de télefono sin espacios");
        Scanner cargaDatos = new Scanner(System.in);
        Long telefono = cargaDatos.nextLong();
        //String telefono = cargaDatos.nextLine();
        System.out.println("https://api.whatsapp.com/send?phone=" + telefono);

         */

        //Ejercicio-4

                Scanner scanner = new Scanner(System.in);
                Random random  = new Random();

                //Se genera seleccion aleatoria de la pc
                Integer opcionComputadora = random.nextInt(3);

                //Opciones de Juego y posibles combinaciones
                String[] opciones = {"Piedra", "Papel", "Tijera"};
                String[] ganaPiedra = {"Piedra", "Tijera"};
                String[] ganaPapel = {"Papel", "Piedra"};
                String[] ganaTijera = {"Tijera", "Papel"};

                //Usuario escoge opcion de juego
                System.out.println("1) Piedra, 2) Papel o 3) Tijera");
                System.out.println("Ingresa el numero de la opcion que quieres");
                Integer opcionUsuario = scanner.nextInt();

                //Se crea un arreglo con la opcion del usuario y de la pc y se muestran
                String[] resultado = {opciones[opcionUsuario-1],opciones[opcionComputadora]};
                String[] resultadoInvertido = {opciones[opcionComputadora],opciones[opcionUsuario-1]};

                System.out.println("Usuario elige: " + resultado[0]);
                System.out.println("Computadora elige: " + resultado[1]);

                //Compara arreglos resultantes de las opciones elegidas, contra los arreglos de posibilidades
                String mensaje = "";

                //Gana Usuario
                if (Arrays.equals(ganaPiedra, resultado)) mensaje = "Ganaste, opcion Piedra";
                if (Arrays.equals(ganaPapel, resultado)) mensaje = "Ganaste, opcion Papel";
                if (Arrays.equals(ganaTijera, resultado)) mensaje = "Ganaste, opcion Tijera";

                //Gana PC
                if (Arrays.equals(ganaPiedra, resultadoInvertido)) mensaje = "Perdiste, gana Piedra";
                if (Arrays.equals(ganaPapel, resultadoInvertido)) mensaje = "Perdiste, gana Papel";
                if (Arrays.equals(ganaTijera, resultadoInvertido)) mensaje = "Perdiste, gana Tijera";

                //Empate
                if(mensaje=="") mensaje = "Ha Sido un Empate!";

                System.out.println(mensaje);

        //Ejercicio5
        /*
        System.out.println("Ingrese el primer número: ");
        Scanner cargaDatos = new Scanner(System.in);

        Double n1 = cargaDatos.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        Double n2 = cargaDatos.nextDouble();
        System.out.println("Ingrese el tercer número: ");
        Double n3 = cargaDatos.nextDouble();

        Double promedio = (n1 + n2 + n3)/3;
        System.out.println("El promedio de los 3 números ingresados es: " + promedio);
        */

        //Ejercicio6

        /*
        Scanner cargaDatos = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        Integer n1 = cargaDatos.nextInt();
        System.out.println("Ingrese el segundo número: ");
        Integer n2 = cargaDatos.nextInt();
        System.out.println("Ingrese el tercer número: ");
        Integer n3 = cargaDatos.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println("El número " + n1 + " es el mayor");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("El número " + n2 + " es el mayor");
        } else {
            System.out.println("El número " + n3 + " es el mayor");
        }

        */

        //Ejercicio7
        /*
        int num = 0;

        while (num <= 100){
            System.out.println(num);
            num++;
        }
        */
    }
}



