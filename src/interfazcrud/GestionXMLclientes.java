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
public class GestionXMLclientes {
           Clientes c;
            String leerXML = "";
            private ArrayList<Clientes> arrayCoches = new ArrayList();

        public void setArrayCoche(ArrayList<Clientes> arrayCoches) {
            this.arrayCoches = arrayCoches;
        }
            
            
    public GestionXMLclientes() {
	        super();
	    }	    
	    public void startDocument() {
               
	    }	    
	    public void endDocument() {
	   
            }	 
	    public void startElement(String uri, String nombre,String nombreC, Attributes atts) {
                leerXML = nombre;     
                if(leerXML.equals("Clientes")){
                    c = new Clientes();
                
                }

	    } 	
	    public void endElement(String uri, String nombre,String nombreC) {
	       // System.out.printf("\tFin Elemento: %s %n", nombre);
                    leerXML = nombre;
                
                if(leerXML.equals("Clientes")){
                      arrayCoches.add(c);
                }
	    }	
	    public void characters(char[] ch, int inicio, int longitud) throws SAXException {
		   String car = new String(ch, inicio, longitud);
		   car = car.replaceAll("[\t\n]","");	   
		   //System.out.printf ("\t Caracteres: %s %n", car);
                   if(leerXML.equals("dni")){
                       c.setDni(String.valueOf(car));
                   }
                    if(leerXML.equals("nombre")){
                       c.setNombre(String.valueOf(car));
                   } 
                    if(leerXML.equals("apellido")){
                       c.setApellido(String.valueOf(car));
                   }
                   
                    if(leerXML.equals("telefono")){
                       c.setTelefono(Integer.parseInt(car));
                   }
	    }	
}
