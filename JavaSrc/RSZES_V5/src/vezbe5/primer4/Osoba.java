package vezbe5.primer4;

//apstraktna klasa Osoba, moze je naslediti Student, Profesor, itd.
// u klasama naslednicama dodajemo specificnosti: 
// Student - brojIndeksa, ocene; 
// Profesor - zvanje, plata, radno mesto, predmeti koje drzi, itd.
public abstract class Osoba {
	
	protected String JMBG;
	protected String imeIPrezime;
	protected String grad;	
	
	public Osoba() { }

	public Osoba(String jMBG, String imeIPrezime, String grad) {
		JMBG = jMBG;
		this.imeIPrezime = imeIPrezime;
		this.grad = grad;
	}

	//prebacivanje objekta Student u string reprezentaciju
	@Override
	public String toString() {
		return "Osoba cije je ime " + imeIPrezime + " iz grada " + grad;
	}
	
	public String getJMBG() {
		return JMBG;
	}
	
	public void setJMBG(String jMBG) {
		JMBG = jMBG;
	}
	
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}
}
