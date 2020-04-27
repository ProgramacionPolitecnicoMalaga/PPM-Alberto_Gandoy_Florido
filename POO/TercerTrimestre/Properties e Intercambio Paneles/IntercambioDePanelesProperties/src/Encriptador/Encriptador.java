package Encriptador;

import java.security.NoSuchAlgorithmException;

public class Encriptador {
    private String clave;
    private Algoritmo algoritmo;

    public Encriptador(String clave, String algoritmo) {
        this.clave = clave;
        try {
            setAlgoritmo(algoritmo);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public void setAlgoritmo(String algoritmo) throws NoSuchAlgorithmException {
        if (algoritmo.equals("SHA"))
            this.algoritmo = new SHA512Digest();
        else if (algoritmo.equals("MD5"))
            this.algoritmo = new MD5Digest();
        else
            this.algoritmo = new BCryptDigest();
    }

    public String generarHash() throws NoSuchAlgorithmException {
        return algoritmo.generarHash(clave);
    }

    public boolean verficarClave(String hash) throws NoSuchAlgorithmException {
        return algoritmo.verificarSaltedPassword(clave, hash);
    }
}
