package medicalsoft;

import clases.Medico;
import clases.Persona;
import javax.swing.JOptionPane;

public class Medicalsoft {

    public static void main(String[] args) {

        Medico medico1 = new Medico();

        medico1.setNombre(JOptionPane.showInputDialog("digite nombre del medico"));
        medico1.setApellido(JOptionPane.showInputDialog("digite apellido del medico"));
        medico1.setFecha_nacimienta(JOptionPane.showInputDialog("fecha de nacimiento"));
        medico1.setEmail(JOptionPane.showInputDialog("email"));

        System.out.println("El Nombre del Medico: " + medico1.getFullNombre() + "\n"
                + "La Edad del Medico es: " + medico1.getedad() + "\n"
                + "y Su Email es: " + medico1.get_Valaida_Correo());
    }

}
