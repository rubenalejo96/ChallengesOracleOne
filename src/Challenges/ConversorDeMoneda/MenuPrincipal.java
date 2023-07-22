package Challenges.ConversorDeMoneda;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal {
    private String[] opciones = {"Conversion de Moneda", "Conversor de Temperatura", "Conversor de Grados a Rad"};
    private JLabel seleccione = new JLabel("Seleccione una opción de conversión");
    private String opcion = (String) JOptionPane.showInputDialog(null, seleccione, "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, null);

    public MenuPrincipal(){
        if (opcion != null){
            switch (opcion) {
                case "Conversion de Moneda" -> {
                    new EntradaDeValor();
                }
                case "Conversor de Temperatura" -> {
                    new EntradaDeTemperatura();
                }
                case "Conversor de Grados a Rad" -> {
                    JOptionPane.showMessageDialog(null, "Por Ahora no disponible");
                    new MenuPrincipal();
                }

            }
        }else {
            JOptionPane.showMessageDialog(null, "Programa Finalizado", "Adios", JOptionPane.WARNING_MESSAGE);
        }
    }
}
