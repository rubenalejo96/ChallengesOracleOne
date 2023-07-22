package Challenges.ConversorDeMoneda;

import javax.swing.*;

public class EntradaDeValor {
    private static double valor = 0;
    private JLabel asd =new JLabel("Ingresa la cantidad de dinero que deseas convertir");
    private String valorString;

    public static double getValor() {
        return valor;
    }

    public EntradaDeValor() {

        valorString = JOptionPane.showInputDialog(null, asd, "Ingresa el Valor", JOptionPane.QUESTION_MESSAGE);

        try {
            valor = Double.parseDouble(valorString);
            if (valor > 0){
                OpcionesDeMonedas mon = new OpcionesDeMonedas();
            }
        }catch (NumberFormatException e ){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Valor Invalido");
            EntradaDeValor entrada = new EntradaDeValor();
        }



    }
}
