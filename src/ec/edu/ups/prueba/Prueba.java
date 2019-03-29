/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

import ec.edu.ups.clases.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Josze
 */
public class Prueba {
    
    static DateFormat format=new SimpleDateFormat("M/d/yyyy", Locale.ENGLISH);
    
    public static void main (String[] args) throws ParseException{
        RedSocial yahoo = new RedSocial();
        yahoo.setCodigo(1);
        yahoo.setNombre("Juanillo");
        yahoo.setUrl("www.yahoo.com");
        System.out.println(yahoo);
        
        System.out.println("");
        
        EstructuraPeriodico estructura = new EstructuraPeriodico();
        estructura.setNumPortada(1);
        estructura.setNombre("El Mercioco");
        estructura.setEncabezado("Noticias falsas");
        Date fechaP=format.parse("9/29/1998");
        estructura.setFecha(fechaP);
        System.out.println(estructura);
        
        System.out.println("");
                
        Seccion seccion = new Seccion();
        seccion.setNombre("Deportes");
        System.out.println(seccion);
        
        System.out.println("");
        
        Noticia noticia = new Noticia();
        noticia.setTitulo("Victoria en las Olimpiadas de Francia");
        noticia.setAutor("Josze");
        noticia.setDescripcion("Ganamos >m<");
        Date fechaN=format.parse("3/25/2019");
        noticia.setFechaCreacion(fechaN);
        System.out.println(noticia);
        
        System.out.println("");
        
        Multimedia multimedia = new Multimedia();
        multimedia.setNombre("Música PoP");
        Date fechaCreaM=format.parse("12/12/2018");
        multimedia.setFechaCreacion(fechaCreaM);
        Date fechaModiM=format.parse("03/20/2019");
        multimedia.setFechaModificacion(fechaModiM);
        System.out.println(multimedia);
    }
}
