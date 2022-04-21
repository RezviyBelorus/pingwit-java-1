package pingwit.lec_15.classwork.point_2;

import pingwit.lec_15.classwork.entity.Employee;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaxParserExample {
    public static void main(String[] args) {
        String fileName = "lec_15/employee.xml";

        List<Employee> empList = parseXML(fileName);

        for (Employee emp : empList) {
            System.out.println(emp.toString());
        }
    }

    private static List<Employee> parseXML(String fileName) {
        List<Employee> empList = new ArrayList<>();
        Employee emp = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            InputStream resource = ClassLoader.getSystemResourceAsStream(fileName);
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(resource);

            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();

                    if (startElement.getName().getLocalPart().equals("employee")) {
                        emp = new Employee();

                        empList.add(emp);

                        Attribute idAttr = startElement.getAttributeByName(new QName("id"));
                        emp.setId(idAttr.getValue());

                    } else {
                        String localPart = startElement.getName().getLocalPart();
                        switch (localPart) {
                            case "firstName" -> {
                                xmlEvent = xmlEventReader.nextEvent();
                                emp.setFirstName(xmlEvent.asCharacters().getData());
                            }
                            case "lastName" -> {
                                xmlEvent = xmlEventReader.nextEvent();
                                emp.setLastName(xmlEvent.asCharacters().getData());
                            }
                            case "location" -> {
                                xmlEvent = xmlEventReader.nextEvent();
                                emp.setLocation(xmlEvent.asCharacters().getData());
                            }
                        }
                    }
                }
            }

        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

        return empList;
    }

}
