package Challenges.ConversorDeMoneda;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class OpcionesDeUnidades {
    private String unid = "";
    private String[] unidades = {"Centimetros a Milimetros", "Centimetros a Metros", "Centimetros a Kilometros", "Milimetros a Centimetros", "Metros a Centimetros",
            "Metros a Milimetros", "Kilometros a Centimetros", "Kilometros a Metros", "Milimetros a Metros"};
    private JLabel seleccione = new JLabel("Elige la moneda a la que deseas convertir");
    private String unidad = (String) JOptionPane.showInputDialog(null, seleccione,"Unidades", JOptionPane.DEFAULT_OPTION,null, unidades, null);

    private double unidEscrito = EntradaDeUnidades.getUnidades();

    public double redondear(double v){
        BigDecimal decimal = new BigDecimal(v);
        decimal = decimal.setScale(8, RoundingMode.HALF_UP);
        return decimal.doubleValue();
    }
    public OpcionesDeUnidades(){
        if (unidad != null){

            switch (unidad) {
                case "Centimetros a Milimetros" -> {
                    unidEscrito *= 10;
                    unid = "Milimetros";
                }
                case "Centimetros a Metros" -> {
                    unidEscrito /= 100;
                    unid = "Metros";
                }
                case "Centimetros a Kilometros" -> {
                    unidEscrito /= 100000;
                    unid = "Kilometros";
                }
                case "Milimetros a Centimetros" -> {
                    unidEscrito /= 10;
                    unid = "Centimetros";
                }
                case "Metros a Centimetros" -> {
                    unidEscrito *= 100;
                    unid = "Centimetros";
                }
                case "Metros a Milimetros" -> {
                    unidEscrito *= 1000;
                    unid = "Milimetros";
                }
                case "Kilometros a Centimetros" -> {
                    unidEscrito *= 100000;
                    unid = "Centimetros";
                }
                case "Milimetros a Metros" -> {
                    unidEscrito /= 1000;
                    unid = "Metros";
                }

                case "Kilometros a Metros" -> {
                    unidEscrito *= 1000;
                    unid = "Metros";
                }

            }
            JOptionPane.showMessageDialog(null,"Tienes " + redondear(unidEscrito) + " " + unid);
            new DeseaContinuar();
        }

    }
}
