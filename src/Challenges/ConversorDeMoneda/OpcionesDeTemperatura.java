package Challenges.ConversorDeMoneda;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class OpcionesDeTemperatura {
    private String[] temperaturas = {"Celsius a Kelvin", "Celcius a Fahrenheit", "Kelvin a Celcius",
            "Kelvin a Fahrenheit", "Fahrenheit a Celcius", "Fahrenheit a Kelvin"};
    private JLabel contenido = new JLabel("Elige la Temperatura a la que deseas convertir");
    private String temperatura = (String) JOptionPane.showInputDialog(null, contenido,"Temperaturas", JOptionPane.DEFAULT_OPTION,null, temperaturas, null);
    private double tempEscrito = EntradaDeTemperatura.getTemperatura();
    private String temp = "";

    public double redondear(double v){
        BigDecimal decimal = new BigDecimal(v);
        decimal = decimal.setScale(2, RoundingMode.HALF_UP);
        return decimal.doubleValue();
    }
    public OpcionesDeTemperatura() {
        if (temperatura != null){
            switch (temperatura){
                case "Celsius a Kelvin" -> {
                    tempEscrito += 273.15;
                    temp = "Kelvin";
                }

                case "Celcius a Fahrenheit" -> {
                    tempEscrito = (tempEscrito*1.8) + 32;
                    temp = "grados Fahrenheit";
                }

                case "Kelvin a Celcius" -> {
                    tempEscrito = tempEscrito - 273.15;
                    temp = "grados Celcius";
                }

                case "Kelvin a Fahrenheit" -> {
                    tempEscrito = ((tempEscrito -273.15)*1.8)+32;
                    temp = "grados Fahrenheit";
                }

                case "Fahrenheit a Celcius" -> {
                    tempEscrito = (tempEscrito - 32)*(5.0/9.0);
                    temp = "grados Celcius";
                }

                case "Fahrenheit a Kelvin" -> {
                    tempEscrito = ((tempEscrito-32)*(5.0/9.0))+273.15;
                    temp = "Kelvin";
                }
            }

            JOptionPane.showMessageDialog(null,"Tienes " + redondear(tempEscrito) + " " + temp );
            new DeseaContinuar();
        }

    }
}
