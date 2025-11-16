/**
 * Clase Secundaria: CalculadoraFactorial
 * -------------------------------------
 * Contiene el método para calcular el factorial de un número.
 *
 * Nombre del Alumno: [Reemplazar con el nombre del alumno]
 * Fecha de Compilación: [dd/mm/yyyy]
 */
public class CalculadoraFactorial {

    /**
     * Método para calcular el factorial de un número entero no negativo.
     * Utiliza el tipo 'long' para manejar números factoriales grandes (hasta 13! y más)
     * sin riesgo de desbordamiento (overflow).
     *
     * @param numero El número entero del cual se calculará el factorial (entre 1 y 13).
     * @return El factorial del número dado como un valor long.
     */
    public long factorial(int numero) {
        // Comprobación de caso base: El factorial de 0 o 1 es 1.
        if (numero <= 1) {
            return 1;
        }

        // Inicializamos el resultado como 'long' con el valor base 1.
        long resultado = 1;

        // Bucle for para realizar la multiplicación iterativa: n * (n-1) * ... * 2
        // Este bucle implementa la definición matemática del factorial.
        for (int i = 2; i <= numero; i++) {
            resultado = resultado * i;
        }

        return resultado;
    }
}