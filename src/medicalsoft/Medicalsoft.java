package medicalsoft;

import clases.Medico;
import clases.Persona;
import clases.Validacion;
import javax.swing.JOptionPane;

public class Medicalsoft {

    public static void main(String[] args) {

        Medico medico1 = new Medico();
        Validacion va = new Validacion();
        

        medico1.setNombre("damaso");
        medico1.setApellido("thomas");
        medico1.setFecha_nacimienta("15-11-2000");
        medico1.setEmail("zambranothomas2000@gmail.com");

        System.out.println("El Nombre del Medico: " + medico1.getFullNombre() + "\n"
                + "La Edad del Medico es: " + medico1.getedad() + "\n"
                + "y Su Email es: " + va.get_Valaida_Correo());
    }

}
