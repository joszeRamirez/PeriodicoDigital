package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.Date;

/**
 * EstructuraPeriodico
 *
 * Clase que permite estructurar mi periodico digital
 *
 * @version 1.1
 * @since 2019
 * @author Josze
 */
public class EstructuraPeriodico {

    /*int privado del objeto numPortada*/
    private int numPortada;
    /*String privado del objeto nombre*/
    private String nombre;
    /*String privado del objeto encabezado*/
    private String encabezado;
    /*ArrayList<> privado del objeto listaSecciones*/
    private ArrayList<Seccion> listaSecciones;
    /*Date privado del objeto fecha*/
    private Date fecha;
    /*ArrayList<> privado del objeto listaRedes*/
    private ArrayList<RedSocial> listaRedes;

    /**
     * Constructor
     */
    public EstructuraPeriodico() {
        listaSecciones = new ArrayList<>();
        listaRedes = new ArrayList<>();
    }

    /**
     * Este método devuelve el número de portada del periódico
     *
     * @return (int) numPortada
     */
    public int getNumPortada() {
        return numPortada;
    }

    /**
     * Este método introduce la información al objeto numPortada
     *
     * @param numPortada número de portada del periódico
     */
    public void setNumPortada(int numPortada) {
        this.numPortada = numPortada;
    }

    /**
     * Este método devuelve el nombre del periodico
     *
     * @return (String) nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este método introduce la información al objeto nombre
     *
     * @param nombre nombre del periódico
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este métod devuelve el encabezado del periódico
     *
     * @return (String) encabezado
     */
    public String getEncabezado() {
        return encabezado;
    }

    /**
     * Este método introduce información al objeto encabezado
     *
     * @param encabezado encabezado del periódico
     */
    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    /**
     * Este método devuelve la fecha del periódico
     *
     * @return (Date) fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Este método introduce información al objeto fecha
     *
     * @param fecha fecha del periódico
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Este método agrega un objeto a la lista de secciones
     *
     * @param sec seccion del periódico
     */
    public void addSeccion(Seccion sec) {
        listaSecciones.add(sec);
    }

    /**
     * Este método agrega un objeto a la lista de redes sociales
     *
     * @param redso red social del periódico
     */
    public void addRedSocial(RedSocial redso) {
        listaRedes.add(redso);
    }

    /**
     * Método toString Devuelve una impresion en cadena de todo el conjunto de
     * objetos que contiene la clase
     *
     * @return (String) impresión en cadena de los objetos
     */
    @Override
    public String toString() {
        return "EstructuraPeriodico{" + "\nnumPortada=" + numPortada
                + "\nnombre=" + nombre + "\nencabezado=" + encabezado 
                + "\nlistaSecciones=" + listaSecciones + "\nfecha=" + fecha 
                + "\nlistaRedes=" + listaRedes;
    }
}
