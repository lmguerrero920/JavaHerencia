package constante;

public enum TemperaturaStrings {

    MENSAJE_PETICION("Ingrese la temperatura en centigrados a ser convertido en Farenheih"),
    MENSAJE_CONVERSION("La conversion de "),
    MENSAJE_CENTIGRADOS_FARENHEIT("°C a Farenheit es ");

    TemperaturaStrings(String s) {
        this.mensaje = s;
    }


    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    private String mensaje;

}
