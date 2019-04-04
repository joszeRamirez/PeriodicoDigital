package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.Date;

/**
 * Noticia
 *
 * Clase que permite estructurar mi noticia
 *
 * @version 1.1
 * @since 2019
 * @author Josze
 */
public class Noticia {

    /*String privado del objeto titulo*/
    private String titulo;
    /*String privado del objeto autor*/
    private String autor;
    /*Date privado del objeto fechaCreacion*/
    private Date fechaCreacion;
    /*String privado del objeto descripcion*/
    private String descripcion;
    /*String privado del objeto lugar*/
    private String lugar;
    /*ArrayList<> privado del objeto listaMultimedias*/
    private ArrayList<Multimedia> listaMultimedias;

    /**
     * Constructor
     */
    public Noticia() {
        listaMultimedias = new ArrayList<>();
    }

    /**
     * Metodo que devuelve el titulo de la noticia
     *
     * @return (String) titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método que introduce la información al objeto titulo
     *
     * @param titulo titulo de la noticia
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Método que devuelve el autor de la noticia
     *
     * @return (String) autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Método que introduce la información al objeto autor
     *
     * @param autor autor de la noticia
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Método que devuelve la fecha de creación de la noticia
     *
     * @return (Date) fechaCreacion
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Método que introduce la información al objeto fechaCreacion
     *
     * @param fechaCreacion fecha de creación de la noticia
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * Método que devuelve la descripción de la noticia
     *
     * @return (String) descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método que introduce la información al objeto descripción
     *
     * @param descripcion descripcion de la noticia
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método que devuelve el lugar de la noticia
     *
     * @return (String) lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Método que introduce la informacion al objeto lugar
     *
     * @param lugar lugar de la noticia
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * Método que agrega un objeto a la lista de Multimedia
     *
     * @param multimedia multimedia de la noticia
     */
    public void addMultimedia(Multimedia multimedia) {
        listaMultimedias.add(multimedia);
    }

    /**
     * Método toString Devuelve una impresion en cadena de todo el conjunto de
     * objetos que contiene la clase
     *
     * @return (String) impresión en cadena de los objetos
     */
    @Override
    public String toString() {
        return "\nNoticia{" + "titulo=" + titulo + "\n" + "\tautor=" + autor
                + "\n" + "\tfechaCreacion=" + fechaCreacion + "\n" + "\tdescripcion="
                + descripcion + "\n" + "\tlugar=" + lugar + "\n" + "\tlistaMultimedias="
                + listaMultimedias;
    }

}
