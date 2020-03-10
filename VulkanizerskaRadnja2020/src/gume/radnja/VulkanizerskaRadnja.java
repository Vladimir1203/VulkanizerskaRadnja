package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;

/**
 * Klasa koja opisuje Vulkanizesku radnju i neke njene funkcionalnosti.
 * 
 * @author Vladimir Lazic
 * @version 0.0.2
 */
public class VulkanizerskaRadnja {
	/**
	 * Lista guma dostupnih na stanju.
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Dodaje gumu u postojecu listu.
	 * 
	 * @param a nova guma.
	 * @throws java.lang.RuntimeException     baca izuzetak u slucaju da guma vec
	 *                                        postoji u listi.
	 * @throws java.lang.NullPointerException baca izuzetak u slucaju da je uneta
	 *                                        guma null.
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Pronalazi gume odredjenog modela i vraca ih kao novu listu.
	 * 
	 * @param markaModel ime marke i modela.
	 * @return novaLista guma(sve gume koje imaju trazeni naziv markaModel).
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}
