package entidad;

public class NumeroFibonacci extends SecuenciaFibonacci {
    private Integer numFibonacci;

    public NumeroFibonacci() {

    }

    public NumeroFibonacci(Integer numFibonacci) {
        this.numFibonacci = numFibonacci;
    }

    public Integer getNumFibonacci() {
        return numFibonacci;
    }

    public void setNumFibonacci(Integer numFibonacci) {
        this.numFibonacci = numFibonacci;
    }
}
