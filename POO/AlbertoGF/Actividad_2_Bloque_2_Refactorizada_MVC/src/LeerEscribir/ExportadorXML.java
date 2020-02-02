package LeerEscribir;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import proyecto.Comercial;
import proyecto.Comerciales;
import proyecto.Venta;
import proyecto.VentaMensual;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ExportadorXML implements ExportadorArchivo{
    public void generarComercialByVentaXml(Comerciales comerciales, String documentoXML) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element rootComerciales = doc.createElement("comerciales");
            doc.appendChild(rootComerciales);

            Iterator<Comercial> itComercial = comerciales.getComerciales().iterator();
            while (itComercial.hasNext()) {
                Comercial comercial = itComercial.next();

                Element nodoComercial = doc.createElement("comercial");

                Attr nombre = doc.createAttribute("nombre");
                nombre.setValue(comercial.getNombre());
                nodoComercial.setAttributeNode(nombre);

                Attr recordComercial = doc.createAttribute("record");
                String sizeVenta = String.valueOf(comercial.getRecordVenta().getVentas().size());
                recordComercial.setValue(sizeVenta);
                nodoComercial.setAttributeNode(recordComercial);

                rootComerciales.appendChild(nodoComercial);

                    Iterator<VentaMensual> itVenta = comercial.getVentasMensuales().iterator();
                    while (itVenta.hasNext()) {
                        VentaMensual venta = itVenta.next();

                        Element nodoVenta = doc.createElement("venta");

                        Attr numeroDeVentas = doc.createAttribute("numero");
                        numeroDeVentas.setValue(String.valueOf(venta.getVentas().size()));
                        nodoVenta.setAttributeNode(numeroDeVentas);

                        Attr fechaMensual = doc.createAttribute("fecha");
                        fechaMensual.setValue(String.valueOf(venta.getFecha().MONTH));
                        nodoVenta.setAttributeNode(fechaMensual);

                        nodoComercial.appendChild(nodoVenta);
                }
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(documentoXML + ".xml"));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    public void generarVentaByVentaMensualXml(VentaMensual ventaMensual, String documentoXML) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element rootVentasMensuales = doc.createElement("VentasMensuales");
            doc.appendChild(rootVentasMensuales);

            Iterator<Venta> itVenta = ventaMensual.getVentas().iterator();
            while (itVenta.hasNext()) {
                Venta venta = itVenta.next();

                Element nodoVenta = doc.createElement("venta");

                Attr id = doc.createAttribute("id");
                id.setValue(String.valueOf(venta.getId()));
                nodoVenta.setAttributeNode(id);

                Attr fechaVenta = doc.createAttribute("fecha");
                fechaVenta.setValue(String.valueOf(venta.getFecha().getTime()));
                nodoVenta.setAttributeNode(fechaVenta);

                rootVentasMensuales.appendChild(nodoVenta);
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(documentoXML + ".xml"));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void generarComercialByVentaCsv(String file, ArrayList<Comercial> comerciales) {
        final String NEXT_LINE = "\n";
            try {
                FileWriter fw = new FileWriter(file);
                for (Comercial comercial : comerciales) {
                fw.append(comercial.getNombre()).append(NEXT_LINE);
                fw.append(comercial.getRecordVenta() + NEXT_LINE);
                fw.append(comercial.getVentasMensuales() + NEXT_LINE);
                fw.append(NEXT_LINE);

                fw.flush();
                fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    @Override
    public void generarVentaByVentaMensualCsv(String file, ArrayList<Venta> ventas) {
        final String NEXT_LINE = "\n";
        try {
            FileWriter fw = new FileWriter(file);
            for (Venta venta : ventas) {
                fw.append(String.valueOf(venta.getId())).append(NEXT_LINE);
                fw.append(venta.getFecha().getTime()+ NEXT_LINE);
                fw.append(NEXT_LINE);
                fw.flush();
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

