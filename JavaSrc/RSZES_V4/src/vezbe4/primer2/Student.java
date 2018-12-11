package vezbe4.primer2;


public class Student {
	
	String index;
	String imeIPrezime;
	String grad;
	int[] ocene;
	
	/** KONSTRUKTORI ****/
	
	// konstruktor bez parametra
	public Student(){
		ocene = new int [4];
	}
	
	//konstruktor sa jednim parametrom
	//konstruktor koji dobija tekstualnu reprezentaciju
	public Student(String tekst){
		String [] tokeni = tekst.split("\\|");
		//npr. "e10002|Marko Markovic|Loznica|7;9;8;10"
		//tokeni 	0			1			2		3
		
		if(tokeni.length!=4){
			System.out.println("Greska pri ocitavanju");
			System.exit(0);
		}
		
		this.index = tokeni[0];
		this.imeIPrezime = tokeni[1];
		this.grad = tokeni[2];
		
		String [] oceneTekst = tokeni[3].split(";");
		//npr. 		"9;5;8;9"
		//tokeni 	 "0" 1 2 3
		
		ocene = new int [oceneTekst.length];
		for (int i = 0; i < this.ocene.length; i++) {
			ocene[i] = Integer.parseInt(oceneTekst[i]);
		}
	}
	
	//konstruktor sa vise parametara
	public Student(String index, String imeIPrezime, String grad) {
		this.index = index;
		this.imeIPrezime = imeIPrezime;
		this.grad = grad;
		ocene = new int [4];
	}
	
	//copy konstruktor sa parametrom tipa Student
	public Student(Student original) {
		index = original.index;
		imeIPrezime = original.imeIPrezime;
		grad = original.grad;
		
		int [] originalOcene  = original.ocene;
		ocene = new int [originalOcene.length];
		
		for (int i = 0; i < originalOcene.length; i++) {
			ocene[i] = originalOcene[i];
		}
	}
}
