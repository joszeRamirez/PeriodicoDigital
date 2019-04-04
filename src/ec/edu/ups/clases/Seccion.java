package ec.edu.ups.clases;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Seccion
 *
 * Clase que permite estructurar la sección del periodico
 *
 * @version 1.1
 * @since 2019
 * @author Josze
 */
public class Seccion {

    /*String privado del objeto nombre*/
    private String nombre;
    /*ArrayList<> privado del objeto listaNoticias*/
    private ArrayList<Noticia> listaNoticias;

    /**
     * Constructor
     */
    public Seccion() {
        listaNoticias = new ArrayList<>();
    }

    /**
     * Método que devuelve el nombre de la seccion
     *
     * @return (String) nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que introduce la información del objeto nombre
     *
     * @param nombre nombre de la sección
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que agrega un nuevo objeto a la lista de noticias
     *
     * @param noticia noticia del periodico
     */
    public void agregarNoticias(Noticia noticia) {
        listaNoticias.add(noticia);
    }

    /**
     * Método toString Devuelve una impresion en cadena de todo el conjunto de
     * objetos que contiene la clase
     *
     * @return (String) impresión en cadena de los objetos
     */
    @Override
    public String toString() {
        return "\nSeccion{" + "nombre=" + nombre + "\n" + "\tlistaNoticias=" 
                + listaNoticias;
    }

}
