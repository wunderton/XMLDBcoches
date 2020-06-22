/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazcrud;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author anton
 */
public class EscrituraXmlCliente {
    public static void escritura(ArrayList <Clientes> clientes) throws IOException, ParserConfigurationException, TransformerConfigurationException, TransformerException{

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        DOMImplementation implementation = builder.getDOMImplementation();
        Document document = implementation.createDocument(null, "documento3", null);
        document.setXmlVersion("1.0");

		
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            // definimos el elemento raíz del documento
            Element eRaiz = doc.createElement("Clientes");
            doc.appendChild(eRaiz);

            // definimos el nodo que contendrá los elementos
            
            for(int i = 0; i < clientes.size(); i++){
                Element edni = doc.createElement("dni");
                eRaiz.appendChild(edni);

                Element enombre = doc.createElement("nombre");
                enombre.appendChild(doc.createTextNode(clientes.get(i).getNombre()));
                edni.appendChild(enombre);

                Element eapellido = doc.createElement("apellido");
                eapellido.appendChild(doc.createTextNode(String.valueOf(clientes.get(i).getApellido())));
                edni.appendChild(eapellido);

                Element etel = doc.createElement("telefono");
                etel.appendChild(doc.createTextNode(String.valueOf(clientes.get(i).getTelefono())));
                edni.appendChild(etel);
      
            }

            // clases necesarias finalizar la creación del archivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("Clientes2.xml"));

            transformer.transform(source, result);
            }catch(ParserConfigurationException | TransformerException | DOMException e) {
        }
    }  
}
