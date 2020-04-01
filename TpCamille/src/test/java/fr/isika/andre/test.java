package fr.isika.andre;
import static org.junit.Assert.*;
import org.junit.Test;
public class test {
	WhoIam whoiam = new WhoIam();
	@Test
	//renvoie Bonjour je suis Camille
	public final void testCamarche() {
		assertEquals("je m'appelle Camille", whoiam.whoAreYou("Camille"));
		
	}
	@Test
	//renvoie une erreur vide
	public final void testErreurVide() {
		assertEquals("Vous n'êtes pas connu de nos services", whoiam.whoAreYou(""));
	}
	@Test
	//renvoie une erreur autre nom
	public final void testErreurNom() {
		assertEquals("Vous n'êtes pas connu de nos services", whoiam.whoAreYou("toto"));
	}
}