public class Fraccionario {
    private int numerador;
    private int denominador;

    public Fraccionario(int numerador, int den) {
        this.numerador = numerador;
        if (den != 0) {
            this.denominador = den;
        } else {
            throw new IllegalArgumentException("El denominador no puede ser cero");
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int den) {
        if (den != 0) {
            this.denominador = den;
        } else {
            throw new IllegalArgumentException("El denominador no puede ser cero");
        }
    }

   
}