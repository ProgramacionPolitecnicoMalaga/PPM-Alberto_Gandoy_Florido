package Encriptador;

import java.security.NoSuchAlgorithmException;

public interface Algoritmo {
    String generarHash(String password) throws NoSuchAlgorithmException;
    boolean verificarSaltedPassword(String password, String passwordHash) throws NoSuchAlgorithmException;
}
