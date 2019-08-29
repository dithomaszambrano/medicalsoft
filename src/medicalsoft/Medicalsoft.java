
package medicalsoft;

import clases.Medico;
import clases.Persona;


public class Medicalsoft {

    public static void main(String[] args) {
        
        Persona primerPersona = new Persona("Damaso", "Thomas");
        
        
        //primerMedico.apellido = "Thomas";
        
        System.out.println("Nombre del medico: "+primerPersona.getNombre());
        //System.out.println("Apellido del medico: "+primerPersona.getApellido())
    }
    
}
