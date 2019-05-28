package com.sunday;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class App 
{
    public static void main( String[] args ) throws JAXBException
    {
    	JAXBContext context = JAXBContext.newInstance(XmlData.class);
    	Marshaller marshaller = context.createMarshaller();
    	marshaller.marshal(new XmlData("Hakeem","Haku"), new File("XmlData.xml"));
    	
    	Unmarshaller unMarshaller = context.createUnmarshaller();
    	Object data = unMarshaller.unmarshal(new File("XmlData.xml"));
    	System.out.println(data);
    }
}
