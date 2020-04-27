package Encriptador;

import org.mindrot.jbcrypt.BCrypt;

public class BCryptDigest implements Algoritmo {

    @Override
    public String generarHash(String password) {
         return BCrypt.hashpw(password,BCrypt.gensalt(12));
    }

    @Override
    public boolean verificarSaltedPassword(String password, String passwordHash) {
        return BCrypt.checkpw(password,passwordHash);
    }
}
