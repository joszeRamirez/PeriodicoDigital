/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.ArrayList;

/**
 *
 * @author Josze
 */
public class Seccion {
    private String nombre;
    private ArrayList<Noticia> listaNoticia=new ArrayList<Noticia>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void addNoticia(Noticia noti){
        listaNoticia.add(noti);
    }

    @Override
    public String toString() {
        return "Seccion:" + "\nnombre=" + nombre;
    }
    
}
