package fr.isika.andre;
import static org.junit.Assert.*;
import org.junit.Test;
public class Apptest {
	WhoIam whoiam = new WhoIam();
	@Test
	public final void testCamarche() {
		assertEquals("je mappelle Camille", whoiam.whoAreYou("Camille"));
		
	}
	@Test
	public final void testErreurVide() {
		assertEquals("Vous ntes pas connu de nos services", whoiam.whoAreYou(""));
	}
	@Test
	public final void testErreurNom() {
		assertEquals("Vous ntes pas connu de nos services", whoiam.whoAreYou("toto"));
	}
}