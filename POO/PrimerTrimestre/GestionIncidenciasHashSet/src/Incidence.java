
/*
En un sistema se producen diferentes tipos de incidencias que vienen definidas por la siguiente información:
- idIncidencia -----> equals y hascode
- Descripción
- SistemaAfectado ----->equals y hascode
Muchas de las incidencias se generan de manera reiterativa hasta que son solucionadas.
Sin embargo, esta repetición de incidencias es inecesarias, ya q no aporta informacin,
adicinal alguna, por lo q s desea evitar q se repitan.
Escribe un sistema de gstion d incidencias, para que a medida q s produzcan las notificaciones
de incidencias se dispongan con una lista de incidencias sin repetir.
Una vez q una incidencia se resuelve, debe ser eliminada d la lista.
*/

public class Incidence {
    private int idIncidence;
    private String description;
    private String systemAffected;

    public Incidence(int idIncidence, String description, String systemAffected) {
        this.idIncidence = idIncidence;
        this.description = description;
        this.systemAffected = systemAffected;
    }

    public int getIdIncidence() {
        return idIncidence;
    }

    public void setIdIncidence(int idIncidence) {
        this.idIncidence = idIncidence;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSystemAffected() {
        return systemAffected;
    }

    public void setSystemAffected(String systemAffected) {
        this.systemAffected = systemAffected;
    }

    @Override
    public String toString() {
        return "\n===================INCIDENCE===================\n" +
                "Identifier Incidence: " + idIncidence + "\n" +
                "Description: " + description + "\n" +
                "System Affected: " + systemAffected + "\n" +
        "===============================================\n";
    }

    @Override
    public int hashCode() {
        return systemAffected.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return idIncidence == ((Incidence)obj).getIdIncidence() && systemAffected.equals(((Incidence)obj).getSystemAffected());
    }
}
