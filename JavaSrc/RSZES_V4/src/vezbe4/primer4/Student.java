package vezbe4.primer4;

public class Student {

	private String index;
	private String imeIPrezime;
	private String grad;	
	private int[] ocene;
	
	
	public Student() {
		ocene = new int[4];
	}
	
	public Student(String index, String imeIPrezime, String grad) {
		super();
		this.index = index;
		this.imeIPrezime = imeIPrezime;
		this.grad = grad;
		this.ocene = new int[4];
	}
	
	public Student(String index, String imeIPrezime, String grad,
			int[] ocene) {
		super();
		this.index = index;
		this.imeIPrezime = imeIPrezime;
		this.grad = grad;
		this.ocene = ocene;
	}

	public Student(String tekst){
		String [] tokeni = tekst.split("\\|");
		//npr. "e24|Petar Petrovic|Loznica|8;9;7;8"
		//tokeni 0			1		2		3			
		
		if(tokeni.length!=4){
			System.out.println("Greska pri ocitavanju 1-Student");
			System.exit(0);
		}
		
		this.index = tokeni[0];
		this.imeIPrezime = tokeni[1];
		this.grad = tokeni[2];
		
		this.ocene = new int[4];
		String [] oceneTekst = tokeni[3].split(";");
		//npr. 		"8;9;7;8"
		//tokeni 	 0 		1	   2
		for (int i = 0; i < oceneTekst.length; i++) {
			try {
				ocene[i] = Integer.parseInt(oceneTekst[i]);
			} catch (Exception e) {
				System.out.println("Greska pri ocitavanju 4");
				System.exit(0);
			}
		}
	}
	
	public double izracunajProsek(){	
		double retVal = 0;
		if(ocene == null)
			return retVal;
		
		int suma = 0;
		for (int i = 0; i < ocene.length; i++) {
			suma+=ocene[i];
		}
		retVal = (double)suma/ocene.length;
		return retVal;
	}
	
	//prebacivanje objekta Student u string reprezentaciju
	@Override
	public String toString() {
		return "Student sa indeksom:" + index + " cije je ime " + imeIPrezime
				+ " iz grada " + grad + " ima prosecnu ocenu:" + izracunajProsek();
	}
	//da li su dva objekta Student ista (isti su ako imaju isti index), 
	//	ali moze i Student da se poredi sa String-om koji je broj indeksa
	@Override
	public boolean equals(Object obj) {
		boolean isti = false;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof Student) {
			Student objStudent = (Student) obj;
			if(this.index.equals(objStudent.index))
				return true;
		}
		//porednjenje Studenta i Stringa koji je broj indeksa
		if (obj instanceof String) {
			if(this.index.equals(obj))
				return true;
		}
		return isti;
	}
	public String toStringOcene() {
		String retVal = "";
		for (int i = 0; i < ocene.length; i++) {
			int oc  = ocene[i];		
			retVal+=(i+1)+": "+oc+"\n";
		}
		return retVal;		
	}

	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
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

	public int[] getOcene() {
		return ocene;
	}

	public void setOcene(int[] ocene) {
		this.ocene = ocene;
	}	
}
