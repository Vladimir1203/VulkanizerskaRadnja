package guma;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class AutoGumaTest {
	private AutoGuma a, a2;

	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
		a2 = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testsetMarkaModel() {
		a.setMarkaModel("Pireli p zero");
		assertEquals("Pireli p zero", a.getMarkaModel());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testsetMarkaModelNull() {
		a.setMarkaModel(null);

	}

	@Test(expected = java.lang.RuntimeException.class)
	public void test3setMarkaModel() {
		a.setMarkaModel("as");
	}

	@Test
	public void testsetPrecnik() {
		a.setPrecnik(19);
		assertEquals(19, a.getPrecnik());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testsetPrecnikNula() {
		a.setPrecnik(0);

	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testsetPrecnikOpseg() {
		a.setPrecnik(23);

	}

	@Test
	public void testsetSirina() {
		a.setSirina(200);
		assertEquals(200, a.getSirina());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void test2setSirina() {
		a.setSirina(2);

	}

	@Test(expected = java.lang.RuntimeException.class)
	public void test3setSirina() {
		a.setSirina(1000);

	}

	@Test
	public void testsetVisina() {
		a.setVisina(50);
		assertEquals(50, a.getVisina());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void test2setVisina() {
		a.setVisina(24);

	}

	@Test(expected = java.lang.RuntimeException.class)
	public void test3setVisina() {
		a.setVisina(96);

	}

	@Test
	public void testtoString() {
		a.setMarkaModel("Pireli p zero");
		a.setPrecnik(19);
		a.setSirina(200);
		a.setVisina(60);
		assertEquals(
				"AutoGuma [markaModel=" + "Pireli p zero" + ", precnik=" + 19 + ", sirina=" + 200 + ", visina=" + 60 + "]",
				a.toString());
	}

	@Test
	public void test1Equals() {
		a.setMarkaModel("Pireli p zero");
		a.setPrecnik(19);
		a.setSirina(200);
		a.setVisina(60);
		a2.setMarkaModel("Pireli p zero");
		a2.setPrecnik(19);
		a2.setSirina(200);
		a2.setVisina(60);
		assertTrue(a.equals(a2));
	}
	@Test
	public void test2Equals() {
		a.setMarkaModel("Pireli p zero");
		a.setPrecnik(19);
		a.setSirina(200);
		a.setVisina(60);
		a2.setMarkaModel("Pireli p zero");
		a2.setPrecnik(19);
		a2.setSirina(200);
		a2.setVisina(90);
		assertFalse(a.equals(a2));
	}
}