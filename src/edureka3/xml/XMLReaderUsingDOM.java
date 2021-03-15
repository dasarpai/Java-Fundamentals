package edureka3.xml;


import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;


public class XMLReaderUsingDOM {

	public static void main(String[] args) {

		 try {
			 
				File fXmlFile = new File("students.xml");
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(fXmlFile);
			 
				System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			 
				NodeList nList = doc.getElementsByTagName("student");
			 
				System.out.println("----------------------------"+nList.getLength());
			 
				for (int temp = 0; temp < nList.getLength(); temp++) {

					Node nNode = nList.item(temp);
					System.out.println("\nCurrent Element :" + nNode.getNodeName());
					System.out.println(nNode.getNodeType());
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
			 
						Element eElement = (Element) nNode;
						if (eElement.getElementsByTagName("firstname").item(0).getTextContent().toString()=="Henry"){
								System.out.println("Wow I am here");
						}
						else {
							System.out.println("Wow I am there");
						}
			 
						System.out.println("Firstname of Student : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
						System.out.println("Lastname of Student : "  + eElement.getElementsByTagName("lastname").item(0).getTextContent());
						System.out.println("email : " + eElement.getElementsByTagName("email").item(0).getTextContent());
						System.out.println("marks : " + eElement.getElementsByTagName("marks").item(0).getTextContent());
						System.out.println("subject : " + eElement.getElementsByTagName("subject").item(0).getTextContent());
			 
					}	
				}
			    } catch (Exception e) {
				e.printStackTrace();
			    }
	}

}
