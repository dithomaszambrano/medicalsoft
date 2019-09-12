
package clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author estudiante
 */
public class Validacion {
    
    static String email;
    
    public boolean get_Valaida_Correo(){
        
        Pattern p = Pattern.compile("[-\\w\\.]+@[\\.\\w]+\\.\\w+");

        Matcher m = p.matcher(email);
         
        return m.matches();
    }
    
}
