package Challenges.ConversorDeMoneda;

import javax.swing.*;

public class EntradaDeUnidades {

    private JLabel contenido = new JLabel("Ingresa la cantidad de Unidades que deseas convertir");
    private static double unidades = 0;
    private String UnidIngresado = JOptionPane.showInputDialog(null, contenido,"Ingresa la Unidad", JOptionPane.PLAIN_MESSAGE);
    public static double getUnidades() {return unidades;}
    public EntradaDeUnidades(){

        try {
            unidades = Double.parseDouble(UnidIngresado);
            new OpcionesDeUnidades();

        }catch (NumberFormatException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Unidad Invalida", "Error", JOptionPane.ERROR_MESSAGE);
            new EntradaDeUnidades();
        }
    }
}
