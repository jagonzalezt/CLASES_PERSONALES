import javax.swing.*;

public class Input_Datos_2 {
    static void main(String[] args) {
        String nombre;
        int edad;

        //ingreso de datos
        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre:... ");
        String edad2  = JOptionPane.showInputDialog(null, "Ingresa el edad:... ");
        edad = Integer.parseInt(edad2);

        //mostrar datos
        JOptionPane.showConfirmDialog(null, "Nombre: " + nombre+"\n"+
                                                                                "Edad: "+edad);


    }
}
