import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.xpath.XPathExpressionException;
import java.util.Scanner;

public class ProbandoXPath {
    public static void main(String[] args) throws XPathExpressionException {
        System.out.println("Introduce el pais");
        Scanner sc = new Scanner(System.in);
        String pais = sc.nextLine();
        System.out.println(pais);
        XPathEvaluator eval = new XPathEvaluator("aeropuertos.xml");
        try {
            NodeList nodeSet = eval.evaluateXPath("/aeropuertos/aeropuerto");
            for (int k = 0; k < nodeSet.getLength(); k++) {
                Element aeropuerto = (Element) nodeSet.item(k);
                if(pais.equals(aeropuerto.getAttribute("pais"))){
                    System.out.println(aeropuerto.getAttribute("nombreLargo"));
                }
            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

    }
}