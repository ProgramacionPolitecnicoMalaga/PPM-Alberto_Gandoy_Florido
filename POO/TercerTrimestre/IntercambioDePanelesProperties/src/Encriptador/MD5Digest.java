package Encriptador;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Digest implements Algoritmo {
    private MessageDigest messageDigest;

    public MD5Digest() {
        try {
            this.messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String generarHash(String password) throws NoSuchAlgorithmException {
        if (messageDigest == null)
            throw new NoSuchAlgorithmException("No existe el algoritmo de hash");
        byte[] bytes = messageDigest.digest(password.getBytes());
        return new String(Hex.encodeHex(bytes));
    }

    @Override
    public boolean verificarSaltedPassword(String password, String passwordHash) throws NoSuchAlgorithmException {
        String nuevoHash = generarHash(password);
        return nuevoHash.equals(passwordHash);
    }
}
