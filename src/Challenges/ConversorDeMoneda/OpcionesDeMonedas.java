package Challenges.ConversorDeMoneda;

import javax.swing.*;


public class OpcionesDeMonedas {
    String[] monedas = {"Soles a Dólar", "Soles a Euro", "Soles a Libras Esterlinas", "Soles a Yen Japonés", "Soles a Won Sur-Coreano",
                        "Dólar a Soles", "Euro a Soles", "Libras Esterlinas a Soles", "Yen Japonés a Soles", "Won Sur-Coreano a Soles"};
    JLabel seleccione = new JLabel("Elige la moneda a la que deseas convertir tu moneda");

    int valorEscrito = 0;
    public OpcionesDeMonedas() {
        String moneda = (String) JOptionPane.showInputDialog(null, seleccione,"Monedas", JOptionPane.DEFAULT_OPTION,null, monedas, null);
        valorEscrito = EntradaDeValor.getValor();
        JOptionPane.showMessageDialog(null,valorEscrito );
    }

}
