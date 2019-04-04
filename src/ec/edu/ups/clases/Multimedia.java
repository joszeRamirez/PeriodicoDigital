package ec.edu.ups.clases;

import java.util.Date;

/**
 * Multimedia
 *
 * Clase que permite crear un archivo multimedia
 *
 * @version 1.1
 * @since 2019
 * @author Josze
 */
public class Multimedia {

    /*String privado del objeto nombre*/
    private String nombre;
    /*String privado del objeto formato*/
    private String formato;
    /*byte[] privado del objeto archivo*/
    private byte[] archivo;
    /*Date privado del objeto fechaCreacion*/
    private Date fechaCreacion;
    /*int privado del objeto dimensiones*/
    private int dimensiones;
    /*Date privado del objeto fechaModificacion*/
    private Date fechaModificacion;
    /*String privado del objeto path*/
    private String path;

    /**
     * Cosntructor
     */
    public Multimedia() {

    }

    /**
     * Este método devuelve el nombre de la multimedia
     *
     * @return (String) nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este método introduce la información al objeto nombre
     *
     * @param nombre nombre de la multimedia
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este método devuelve el formato de la multimedia
     *
     * @return (String) formato
     */
    public String getFormato() {
        return formato;
    }

    /**
     * Este método introduce la información al objeto formato
     *
     * @param formato formato de la multimedia
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

    /**
     * Este método devuelve el tamaño del archivo multimedia
     *
     * @return (byte[]) archivo
     */
    public byte[] getArchivo() {
        return archivo;
    }

    /**
     * Este método introduce la información al objeto archivo
     *
     * @param archivo tamaño del archivo multimedia
     */
    public void setArchivo(byte[] archivo) {
        this.archivo = archivo;
    }

    /**
     * Este método devuelve la fecha de creación de la multimedia
     *
     * @return (Date) fechaCreacion
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Este método introduce la información al objeto fechaCreacion
     *
     * @param fechaCreacion fecha de creación de la multimedia
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * Este método devuelve las dimensiones de la multimedia
     *
     * @return (int) dimensiones
     */
    public int getDimensiones() {
        return dimensiones;
    }

    /**
     * Este método introduce la información al objeto dimensiones
     *
     * @param dimensiones dimensiones de la multimedia
     */
    public void setDimensiones(int dimensiones) {
        this.dimensiones = dimensiones;
    }

    /**
     * Este método devuelve la fecha de modificación de la multimedia
     *
     * @return (Date) fechaModificacion
     */
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * Este método introduce la información al objeto fechaModificacion
     *
     * @param fechaModificacion fecha de modificacion de la multimedia
     */
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    /**
     * Este método devuelve el parche de la multimedia
     *
     * @return (String) path
     */
    public String getPath() {
        return path;
    }

    /**
     * Este método introduce la información al objeto path
     *
     * @param path parche de la multimedia
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Método toString Devuelve una impresion en cadena de todo el conjunto de
     * objetos que contiene la clase
     *
     * @return (String) impresión en cadena de los objetos
     */
    @Override
    public String toString() {
        return "\nMultimedia{" + "nombre=" + nombre + "\n" + "\tformato="
                + formato + "\n" + "\tfechaCreacion=" + fechaCreacion + "\n"
                + "\tdimensiones=" + dimensiones + "\n" 
                + "\tfechaModificacion=" + fechaModificacion + "\n"
                + "\tpath=" + path;
    }

}
