package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.Date;

/**
 * EstructuraPeriodico
 * 
 * Clase que permite estructurar mi periodico digital
 * 
 * @version 1.0
 * @since 2019
 * @author Josze
 */
public class EstructuraPeriodico {
    private int numPortada;
    private String nombre;
    private String encabezado;
    private ArrayList<Seccion> listaSecciones=new ArrayList<Seccion>();
    private Date fecha;
    private ArrayList<RedSocial> listaRedes=new ArrayList<RedSocial>();

    /**
     * Este método devuelve el número de portada del periódico
     * @return (int) numPortada
     */
    public int getNumPortada() {
        return numPortada;
    }

    public void setNumPortada(int numPortada) {
        this.numPortada = numPortada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public void addSeccion(Seccion sec){
        listaSecciones.add(sec);
    }

    public void addRedSocial(RedSocial redso){
        listaRedes.add(redso);
    }
    
    @Override
    public String toString() {
        return "EstructuraPeriodico:" + "\nnumPortada=" + numPortada + "\nnombre=" + nombre + "\nencabezado=" + encabezado + "\nfecha=" + fecha;
    }
    
}
