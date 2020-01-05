import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void mostrarContactos() {
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }

    public void agregarNuevoContacto(Contacto contacto) {
        contactos.add(contacto);
    }
    public void comprobarContactoExistente(Contacto contacto)  {
            if (contactos.contains(contacto)) {
                contactos.remove(contacto);
                System.out.println(contacto.getNombre() + " ya existe en la agenda telefónica");
            } else {
                contactos.add(contacto);
            }
    }

    public Contacto buscarContacto(String nombre) {
        Contacto contactoEncotrado = null;
        boolean encontrado = false;
        int i = 0;
        while (contactos.size() > i && !encontrado) {
            if (contactos.get(i).getNombre().equals(nombre)) {
                contactoEncotrado = contactos.get(i);
                encontrado = true;
            }
            i++;
        }
        return contactoEncotrado;
    }

    public String contactoEliminado(Contacto contacto) {
        contactos.remove(contacto);
        return "El contacto " + contacto.getNombre() + " con el número: " + contacto.getTelefono() + " ha sido eliminado";
    }

    public void aforoAgenda() throws ExceptionAgenda {
        if (contactos.size() <= 10) {
            int huecos = 10 - contactos.size();
            System.out.println("Tienes " + huecos + " huecos libres" );
        } else {
            throw new ExceptionAgenda("La agenda tiene ya un tamño máximo de " + contactos.size());
        }
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contactos=" + contactos +
                '}';
    }
}
