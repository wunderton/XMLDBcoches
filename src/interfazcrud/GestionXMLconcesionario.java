/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazcrud;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 *
 * @author anton
 */
public class GestionXMLconcesionario {
    Concesionario c;
            String leerXML = "";
            private ArrayList<Concesionario> arrayCoches = new ArrayList();

        public void setArrayCoche(ArrayList<Concesionario> arrayCoches) {
            this.arrayCoches = arrayCoches;
        }
            
            
    public GestionXMLconcesionario() {
	        super();
	    }	    
	    public void startDocument() {
	       // System.out.println("Comienzo del Documento XML");
               
	    }	    
	    public void endDocument() {
	       // System.out.println("Final del Documento XML");
	   
            }	 
	    public void startElement(String uri, String nombre,String nombreC, Attributes atts) {
	      //  System.out.printf("\t Principio Elemento: %s %n",nombre);
                leerXML = nombre;     
                if(leerXML.equals("concesionarios")){
                    c = new Concesionario();
                
                }

	    } 	
	    public void endElement(String uri, String nombre,String nombreC) {
	       // System.out.printf("\tFin Elemento: %s %n", nombre);
                    leerXML = nombre;
                
                if(leerXML.equals("Concesionario")){
                      arrayCoches.add(c);
                }
	    }	
	    public void characters(char[] ch, int inicio, int longitud) throws SAXException {
		   String car = new String(ch, inicio, longitud);
               //quitar saltos de línea	
		   car = car.replaceAll("[\t\n]","");	   
		   //System.out.printf ("\t Caracteres: %s %n", car);
                   
                    if(leerXML.equals("direccion")){
                       c.setDireccion(String.valueOf(car));
                   } 
                    if(leerXML.equals("nombre")){
                       c.setNombre(String.valueOf(car));
                   }
                    if(leerXML.equals("telefono")){
                       c.setTelefono(Integer.parseInt(car));
                   }
                   
                    if(leerXML.equals("id")){
                       c.setId(Integer.parseInt(car));
                   }
	    }  
}
