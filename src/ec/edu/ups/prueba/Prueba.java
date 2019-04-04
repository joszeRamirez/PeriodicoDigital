/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

import ec.edu.ups.clases.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 *
 * @author Josze
 */
public class Prueba {
    
    static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    public static void main (String[] args) throws ParseException{
        
        
        EstructuraPeriodico estructura = new EstructuraPeriodico();
        estructura.setNumPortada(1);
        estructura.setNombre("El Mercioco");
        estructura.setEncabezado("Noticias falsas");
        String fecha1 = ("02/04/2019");
        Date fechaE = formato.parse(fecha1);
        estructura.setFecha(fechaE);
        
        RedSocial yahoo = new RedSocial();
        yahoo.setCodigo(1);
        yahoo.setNombre("yaju");
        yahoo.setUrl("www.yahoo.com");
        estructura.addRedSocial(yahoo);
        
        RedSocial fb = new RedSocial();
        fb.setCodigo(2);
        fb.setNombre("fishbook");
        fb.setUrl("www.fishbook.com");
        estructura.addRedSocial(fb);
        
        Seccion seccion1 = new Seccion();
        seccion1.setNombre("Deportes");
        estructura.addSeccion(seccion1);
        
        Seccion seccion2 = new Seccion();
        seccion2.setNombre("Farándula");
        estructura.addSeccion(seccion2);
        
        Noticia noticia1 = new Noticia();
        noticia1.setTitulo("Victoria en las Olimpiadas de Francia");
        noticia1.setAutor("Ricardo Arjona");
        noticia1.setDescripcion("Ecuador ganó las olimpiadas francesas"
                + " sin piedad");
        noticia1.setLugar("Paris");
        String fecha4 = ("29/03/2019");
        Date fechaCn = formato.parse(fecha4);
        noticia1.setFechaCreacion(fechaCn);
        seccion1.agregarNoticias(noticia1);
        
        Noticia noticia2 = new Noticia();
        noticia2.setTitulo("Maluma se hizo menestron");
        noticia2.setAutor("Juan Barrera");
        noticia2.setDescripcion("Se le declaró a Ricky Martin");
        noticia1.setLugar("España");
        String fecha5 = ("26/03/2019");
        Date fechaCn2 = formato.parse(fecha5);
        noticia1.setFechaCreacion(fechaCn2);
        seccion2.agregarNoticias(noticia2);
        
        Multimedia multimedia = new Multimedia();
        multimedia.setNombre("Imágen de la victoria en carrera de postas");
        multimedia.setFormato("jpg");
        multimedia.setDimensiones(20);
        multimedia.setPath("IDK");
        String fecha2 = ("01/04/2019");
        Date fechaCm = formato.parse(fecha2);
        multimedia.setFechaCreacion(fechaCm);
        String fecha3 = ("04/04/2019");
        Date fechaM = formato.parse(fecha3);
        multimedia.setFechaModificacion(fechaM);
        
        noticia1.addMultimedia(multimedia);
        
        System.out.println(estructura);
    }
    
}

