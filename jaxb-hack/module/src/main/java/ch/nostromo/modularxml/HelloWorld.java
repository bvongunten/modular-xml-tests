package ch.nostromo.modularxml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringWriter;

@XmlRootElement
public class HelloWorld {

    private String message = "Hello World!";


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String...args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(HelloWorld.class);

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);



        StringWriter xmlWriter = new StringWriter();
        marshaller.marshal(new HelloWorld(), xmlWriter);
        System.out.println(xmlWriter.toString());
    }
}
