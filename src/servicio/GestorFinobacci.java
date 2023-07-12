package servicio;

import entidad.NumeroFibonacci;

public interface GestorFinobacci {
    // función recursiva
    public int funcionSecuencia(int n);

    // llama a funcionSecuencia y guardarSecuencia
    public void crearSecuencia(int nunLimite);

    // le pide al usuario el numero limite
    public void pedirSecuenciaAlUsuario();

    // guarda la secuencia numerica en un array <SecuenciaFibonacci>
    public void guardarSecuencia(NumeroFibonacci numeroFibonacci, int n);

    // identifica las operaciones matemáticas para el fizzbuzz
    public void identificarNumerosFizzBuzz();

    // me castea el array <SecuenciaFibonacci> con números y los pasa a cadenas
    public void castearSecuenciaAlfaNumerica();

    // muestra el arrey casteado completando las reglas de FizzBuzz que con Integer
    // no podían hacerse
    // (como "contiene 3" o "contiene 5")
    public void mostrarSecuenciaAlfanumerica();

    public void contarFizzBuzz();

    public void guardarEnArchivoSecuencia();
}
