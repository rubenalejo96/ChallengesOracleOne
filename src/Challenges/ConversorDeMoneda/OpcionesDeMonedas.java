package Challenges.ConversorDeMoneda;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class OpcionesDeMonedas {
    private String mon = "";
    private String[] monedas = {"Soles a Dólar", "Soles a Euro", "Soles a Libras Esterlinas", "Soles a Yen Japonés", "Soles a Won Sur-Coreano",
                        "Dólar a Soles", "Euro a Soles", "Libras Esterlinas a Soles", "Yen Japonés a Soles", "Won Sur-Coreano a Soles"};
    private JLabel seleccione = new JLabel("Elige la moneda a la que deseas convertir");
    private String moneda = (String) JOptionPane.showInputDialog(null, seleccione,"Monedas", JOptionPane.DEFAULT_OPTION,null, monedas, null);

    private double valorEscrito = EntradaDeValor.getValor();;

    public double redondear(double v){
        BigDecimal decimal = new BigDecimal(v);
        decimal = decimal.setScale(2, RoundingMode.HALF_UP);
        return decimal.doubleValue();
    }
    public OpcionesDeMonedas() {
        if (moneda != null){

            switch (moneda) {
                case "Soles a Dólar" -> {
                    valorEscrito *= 0.28;
                    mon = "Dolares";
                }
                case "Soles a Euro" -> {
                    valorEscrito *= 0.25;
                    mon = "Euros";
                }
                case "Soles a Libras Esterlinas" -> {
                    valorEscrito *= 0.22;
                    mon = "Libras Esterlinas";
                }
                case "Soles a Yen Japonés" -> {
                    valorEscrito *= 39.58;
                    mon = "Yen Japonés";
                }
                case "Soles a Won Sur-Coreano" -> {
                    valorEscrito *= 359.14;
                    mon = "Won Sur-Coreano";
                }
                case "Dólar a Soles" -> {
                    valorEscrito *= 3.58;
                    mon = "Soles";
                }
                case "Euro a Soles" -> {
                    valorEscrito *= 3.99;
                    mon = "Soles";
                }
                case "Libras Esterlinas a Soles" -> {
                    valorEscrito *= 4.61;
                    mon = "Soles";
                }
                case "Yen Japonés a Soles" -> {
                    valorEscrito *= 0.025;
                    mon = "Soles";
                }
                case "Won Sur-Coreano a Soles" -> {
                    valorEscrito *= 0.0028;
                    mon = "Soles";
                }



            }
            JOptionPane.showMessageDialog(null,"Tienes " + redondear(valorEscrito) + " " + mon );
            new DeseaContinuar();
        }
    }

}
