package servicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import entidad.CadenaFibonacci;
import entidad.NumeroFibonacci;
import entidad.SecuenciaFibonacci;

public class GestorFibonacciImplement implements GestorFinobacci {

    // declaraciones globales
    ArrayList<SecuenciaFibonacci> numerosFibonacci = new ArrayList<>();
    ArrayList<SecuenciaFibonacci> numerosCasteados = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public int funcionSecuencia(int n) {
        // hago esto para que me pueda retornar los primeros números de la secuencia,
        // porque de lo contrario entra en un bucle infinito

        if (n == 0) {
            return 0;

        } else if (n == 1) {
            return 1;

        } else {
            // Aquí, entonces, se representan los dos números anteriores de la secuencia que
            // retorné en los if... //sumará 0 + 1 en la primera ronda,
            // y así, bellamente :) la n no representa el número de la i en un for int (eso
            // me confundía mucho), sino la propia función recursiva.
            /*
             * Por ejemplo, si queremos calcular el número en la posición 5 de la secuencia,
             * necesitamos sumar el número en la posición 4
             * y el número en la posición 3. Esto se representa en la llamada recursiva como
             * funcionSecuencia(5 - 1) + funcionSecuencia(5 - 2),
             * que se traduce a funcionSecuencia(4) + funcionSecuencia(3). Entonces, en cada
             * llamada recursiva, n se reduce en 1 para obtener
             * el número anterior en la secuencia (funcionSecuencia(n - 1)), y n se reduce
             * en 2 para obtener el número anterior al anterior en la secuencia
             * (funcionSecuencia(n - 2)). Por ejemplo, si queremos calcular el número en la
             * posición 5 de la secuencia, necesitamos sumar el número en
             * la posición 4 y el número en la posición 3. Esto se representa en la llamada
             * recursiva como funcionSecuencia(5 - 1) + funcionSecuencia(5 - 2),
             * que se traduce a funcionSecuencia(4) + funcionSecuencia(3). Así, en cada
             * llamada recursiva, n se reduce en 1 para obtener el número anterior
             * en la secuencia (funcionSecuencia(n - 1)), y n se reduce en 2 para obtener el
             * número anterior al anterior en la secuencia (funcionSecuencia(n - 2)).
             */
            return funcionSecuencia(n - 1) + funcionSecuencia(n - 2);
        }
    }

    @Override
    public void crearSecuencia(int limiteFibonacci) {

        for (int i = 0; i <= limiteFibonacci; i++) {
            // Crear una nueva instancia de NumeroFibonacci en cada iteración
            NumeroFibonacci numeroFibonacci = new NumeroFibonacci();

            // llamo a la funcion recursiva
            int numeroSecuencia = (funcionSecuencia(i));

            // guardo la secuencia en mi array llamando a la función a cargo
            guardarSecuencia(numeroFibonacci, numeroSecuencia);

            // para que el ciclo pare cuando llegue al límite numérico
            if (funcionSecuencia(i) >= limiteFibonacci) {
                i = (funcionSecuencia(i));
            }

        }
    }

    @Override
    public void pedirSecuenciaAlUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número límite para su secuencia Fibonacci");
        int numLimite = scanner.nextInt();
        crearSecuencia(numLimite);

    }

    @Override
    public void guardarSecuencia(NumeroFibonacci numeroFibonacci, int n) {
        numeroFibonacci.setNumFibonacci(n);
        numerosFibonacci.add(numeroFibonacci);
    }

    @Override
    public void identificarNumerosFizzBuzz() {
        pedirSecuenciaAlUsuario();
        for (SecuenciaFibonacci secuenciaFibonacci : numerosFibonacci) {
            NumeroFibonacci numeroFibonacci = (NumeroFibonacci) secuenciaFibonacci;
            if (numeroFibonacci.getNumFibonacci() % 3 == 0 &&
                    numeroFibonacci.getNumFibonacci() % 5 != 0 &&
                    numeroFibonacci.getNumFibonacci() != 0) {
                numeroFibonacci.setNumFibonacci(3);
            }
            if (numeroFibonacci.getNumFibonacci() % 5 == 0 &&
                    numeroFibonacci.getNumFibonacci() % 3 != 0 &&
                    numeroFibonacci.getNumFibonacci() != 0) {
                numeroFibonacci.setNumFibonacci(5);
            }
            if (numeroFibonacci.getNumFibonacci() % 3 == 0 &&
                    numeroFibonacci.getNumFibonacci() % 5 == 0 &&
                    numeroFibonacci.getNumFibonacci() != 0) {
                numeroFibonacci.setNumFibonacci(-35);
            }
        }
    }

    @Override
    public void contarFizzBuzz() {
        int contador = 0;

        for (SecuenciaFibonacci secuenciaFibonacci : numerosCasteados) {
            CadenaFibonacci cadenaFibonacci = (CadenaFibonacci) secuenciaFibonacci;
            if (cadenaFibonacci.getCadenaFuzzBuzz().equalsIgnoreCase("fizz")) {
                contador += 1;
            } else if (cadenaFibonacci.getCadenaFuzzBuzz().equalsIgnoreCase("buzz")) {
                contador += 1;
            } else if (cadenaFibonacci.getCadenaFuzzBuzz().equalsIgnoreCase("fizzbuzz")) {
                contador += 1;
            }
        }
        System.out.println(
                "La cantidad de números reemplazados por 'Fizz', 'Buzz' o 'FizzBuzz' es de: " + contador + " veces.");
    }

    @Override
    public void castearSecuenciaAlfaNumerica() {
        identificarNumerosFizzBuzz();
        for (SecuenciaFibonacci secuenciaFibonacci : numerosFibonacci) {
            /*
             * HAY QUE casterar "secuenciaFibonacci" como un NumeroFibonacci, ¿para qué?
             * para poder tratarlo como un objeto del tipo NumeroFibonacci...
             * Pero para qué, si lo que quiero es transformarlo a un objeto CadenaFibonacci?
             * justamente, para transformarlo a cadena necesito usar la clase
             * Integer.toString
             * y para usar esa clase, necesito asegurarme de que secuenciaFibonacci sea un
             * NumeroFibonacci
             * que tiene como atributo un Integer :) GRACIAS, vuelva prontos
             */

            // casteo
            NumeroFibonacci numeroFibonacci = (NumeroFibonacci) secuenciaFibonacci;
            // instancio un objeto en cada bucle para que se vaya guardando en el arreglo
            CadenaFibonacci cadenaFibonacci = new CadenaFibonacci();
            // seteo el objeto CadenaFibonacci con el contenido de NumeroFigonacci casteado
            // gracias a Integer
            cadenaFibonacci.setCadenaFuzzBuzz(Integer.toString(numeroFibonacci.getNumFibonacci()));
            // lo agrego a mi nuevo arreglo de numerosCasteados :)
            numerosCasteados.add(cadenaFibonacci);

        }
    }

    @Override
    public void mostrarSecuenciaAlfanumerica() {
        castearSecuenciaAlfaNumerica();
        System.out.println("Así se ve su secuencia alfanumérica:");
        for (SecuenciaFibonacci secuenciaFibonacci : numerosCasteados) {
            CadenaFibonacci cadenaFibonacci = (CadenaFibonacci) secuenciaFibonacci;

            if (cadenaFibonacci.getCadenaFuzzBuzz().contains("-35") ||
                    (cadenaFibonacci.getCadenaFuzzBuzz().contains("3") &&
                            cadenaFibonacci.getCadenaFuzzBuzz().contains("5"))) {
                cadenaFibonacci.setCadenaFuzzBuzz("FizzBuzz");
            }
            if (cadenaFibonacci.getCadenaFuzzBuzz().contains("3")) {
                cadenaFibonacci.setCadenaFuzzBuzz("Fizz");
            }
            if (cadenaFibonacci.getCadenaFuzzBuzz().contains("5")) {
                cadenaFibonacci.setCadenaFuzzBuzz("Buzz");
            }

            System.out.println(cadenaFibonacci.toString());
        }
        contarFizzBuzz();
        guardarEnArchivoSecuencia();
    }

    @Override
    public void guardarEnArchivoSecuencia() {
        File file = new File("fibonacci_fizzbuzz.txt");
        try {
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            for (SecuenciaFibonacci secuenciaFibonacci : numerosCasteados) {
                CadenaFibonacci cadenaFibonacci = (CadenaFibonacci) secuenciaFibonacci;
                bufferedWriter.write(cadenaFibonacci.toString());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("El archivo se creó con éxito");
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

}