package vezbe5.primer3;

import java.util.ArrayList;
import java.util.List;

public class Student extends Osoba implements Comparable{

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student){
            Student st = (Student) o;
            if (this.izracunajProsek() == st.izracunajProsek())
                return 0;
            else
                return this.izracunajProsek()>st.izracunajProsek()? -1 : 1;
        }
        return super.compareTo(o);
    }

	private String index;
	//nije vise hard kodirano da mora biti cetiri ocene
	private List<Integer> ocene;
	
	public Student() {
		super();
		ocene = new ArrayList<Integer>();
	}
	
	public Student(String JMBG, String imeIPrezime, String grad, String index) {
		super(JMBG, imeIPrezime, grad);
		this.index = index;
		ocene = new ArrayList<Integer>();
	}

	public Student(String jMBG, String imeIPrezime, String grad, String index,
			List<Integer> ocene) {
		super(jMBG, imeIPrezime, grad);
		this.index = index;
		this.ocene = ocene;
	}

	public Student(String tekst){
		String [] tokeni = tekst.split(",");
		//npr. "0000000000001,Petar Petrovic,Loznica,RS 01/11,8;7;6;"
		//tokeni 0				1				2		3		4	
		
		if(tokeni.length!=5){
			System.out.println("Greska pri ocitavanju 1-Student " +tekst);
			System.exit(0);
		}
		this.JMBG = tokeni[0];
		this.imeIPrezime = tokeni[1];
		this.grad = tokeni[2];
		this.index = tokeni[3];
	
		this.ocene = new ArrayList<Integer>();
		String [] oceneTekst = tokeni[4].split(";");
		//npr. 		"8;9;7;8"
		//tokeni 	 0 		1	   2
		for (int i = 0; i < oceneTekst.length; i++) {
			try {
				ocene.add(Integer.parseInt(oceneTekst[i]));
			} catch (Exception e) {
				System.out.println("Greska pri ocitavanju 4");
				System.exit(0);
			}
		}
	}
	
	public double izracunajProsek(){	
		double retVal = 0;
		if(ocene == null || ocene.isEmpty())
			return retVal;
		
		int suma = 0;
		for (int i = 0; i < ocene.size(); i++) {
			suma+=ocene.get(i);
		}
		retVal = (double)suma/ocene.size();
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
		for (int i = 0; i < ocene.size(); i++) {
			int oc  = ocene.get(i);		
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
	

	public List<Integer> getOcene() {
		return ocene;
	}

	public void setOcene(List<Integer> ocene) {
		this.ocene = ocene;
	}
}
