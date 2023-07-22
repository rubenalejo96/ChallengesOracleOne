package Challenges.ConversorDeMoneda;

import javax.swing.*;

public class EntradaDeValor {
    private static double valor = 0;
    private JLabel asd =new JLabel("Ingresa la cantidad de dinero que deseas convertir");
    private String valorString = JOptionPane.showInputDialog(null, asd, "Ingresa el Valor", JOptionPane.QUESTION_MESSAGE);

    public static double getValor() {
        return valor;
    }

    public EntradaDeValor() {
        try {
            valor = Double.parseDouble(valorString);
            if (valor > 0){
                new OpcionesDeMonedas();
            }else {
                JOptionPane.showMessageDialog(null, "Programa Finalizado", "Adios", JOptionPane.WARNING_MESSAGE);
            }
        }catch (NumberFormatException e ){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Valor Invalido", "Error", JOptionPane.ERROR_MESSAGE);

            new EntradaDeValor();
        }



    }
}
