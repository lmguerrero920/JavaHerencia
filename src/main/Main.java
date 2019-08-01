package main;

import conversion.TemperaturaLogica;

import javax.swing.*;

import static constante.TemperaturaStrings.*;

public class Main
{

    public static void main(String[] args)
    {

        TemperaturaLogica temperaturaLogica  = new TemperaturaLogica();

        String valorTemperatura = JOptionPane.showInputDialog(null, MENSAJE_PETICION);


         temperaturaLogica.setCentigrados(Double.parseDouble(valorTemperatura));

         JOptionPane.showMessageDialog(null,MENSAJE_CONVERSION.getMensaje()+ temperaturaLogica.getCentigrados()+ MENSAJE_CENTIGRADOS_FARENHEIT.getMensaje()+
         temperaturaLogica.calcularTemperaturaFarenheit());
    }


}
