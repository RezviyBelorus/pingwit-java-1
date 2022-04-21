package pingwit.lec_15.classwork.point_2;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import pingwit.lec_15.classwork.entity.Employee;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SaxParserExample {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        SAXParser parser = parserFactory.newSAXParser();

        SAXHandler handler = new SAXHandler();
        InputStream resource = ClassLoader.getSystemResourceAsStream("lec_15/employee.xml");
        parser.parse(resource, handler);

        List<Employee> empList = handler.getEmployeeList();

        empList.forEach(System.out::println);

    }

}

class SAXHandler extends DefaultHandler {
    private final List<Employee> empList = new ArrayList<>();
    private Employee emp = null;
    private String content = null;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        switch (qName) {
            case "employee" -> {
                emp = new Employee();
                emp.setId(attributes.getValue("id"));
                empList.add(emp);
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        switch (qName) {
            case "firstName" -> emp.setFirstName(content);
            case "lastName" -> emp.setLastName(content);
            case "location" -> emp.setLocation(content);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        content = String.copyValueOf(ch, start, length).trim();
    }

    public List<Employee> getEmployeeList() {
        return empList;
    }

}
