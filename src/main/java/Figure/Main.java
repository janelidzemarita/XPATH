package Figure;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.*;

import static Figure.XMLFiles.*;

public class Main extends Thread {

	public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException, XMLStreamException {

		createXMLCircle("src/main/java/InputFiles/Circles_in.dat");
		createXMLRectangle("src/main/java/InputFiles/Rectangles_in.dat");
		createXMLTriangle("src/main/java/InputFiles/Triangles_in.dat");


	}

}


