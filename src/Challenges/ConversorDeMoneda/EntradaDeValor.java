package Challenges.ConversorDeMoneda;

import javax.swing.*;

public class EntradaDeValor {
    public EntradaDeValor() {
        JTextField valorColocado = new JTextField();
        JLabel asd =new JLabel("Ingresa la cantidad de dinero que deseas convertir") ;
        int valor = 0;

        String valorString = JOptionPane.showInputDialog(null, asd, "Ingresa el Valor", JOptionPane.QUESTION_MESSAGE);

        try {
            valor = Integer.parseInt(valorString);
            if (valor > 0){
                JOptionPane.showMessageDialog(null, "tu valor es " + valor);
            }
        }catch (NumberFormatException e ){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Valor Invalido");
            EntradaDeValor entrada = new EntradaDeValor();
        }

    }
}
