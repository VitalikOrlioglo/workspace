package jaxb;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBSerializer {
	
	public static void main(String[] args) {
		Person max = new Person();
		max.setName( "Max Meier" );
		max.setAdresse(new Adresse("Berlin"));

//		JAXBContext context = JAXBContext.newInstance( Person.class );
//		Marshaller m = context.createMarshaller();
//		
//		m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );
//			m.marshal(max, System.out);
		
	//write	
		JAXB.marshal(max, new File("person.xml"));
		
		
	//read
		
		Person p = JAXB.unmarshal( new File("person.xml"), Person.class );
		
		System.out.println(p.getAdresse().getOrt());
	}

}
