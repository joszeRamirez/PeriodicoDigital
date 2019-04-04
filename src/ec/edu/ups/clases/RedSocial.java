package ec.edu.ups.clases;

/**
 * RedSocial
 *
 * Clase que permite estructurar mi red social
 *
 * @version 1.1
 * @since 2019
 * @author Josze
 */
public class RedSocial {

    /*int privado del objeto codigo*/
    private int codigo;
    /*String privado del objeto nombre*/
    private String nombre;
    /*String privado del objeto url*/
    private String url;
    /*String[] privado del objeto publicaciones*/
    private String[] publicaciones;
    /*int privado del objeto cont*/
    private int cont;

    /**
     * Constructor
     */
    public RedSocial() {
        cont = 0;
    }

    /**
     * Método que devuelve el codigo de la red social
     *
     * @return (int) codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Método que introduce la información al objeto codigo
     *
     * @param codigo codigo de la red social
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Método que devuelve el nombre de la red social
     *
     * @return (String) nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que introduce la informacion al objeto nombre
     *
     * @param nombre nombre de la red social
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve la url de la red social
     *
     * @return (String) url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Método que introduce la informacion al objeto url
     *
     * @param url url de la red social
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Método que agrega una publicacion al arreglo de publicaciones y despues
     * aumenta el contador de 1 en 1
     *
     * @param publicacion publicacion de la red social
     */
    public void addPublicacion(String publicacion) {
        publicaciones[cont] = publicacion;
        cont++;
    }

    /**
     * Método toString Devuelve una impresion en cadena de todo el conjunto de
     * objetos que contiene la clase
     *
     * @return (String) impresión en cadena de los objetos
     */
    @Override
    public String toString() {
        return "\nRedSocial:" + "codigo=" + codigo + "\n" + "\tnombre=" + nombre
                + "\n" + "\turl=" + url;
    }

}
