/**
 * Clase Secundaria: CalculadoraFactorial
 * -------------------------------------
 * Contiene el método para calcular el factorial de un número.
 *
 * Nombre del Alumno: Alejandro Rafael Mendoza Ortega
 * Fecha de Compilación: 12/11/2025
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    /**
     * Método para calcular el factorial de un número entero no negativo.
     * Utiliza el tipo 'long' para manejar números factoriales grandes (hasta 13! y más)
     * sin riesgo de desbordamiento (overflow).
     *
     * @param numero El número entero del cual se calculará el factorial (entre 1 y 13).
     * @return El factorial del número dado como un valor long.
     */

    public static void main(String[] args) {
        // Objeto Scanner para leer la entrada del usuario desde la consola.
        CalculadoraFactorial calc = new CalculadoraFactorial();
        // Objeto de la clase secundaria para realizar el cálculo.
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Ingreso del 1 al 13 con cálculo inmediato ---");
        System.out.println("--------------------------------------------------");

        // El usuario debe ingresar del 1 al 13
        for (int i = 1; i <= 13; i++) {

            while (true) {
                System.out.print("Ingrese el número " + i + ": ");

                try {
                    int numero = scanner.nextInt();

                    // Debe ser EXACTAMENTE el número esperado
                    if (numero == i) {

                        // Calcular factorial inmediatamente
                        long factorial = calc.factorial(i);
                        System.out.println("✔ Correcto. Factorial de " + i + " = " + factorial + "\n");

                        break; // Pasamos al siguiente número
                    } else {
                        System.out.println("❌ Error: Debe ingresar el número " + i + ". Intente nuevamente.\n");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("⚠️ Error: Ingrese SOLO números enteros.\n");
                    scanner.nextLine(); // Limpiar buffer
                }
            }
        }

        // Muestra el resultado al momento de ingresar el número correcto.
        System.out.println("--------------------------------------------------");
        System.out.println("Proceso completado. Se calcularon los 13 factoriales.");
    }
}

