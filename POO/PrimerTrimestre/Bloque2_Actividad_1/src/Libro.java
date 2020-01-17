public class Libro {            /*CLASES*/

    private String titulo;      /*ATRIBUTOS*/
    private String autor;
    private String editorial;
    private String ISBN;
    private int numEdicion;

    public Libro (String autor , String titulo){  /*CONSTRUCTOR*/ /*PARAMETROS (String autor , String titulo)*/

        this.autor = autor; /*this.autor se refiere a los atributos y */
        this.titulo = titulo;

    }

    public Libro (String autor, String titulo, String editorial, String ISBN, int numEdicion){

        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.ISBN = ISBN;
        this.numEdicion = numEdicion;
    }


    public void setTitulo (String nuevoTitulo){

        this.titulo = nuevoTitulo;

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumEdicion() {
        return numEdicion;
    }

    public void setNumEdicion(int numEdicion) {
        this.numEdicion = numEdicion;
    }

    public String getTitulo(){
        return this.titulo;
    }

}
