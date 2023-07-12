import servicio.GestorFibonacciImplement;

public class PruebaTecnica {
    public static void main(String[] args) throws Exception {
        /*
         * Genere la secuencia de Fibonacci hasta un número dado por el usuario y guarde
         * los resultados en un archivo de texto.
         * 
         * 1. Si un número en la secuencia es divisible por 3 o contiene el dígito 3, se
         * debe reemplazar ese número por la palabra "Fizz".
         * 2. Si un número en la secuencia es divisible por 5 o contiene el dígito 5, se
         * debe reemplazar por la palabra "Buzz".
         * 3. Si un número en la secuencia es divisible por 3 y por 5 o contiene ambos
         * dígitos (3 y 5), se debe reemplazar por la palabra "FizzBuzz".
         * El programa debe cumplir con los siguientes requisitos adicionales:
         * 
         * 1. Solicitar al usuario un número máximo para generar la secuencia de
         * Fibonacci.
         * 2. Generar la secuencia de Fibonacci hasta ese número.
         * 3. Aplicar las reglas de FizzBuzz mencionadas anteriormente a cada número de
         * la secuencia generada.
         * 4. Guardar los resultados en un archivo de texto llamado
         * "fibonacci_fizzbuzz.txt", donde cada número o palabra estará en una línea
         * diferente.
         * 5. Manejar adecuadamente las excepciones en caso de errores de lectura o
         * escritura de archivos.
         * 6. Implementar una función adicional para contar y mostrar la cantidad de
         * números reemplazados por "Fizz", "Buzz" o "FizzBuzz".
         * 7. Utilizar un método recursivo para generar la secuencia de Fibonacci.
         * 8. Agregar comentarios al código para explicar la lógica detrás de cada
         * sección importante.
         */
        GestorFibonacciImplement gestor = new GestorFibonacciImplement();
        gestor.mostrarSecuenciaAlfanumerica();
    }
}
