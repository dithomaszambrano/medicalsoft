
package medicalsoft;

import clases.Medico;
import clases.Persona;


public class Medicalsoft {

    public static void main(String[] args) {
        
        Medico medico1 = new Medico();
        
        medico1.setNombre("Omar");
        medico1.setApellido("Maremco");
        medico1.setFecha_nacimienta("22-02-1981");
        
        System.out.println("El Medico: "+medico1.getFullNombre()+" y su edad es: "+medico1.getedad());
    }
    
}
