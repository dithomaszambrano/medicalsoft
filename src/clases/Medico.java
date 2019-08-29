package clases;

public class Medico extends Persona{
    
    public String especialidad;
    
   public Medico(String nom, String ape, String espec){
       super(nom, ape);
       this.especialidad = espec;
   }

}
