package mx.edu.uacm.test;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;

public class PersonaTest {

	private Logger log= Logger.getLogger(PersonaTest.class);
	@Test(timeout=100)
	public void testNullNombrePersona() {
		Integer i=0;
		while(1000000000>i) {
			i++;
		}
		
		log.debug("Termino");
	}
	
	@Ignore("Todavia falta implementarlo")
	@Test(expected=Exception.class)
	public void testExcepcion() {
		Integer.parseInt("b");
	}

}
