package entidad;

public class CadenaFibonacci extends SecuenciaFibonacci {

    private String cadenaFuzzBuzz;

    public CadenaFibonacci() {
    }

    public CadenaFibonacci(String cadenaFuzzBuzz) {
        this.cadenaFuzzBuzz = cadenaFuzzBuzz;
    }

    public String getCadenaFuzzBuzz() {
        return cadenaFuzzBuzz;
    }

    public void setCadenaFuzzBuzz(String cadenaFuzzBuzz) {
        this.cadenaFuzzBuzz = cadenaFuzzBuzz;
    }

    @Override
    public String toString() {
        return "" + cadenaFuzzBuzz + "";
    }

}
