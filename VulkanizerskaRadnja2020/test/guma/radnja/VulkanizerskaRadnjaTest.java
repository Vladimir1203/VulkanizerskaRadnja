
package guma.radnja;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;
import gume.radnja.VulkanizerskaRadnja;

public class VulkanizerskaRadnjaTest {
	private VulkanizerskaRadnja v;
	private AutoGuma a, a1, a2;

	@Before
	public void setUp() throws Exception {
		v = new VulkanizerskaRadnja();
		a = new AutoGuma();
		a.setMarkaModel("Pirelli p zero");
		a.setSirina(200);
		a.setPrecnik(19);
		a.setVisina(60);
		a1 = new AutoGuma();
		a2 = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		v = null;
		a = null;
		a1 = null;
		a2 = null;
	}

	@Test
	public void testpronadjiGumu() {
		v.dodajGumu(a);
		assertEquals(a, v.pronadjiGumu(a.getMarkaModel()).getFirst());
	}

	@Test
	public void testpronadjiGumuNull() {
		assertNull(v.pronadjiGumu(null));

	}

	@Test
	public void testpronadjiGumuNemaUListi() {
		v.dodajGumu(a);
		assertTrue(v.pronadjiGumu("Dunlop sport").isEmpty());
	}

	@Test
	public void testpronadjiGumuViseDimenzija() {
		v.dodajGumu(a);
		a1.setMarkaModel("Pirelli p zero");
		a1.setSirina(220);
		a1.setPrecnik(20);
		a1.setVisina(60);
		a2.setMarkaModel("Dunlop sport");
		v.dodajGumu(a1);
		v.dodajGumu(a2);
		LinkedList<AutoGuma> testLista = new LinkedList<AutoGuma>();
		testLista.addFirst(a);
		testLista.addFirst(a1);
		assertEquals(testLista, v.pronadjiGumu("Pirelli p zero"));

	}

	@Test
	public void testdodajGumu() {
		v.dodajGumu(a);
		assertTrue(v.pronadjiGumu(a.getMarkaModel()).contains(a));
	}

	@Test(expected = java.lang.NullPointerException.class)
	public void testdodajGumuNull() {
		a = null;
		v.dodajGumu(a);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testdodajGumuVecUneta() {
		a1.setMarkaModel("Pirelli p zero");
		a1.setSirina(200);
		a1.setPrecnik(19);
		a1.setVisina(60);
		v.dodajGumu(a);
		v.dodajGumu(a1);
	}

}
