import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1) Calculadora de edad de perros:
        //Pídele al usuario que ingrese la edad de su perro.
        //Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).

        /*
        System.out.println("Ingrese la edad de su perro");
        Scanner cargaDatos = new Scanner(System.in);
        Integer edadPerro = cargaDatos.nextInt();
        Integer edadConvertida = edadPerro * 7;

        System.out.println("La edad de su perro en años de perro es: " + edadConvertida);
        */
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //2) Conversor de millas a kilómetros:
        //Pídele al usuario que ingrese una distancia en millas.
        //Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
        //Muestra la distancia en kilómetros al usuario.

        /*System.out.println("Ingrese una distancia en millas que desee convertir");
        Scanner cargaDatos = new Scanner(System.in);
        double millas = cargaDatos.nextDouble();
        double kilometros = millas * 1.60934;

        System.out.println("El equivalente de las " + millas + " millas en kilometros es: " + kilometros);
        */
        ////////////////////////////////////////////////////////////////////////////////////////////////////////

        //3) Calculadora de descuento:
        //Pídele al usuario que ingrese el precio original de un producto.
        //Pídele al usuario que ingrese el porcentaje de descuento.
        //Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
        //Muestra el precio final al usuario.

        /*Scanner cargaDatos = new Scanner(System.in);

        System.out.println("Ingrese el precio del prodcuto");
        double precioOriginal = cargaDatos.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento");
        double descuento = cargaDatos.nextDouble();

        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);

        System.out.println("El precio con el descuento aplicado es de : " + precioFinal);

         */
        ////////////////////////////////////////////////////////////////////////////////////////////////////////

        //4) Calculadora de propinas:
        //Pídele al usuario que ingrese el total de la cuenta en un restaurante.
        //Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
        //Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).

        Scanner cargaDatos = new Scanner(System.in);

        System.out.println("Ingrese el total de la cuenta");
        double totalCuenta = cargaDatos.nextDouble();

        System.out.println("Ingrese el porcentaje de propina que desea dejar");
        double porcentajePropina = cargaDatos.nextDouble();

        double propina = totalCuenta * (porcentajePropina / 100);

        System.out.println("El monto depropina ha dejar es de : " + propina);
    }
}
