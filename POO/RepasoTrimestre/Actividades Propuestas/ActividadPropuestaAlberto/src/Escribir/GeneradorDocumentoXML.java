package Escribir;

import Modelo.Concesionario;
import Proyecto.*;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Iterator;

public class GeneradorDocumentoXML implements CreadorDocumentoXML {

    @Override
    public void generarClientesXML(Concesionario concesionario, String documentoXML) {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = null;

            try {
                db = dbf.newDocumentBuilder();
            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            }
            Document doc = db.newDocument();

            Element root = doc.createElement("clientes");
            doc.appendChild(root);

            Iterator<Cliente> it = concesionario.getClientes().iterator();
            while (it.hasNext()) {
                Cliente cliente = it.next();

                Element nodoCliente = doc.createElement("cliente");

                Attr nombre = doc.createAttribute("nombre");
                nombre.setValue(cliente.getNombre());
                nodoCliente.setAttributeNode(nombre);

                Attr apellido = doc.createAttribute("apellido");
                apellido.setValue(cliente.getApellido());
                nodoCliente.setAttributeNode(apellido);


                Attr nif = doc.createAttribute("Nif");
                nif.setValue(cliente.getNif());
                nodoCliente.setAttributeNode(nif);

                root.appendChild(nodoCliente);

                Element nodoBanco = doc.createElement("cuenta");

                Attr iban = doc.createAttribute("IBAN");
                iban.setValue(cliente.getCuentaBancaria().getNumeroDeCuenta());
                nodoBanco.setAttributeNode(iban);

                Attr saldo = doc.createAttribute("saldo");
                saldo.setValue(String.valueOf(cliente.getCuentaBancaria().getSaldoContable()));
                nodoBanco.setAttributeNode(saldo);

                nodoCliente.appendChild(nodoBanco);
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = null;
            try {
                transformer = transformerFactory.newTransformer();
            } catch (TransformerConfigurationException e) {
                e.printStackTrace();
            }
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(documentoXML + ".xml"));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            try {
                transformer.transform(source, result);
            } catch (TransformerException e) {
                e.printStackTrace();
            }

        }


    @Override
    public void generarVehiculoXML(Concesionario concesionario, String documentoXML) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;

        try {
            db = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        Document doc = db.newDocument();

        Element root = doc.createElement("vehiculos");
        doc.appendChild(root);

        Iterator<Vehiculo> it = concesionario.getVehiculos().iterator();
        while (it.hasNext()) {
            Vehiculo vehiculo = it.next();

            Element nodoVehiculo = doc.createElement("vehiculo");

            Attr modelo = doc.createAttribute("modelo");
            modelo.setValue(vehiculo.getModelo());
            nodoVehiculo.setAttributeNode(modelo);

            Attr marca = doc.createAttribute("marca");
            marca.setValue(vehiculo.getMarca());
            nodoVehiculo.setAttributeNode(marca);


            Attr color = doc.createAttribute("color");
            color.setValue(vehiculo.getColor());
            nodoVehiculo.setAttributeNode(color);

            Attr combustion = doc.createAttribute("combustion");
            combustion.setValue(vehiculo.getCombustion());
            nodoVehiculo.setAttributeNode(combustion);

            Attr estado = doc.createAttribute("estado");
            estado.setValue(vehiculo.getEstado());
            nodoVehiculo.setAttributeNode(estado);

            root.appendChild(nodoVehiculo);
        }
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = null;
        try {
            transformer = transformerFactory.newTransformer();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(documentoXML + ".xml"));
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        try {
            transformer.transform(source, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void generarCompraXML(Concesionario concesionario, String documentoXML) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;

        try {
            db = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        Document doc = db.newDocument();

        Element root = doc.createElement("comprado");
        doc.appendChild(root);

        Iterator<Operacion> it = concesionario.getCompras().iterator();
        while (it.hasNext()) {
            Operacion compra = it.next();
            Element nodoVehiculo = doc.createElement("vehiculo");

            Attr modelo = doc.createAttribute("modelo");
            modelo.setValue(compra.getVehiculo().getModelo());
            nodoVehiculo.setAttributeNode(modelo);

            Attr marca = doc.createAttribute("marca");
            marca.setValue(compra.getVehiculo().getMarca());
            nodoVehiculo.setAttributeNode(marca);


            Attr color = doc.createAttribute("color");
            color.setValue(compra.getVehiculo().getColor());
            nodoVehiculo.setAttributeNode(color);

            Attr combustion = doc.createAttribute("combustion");
            combustion.setValue(compra.getVehiculo().getCombustion());
            nodoVehiculo.setAttributeNode(combustion);

            Attr estado = doc.createAttribute("estado");
            estado.setValue(compra.getVehiculo().getEstado());
            nodoVehiculo.setAttributeNode(estado);

            root.appendChild(nodoVehiculo);

            Element nodoCliente = doc.createElement("cliente");

            Attr nombre = doc.createAttribute("nombre");
            nombre.setValue(compra.getCliente().getNombre());
            nodoCliente.setAttributeNode(nombre);

            Attr apellido = doc.createAttribute("apellido");
            apellido.setValue(compra.getCliente().getApellido());
            nodoCliente.setAttributeNode(apellido);


            Attr nif = doc.createAttribute("Nif");
            nif.setValue(compra.getCliente().getNif());
            nodoCliente.setAttributeNode(nif);

            root.appendChild(nodoCliente);

            Element nodoBanco = doc.createElement("cuenta");

            Attr iban = doc.createAttribute("IBAN");
            iban.setValue(compra.getCliente().getCuentaBancaria().getNumeroDeCuenta());
            nodoBanco.setAttributeNode(iban);

            Attr saldo = doc.createAttribute("saldo");
            saldo.setValue(String.valueOf(compra.getCliente().getCuentaBancaria().getSaldoContable()));
            nodoBanco.setAttributeNode(saldo);

            nodoCliente.appendChild(nodoBanco);
        }
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = null;
        try {
            transformer = transformerFactory.newTransformer();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(documentoXML + ".xml"));
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        try {
            transformer.transform(source, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void generarVentaXML(Concesionario concesionario, String documentoXML) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;

        try {
            db = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        Document doc = db.newDocument();

        Element root = doc.createElement("vendido");
        doc.appendChild(root);

        Iterator<Operacion> it = concesionario.getCompras().iterator();
        while (it.hasNext()) {
            Operacion venta =  it.next();
            Element nodoVehiculo = doc.createElement("vehiculo");

            Attr modelo = doc.createAttribute("modelo");
            modelo.setValue(venta.getVehiculo().getModelo());
            nodoVehiculo.setAttributeNode(modelo);

            Attr marca = doc.createAttribute("marca");
            marca.setValue(venta.getVehiculo().getMarca());
            nodoVehiculo.setAttributeNode(marca);


            Attr color = doc.createAttribute("color");
            color.setValue(venta.getVehiculo().getColor());
            nodoVehiculo.setAttributeNode(color);

            Attr combustion = doc.createAttribute("combustion");
            combustion.setValue(venta.getVehiculo().getCombustion());
            nodoVehiculo.setAttributeNode(combustion);

            Attr estado = doc.createAttribute("estado");
            estado.setValue(venta.getVehiculo().getEstado());
            nodoVehiculo.setAttributeNode(estado);

            root.appendChild(nodoVehiculo);

            Element nodoCliente = doc.createElement("cliente");

            Attr nombre = doc.createAttribute("nombre");
            nombre.setValue(venta.getCliente().getNombre());
            nodoCliente.setAttributeNode(nombre);

            Attr apellido = doc.createAttribute("apellido");
            apellido.setValue(venta.getCliente().getApellido());
            nodoCliente.setAttributeNode(apellido);


            Attr nif = doc.createAttribute("Nif");
            nif.setValue(venta.getCliente().getNif());
            nodoCliente.setAttributeNode(nif);

            root.appendChild(nodoCliente);

            Element nodoBanco = doc.createElement("cuenta");

            Attr iban = doc.createAttribute("IBAN");
            iban.setValue(venta.getCliente().getCuentaBancaria().getNumeroDeCuenta());
            nodoBanco.setAttributeNode(iban);

            Attr saldo = doc.createAttribute("saldo");
            saldo.setValue(String.valueOf(venta.getCliente().getCuentaBancaria().getSaldoContable()));
            nodoBanco.setAttributeNode(saldo);

            nodoCliente.appendChild(nodoBanco);
        }
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = null;
        try {
            transformer = transformerFactory.newTransformer();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(documentoXML + ".xml"));
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        try {
            transformer.transform(source, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
