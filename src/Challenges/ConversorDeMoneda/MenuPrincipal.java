package Challenges.ConversorDeMoneda;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal {

    public MenuPrincipal(){
        String[] opciones = {"Conversion de Moneda", "Conversor de Temperatura", "Conversor de Grados a Rad"};
        JLabel seleccione = new JLabel("Seleccione una opción de conversión");
        JComboBox<String> comboBox = new JComboBox<>(opciones);

        String opcion = (String) JOptionPane.showInputDialog(null, seleccione, "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

        if (opcion != null){
            switch (opcion) {
                case "Conversion de Moneda" -> {
                    EntradaDeValor monedas = new EntradaDeValor();
                }
                case "Conversor de Temperatura", "Conversor de Grados a Rad" -> {
                    JOptionPane.showMessageDialog(null, "Por Ahora no disponible");
                    MenuPrincipal a = new MenuPrincipal();
                }

            }
        }
    }
}
