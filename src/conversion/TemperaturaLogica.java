package conversion;

import static constante.TemperaturaEntero.*;



public class TemperaturaLogica extends Temperatura
{

    public double  calcularTemperaturaFarenheit()
    {
        return (this.getCentigrados()* NUEVE.getValor() / CINCO.getValor())+  TREINTAYDOS.getValor();
    }


}
