package edureka3.xml;

//Provide class which allow processing of XMLDoc using DOM or SAX parser
import javax.xml.parsers.*;

//Provide the interface for DOM parser. 
import org.w3c.dom.*;

import java.io.*;

import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

public class XmlGenerator {

	public static void main(String[] args) {
		
		DocumentBuilderFactory f=DocumentBuilderFactory.newInstance();
        DocumentBuilder b = null;
		try {
			b = f.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Document doc=b.newDocument();
        
        Element rootele=doc.createElement("students");
        Element studentele=doc.createElement("student");
        
        Element firstnameele=doc.createElement("firstname");
        Element lastnameele=doc.createElement("lastname");
        Element emailele=doc.createElement("email");
        Element subject=doc.createElement("subject");
        Element marksele=doc.createElement("marks");
        
        Text t1=doc.createTextNode("Henry");
        Text t2=doc.createTextNode("Lee");
        Text t3=doc.createTextNode("Henry123@gmail.com");
        Text t5=doc.createTextNode("Physics");
        Text t4=doc.createTextNode("70");//Document object module parser
        
        firstnameele.appendChild(t1); 
        lastnameele.appendChild(t2);
        emailele.appendChild(t3);
        marksele.appendChild(t4);
        subject.appendChild(t5);
        
        studentele.appendChild(firstnameele);
        studentele.appendChild(lastnameele);
        studentele.appendChild(emailele);
        studentele.appendChild(marksele);
        studentele.appendChild(subject);
       
       rootele.appendChild(studentele);
       doc.appendChild(rootele);
       Transformer t = null;
	try {
		t = TransformerFactory.newInstance().newTransformer();
	} catch (TransformerConfigurationException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (TransformerFactoryConfigurationError e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
       try {
		t.transform(new DOMSource(doc),new StreamResult(new FileOutputStream("students.xml")));;
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (TransformerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       System.out.println("XML file generated..");

	}

}
