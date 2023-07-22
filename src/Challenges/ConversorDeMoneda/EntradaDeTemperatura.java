package Challenges.ConversorDeMoneda;

import javax.swing.*;
public class EntradaDeTemperatura {

    private JLabel contenido = new JLabel("Ingresa la cantidad de Temperatura que deseas convertir");
    private static double temperatura = 0;
    private String tempIngresado = JOptionPane.showInputDialog(null, contenido,"Ingresa la Temperatura", JOptionPane.PLAIN_MESSAGE);

    public static double getTemperatura() {return temperatura;}

    public EntradaDeTemperatura(){
        try {
            temperatura = Double.parseDouble(tempIngresado);
            new OpcionesDeTemperatura();

        }catch (NumberFormatException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Temperatura Invalida", "Error", JOptionPane.ERROR_MESSAGE);
            new EntradaDeTemperatura();
        }






    }

}
