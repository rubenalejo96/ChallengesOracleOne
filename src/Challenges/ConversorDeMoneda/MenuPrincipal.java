package Challenges.ConversorDeMoneda;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal {

    public MenuPrincipal(){
        String[] opciones = {"Opción 1", "Opción 2", "Opción 3", "Opción 4"};
        JLabel seleccione = new JLabel("Seleccione una opción de conversión");
        JComboBox<String> comboBox = new JComboBox<>(opciones);


        JPanel menu = new JPanel();
        menu.setLayout(new BoxLayout(menu, BoxLayout.Y_AXIS));
        comboBox.setAlignmentX(Component.LEFT_ALIGNMENT);
        seleccione.setAlignmentX(Component.LEFT_ALIGNMENT);
        menu.add(seleccione);
        menu.add(Box.createVerticalStrut(5)); // Espacio vertical entre la etiqueta y el JComboBox
        menu.add(comboBox);


        int opcion = JOptionPane.showOptionDialog(null, menu, "Menu", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null,new String[]{"OK", "Cancel"},
                null);

        if (opcion == JOptionPane.YES_OPTION){
            int i = comboBox.getSelectedIndex();
            if (i != -1){
                String asd = opciones[i];
                JOptionPane.showMessageDialog(null,opciones[i]);
            }
        }
    }
}
