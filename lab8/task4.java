import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
public class task4 {
    public static void main(String[] args) {
           try {

	SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser saxParser = factory.newSAXParser();

	DefaultHandler handler = new DefaultHandler() {

	boolean fname = false;
	boolean lname = false;
	boolean day = false;
        boolean month = false;
        boolean year = false;
	
	public void startElement(String uri, String locname,String name, 
                Attributes attributes) throws SAXException {

		System.out.println("Start Element :" + name);

		if (name.equalsIgnoreCase("firstname")) {
			fname = true;
		}

		if (name.equalsIgnoreCase("lastname")) {
			lname = true;
		}

		if (name.equalsIgnoreCase("day")) {
			day = true;
		}
                if (name.equalsIgnoreCase("month")) {
			month = true;
		}
                if (name.equalsIgnoreCase("year")) {
			year = true;
		}


	}

	public void endElement(String uri, String locname,
		String name) throws SAXException {

		System.out.println("End Element :" + name);

	}

	public void characters(char ch[], int start, int length) throws SAXException {

		if (fname) {
			System.out.println("First Name : " + new String(ch, start, length));
			fname = false;
		}

		if (lname) {
			System.out.println("Last Name : " + new String(ch, start, length));
			lname = false;
		}

		if (day) {
			System.out.println("Day : " + new String(ch, start, length));
			day = false;
		}
                if (month) {
			System.out.println("Month : " + new String(ch, start, length));
			month = false;
		}
                if (year) {
			System.out.println("Year : " + new String(ch, start, length));
			year = false;
		}

	

	}

     };

       saxParser.parse("E:\\task4.xml", handler);
 
     } catch (Exception e) {
       e.printStackTrace();
     }
  
   }

}
