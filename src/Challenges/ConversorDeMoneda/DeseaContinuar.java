package Challenges.ConversorDeMoneda;

import javax.swing.*;

public class DeseaContinuar {

    public DeseaContinuar(){
        int i = JOptionPane.showConfirmDialog(null,"¿Desea Continuar?", "Select a Option",JOptionPane.YES_NO_CANCEL_OPTION);

        if (i == JOptionPane.YES_OPTION){
            MenuPrincipal a = new MenuPrincipal();
        } else{
            JOptionPane.showMessageDialog(null, "Saliendo de la Aplicacion", "Adios", JOptionPane.WARNING_MESSAGE);
        }
    }
}
