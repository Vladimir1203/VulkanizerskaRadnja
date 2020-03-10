package gume;


/**
 * Date: March 10-2020
 * Klasa AutoGuma sa svojim funkcionalnostima.
 * @author Vladimir Lazic
 * @version 0.0.1
 *
 */
public class AutoGuma {
	/**
	 * Naziv marke i modela.
	 */
	private String markaModel = null;
	/**
	 * Precnik gume zadat u incima.
	 */
	private int precnik = 0;	
	/**
	 * Sirina gume zadata u centimetrima.
	 */
	private int sirina = 0;
	/**
	 * Visina gume zadata u centimetrima.
	 */
	private int visina = 0;
	/**
	 *  Vraca naziv marke i modela kao string.
	 * @return markaModel naziv marke i modela.
	 */
	public String getMarkaModel() {
	return markaModel;
	}
	/**
	 * Postavlja naziv marke i modela na zadatu vrednost.
	 * @param markaModel naziv marke i modela gume.
	 * @throws java.lang.RuntimeException ako je markaModel null ili duzina Stringa kraca od 3 karaktera.
	 */
	public void setMarkaModel(String markaModel) {
	if (markaModel==null || markaModel.length()<3)
	throw new RuntimeException("Morate uneti marku i model");
	this.markaModel = markaModel;
	}
	/**
	 * Vraca precnik gume.
	 * @return precnik gume.
	 */
	public int getPrecnik() {
	return precnik;
	}
	/**
	 * Postavlja precnik gume na zadatu vrednost.
	 * @param precnik duzina precnika u incima.
	 * @throws java.lang.RuntimeException baca izuzetak u slucaju unosa precnika  manjeg od 13 ili veceg od 22.
	 */
	public void setPrecnik(int precnik) {
	if (precnik < 13 || precnik > 22)
	throw new RuntimeException("Precnik van opsega");
	this.precnik = precnik;
	}
	/**
	 * vraca sirinu gume.
	 * @return sirina gume.
	 */
	public int getSirina() {
		return sirina;
	}
	/**
	 * Postavlja sirinu gume na zadatu vrednost.
	 * @param sirina nova vrednost za sirinu gume.
	 * @throws java.lang.RuntimeException ako je uneta sirina manja 135 ili veca od 355.
	 */
		public void setSirina(int sirina) {
			if (sirina < 135 || sirina > 355)
				throw new RuntimeException("Sirina van opsega");
			this.sirina = sirina;
		}
	/**
	 * vraca visinu gume.
	 * @return visina gume.
	 */
		public int getVisina() {
			return visina;
		}
	/**
	 * Postavlja visinu gume na zadatu vrednost.
	 * @param visina nova vrednost za visinu gume.
	 * @throws java.lang.RuntimeException ako je uneta visina manja od 25 ili veca 95.
	 */
		public void setVisina(int visina) {
			if (visina < 25 || visina > 95)
				throw new RuntimeException("Visina van opsega");
			this.visina = visina;
		}
	/**
	 * Vraca String reprezentaciju klase AutoGuma i to:
	 * marku i model, precnik, sirinu i visinu gume.
	 * @return AutoGuma kao string.
	 */
		@Override
		public String toString() {
			return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
					+ visina + "]";
		}
	/**
	 * Proverava da li su dva objekta klase AutoGuma jednaki po
	 * atributima: markaModel,precnik,sirina,visina.
	 * 
	 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			AutoGuma other = (AutoGuma) obj;
			if (markaModel == null) {
				if (other.markaModel != null)
					return false;
			} else if (!markaModel.equals(other.markaModel))
				return false;
			if (precnik != other.precnik)
				return false;
			if (sirina != other.sirina)
				return false;
			if (visina != other.visina)
				return false;
			return true;
		}

	}
