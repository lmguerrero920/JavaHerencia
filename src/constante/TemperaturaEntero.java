package constante;

public enum TemperaturaEntero {


    CERO(0),
    NUEVE(9),
    CINCO(5),
    TREINTAYDOS(32)
    ;



    public int getValor() {
        return valor;
    }

    private int valor;

    TemperaturaEntero(int i) {

        this.valor=i;
    }
}
