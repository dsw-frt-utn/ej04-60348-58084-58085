package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.ListarVehiculosView;
import views.VentanaPrincipal;

public class Program1 {
   
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        VentanaPrincipal menu = new VentanaPrincipal();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null); 
    }
}
