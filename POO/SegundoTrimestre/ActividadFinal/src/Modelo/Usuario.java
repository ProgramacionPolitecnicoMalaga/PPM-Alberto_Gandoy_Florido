package Modelo;

import java.util.Objects;

public class Usuario {
    private int id;
    private String nick, password, algoritmo;

    public Usuario() {
    }

    public Usuario(String nick, String password, String algoritmo) {
        this.nick = nick;
        this.password = password;
        this.algoritmo = algoritmo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(String algoritmo) {
        this.algoritmo = algoritmo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", algoritmo='" + algoritmo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id && Objects.equals(nick, usuario.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nick);
    }
}
