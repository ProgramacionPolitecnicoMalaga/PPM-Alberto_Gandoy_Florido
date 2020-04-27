package Encriptador;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SHA512Digest implements Algoritmo {
    private MessageDigest messageDigest;
    private String salt;

    public SHA512Digest() throws NoSuchAlgorithmException {
        this.messageDigest = MessageDigest.getInstance("SHA-512");
       this.salt = generarSalt();
    }

    public String generarSalt(){
        SecureRandom secureRandom = null;
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
            byte[] salt = new byte[16];
            secureRandom.nextBytes(salt);
            return Hex.encodeHexString(salt);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "Salt!";
        }
    }

    @Override
    public String generarHash(String password) throws NoSuchAlgorithmException {
        if (messageDigest == null) throw new NoSuchAlgorithmException("No existe el algoritmo de hash");
        messageDigest.update(salt.getBytes());
        byte[] bytes = messageDigest.digest(password.getBytes());
        return new String(Hex.encodeHex(bytes));
    }

    @Override
    public boolean verificarSaltedPassword(String password, String passwordHash) throws NoSuchAlgorithmException {
        String nuevoHash = generarHash(password);
        return nuevoHash.equals(passwordHash);
    }
}
