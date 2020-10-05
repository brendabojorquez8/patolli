package patolli;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/**
 *
 * @author javl2
 */
public class ClavePartida {
    
    public String generarClave(){
        String[] simbolos = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
        Random random;
        int length = 7;
        try{
            random = SecureRandom.getInstanceStrong();
            StringBuilder sb = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                int indexRandom = random.nextInt(simbolos.length);
                sb.append(simbolos[indexRandom]);
            }
            return sb.toString();
        }catch (NoSuchAlgorithmException e){
            return "No se pudo generar la clave de la sala" + e;
        }
    }
}
