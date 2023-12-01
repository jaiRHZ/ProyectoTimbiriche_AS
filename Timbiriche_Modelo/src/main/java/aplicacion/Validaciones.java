
package aplicacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Jorge
 */
public class Validaciones {

    public Validaciones() {
    }
    
    public boolean validarFormatoCodigoPartida(String codigo){
        String patron = "^[A-Z0-9]{4}$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(codigo);
        return matcher.matches();
    }
}
