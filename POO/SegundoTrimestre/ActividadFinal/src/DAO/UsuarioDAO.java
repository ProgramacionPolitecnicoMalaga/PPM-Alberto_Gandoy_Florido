package DAO;

import Modelo.Usuario;

import java.util.ArrayList;

public interface UsuarioDAO {
    ArrayList<Usuario> mostrar();
    boolean insertar(Usuario usuario);
    Usuario buscarUsuario(String nick);
    boolean eliminar(String nick);
}
