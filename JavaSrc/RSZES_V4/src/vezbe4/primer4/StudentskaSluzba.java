package vezbe4.primer4;

public class StudentskaSluzba {

	/** ATRIBUTI KLASE ****/
	//zauzimamo vise nego sto nam u startu treba, jer niz ne mozemo kasnije povecati
	public static Student[] sviStudenti = new Student[100];
	public static int brojStudenata = 0;
	
	/** METODE ZA ISPIS OPCIJA ****/
	//ispis teksta osnovnih opcija
	public static void ispisiTekstOsnovneOpcije(){	
		System.out.println("Studentska Sluzba - Osnovne opcije:");
		System.out.println("\tOpcija broj 1 - Rad sa studentima");
		System.out.println("\t\t ...");
		System.out.println("\tOpcija broj 0 - IZLAZ IZ PROGRAMA");	
	}
	
	public static void ispisiTekstStudentOpcije(){	
		System.out.println("Rad sa studentima - opcije:");
		System.out.println("\tOpcija broj 1 - unos podataka o novom studentu");
		System.out.println("\tOpcija broj 2 - izmena podataka o studentu");
		System.out.println("\tOpcija broj 3 - ispis podataka svih studenata");
		System.out.println("\tOpcija broj 4 - ispis podataka o odredenom studentu sa njegovim ocenama");
		System.out.println("\tOpcija broj 5 - unos ocena i racunanje proseka studenta");
		System.out.println("\t\t ...");
		System.out.println("\tOpcija broj 0 - IZLAZ");	
	}
	
	/** METODE ZA ISPIS STUDENATA i ocena ****/
	//ispisi sve studente
	public static void ispisiSveStudente(){
		for (int i = 0; i < brojStudenata; i++) {
			System.out.println(sviStudenti[i]);
		}
	}
		
	//ispisi ocene studenta
	public static void ispisiOcene(Student st){
		System.out.println(st.toStringOcene());
	}
	
	/** METODE ZA PRETRAGU STUDENATA****/
	//pronadji studenta
	public static Student pronadjiStudenta(){
		Student retVal = null;
		System.out.println("Unesi indeks studenta:");
		String stIndex = Utility.ocitajTekst();
		retVal = pronadjiStudenta(stIndex);
		if(retVal == null)
			System.out.println("Student sa indeksom " +stIndex + " ne postoji u evidenciji");
		return retVal;
	}
	
	//pronadji studenta
	public static Student pronadjiStudenta(String stIndex){
		Student retVal = null;
		for (int i = 0; i < brojStudenata; i++) {
			Student st = sviStudenti[i];
			if (st.equals(stIndex)) {
				retVal = st;
				break;
			}
		}
		return retVal;
	}
	public static int pronadjiPozicijuStudenta(){
		int retVal = -1;
		System.out.println("Unesi indeks studenta:");
		String stIndex = Utility.ocitajTekst();
		for (int i = 0; i < sviStudenti.length; i++) {
			Student st = sviStudenti[i];
			if (st.equals(stIndex)) {
				retVal = i;
				break;
			}
		}
		if(retVal == -1)
			System.out.println("Student sa indeksom " +stIndex + " ne postoji u videnciji");
		return retVal;
	}
	
	/** METODE ZA UNOS i IZMENU STUDENATA****/
	
	//unos novog studenta
	public static void unosNovogStudenta(){
		System.out.print("Unesi index:");
		String stIndex = Utility.ocitajTekst();
		stIndex = stIndex.toUpperCase();
		while(pronadjiStudenta(stIndex) != null){
			System.out.println("Student sa indeksom "+stIndex + " vec postoji");
			stIndex = Utility.ocitajTekst();
		}
		System.out.print("Unesi ime i prezime:");
		String stImeIPrezime = Utility.ocitajTekst();
		System.out.print("Unesi grad:");
		String stGrad  = Utility.ocitajTekst();
		
		Student st = new Student(stIndex, stImeIPrezime, stGrad);
		sviStudenti[brojStudenata] = st;
		brojStudenata++;
		
		if (Utility.ocitajOdlukuOPotvrdi("uneti ocene") == 'Y') {
			unosOcena(st);
		}
	}
	
	//izmena studenta
	public static void izmenaPodatakaOStudentu(){
		Student st  = pronadjiStudenta();
		if(st != null){
			System.out.print("Unesi ime i prezime:");
			String stImeIPrezime = Utility.ocitajTekst();
			System.out.print("Unesi grad:");
			String stGrad  = Utility.ocitajTekst();
			
			st.setImeIPrezime(stImeIPrezime);
			st.setGrad(stGrad);
			
			
			if (Utility.ocitajOdlukuOPotvrdi("izmeniti ocene") == 'Y') {
				st.setOcene(new int[4]);
				unosOcena(st);
			}
		}
	}
	
	/** METODA ZA UNOS i IZMENU OCENA STUDENTA****/
	//unos ocene studenta
	public static void unosOcena(Student st){
		for(int i=0; i < st.getOcene().length; i++){

			System.out.print("Unesi "+(i+1)+"ocenu:");
			int ocOcena  = -1;
			do {
				ocOcena = Utility.ocitajCeoBroj();
				if(ocOcena<5 && ocOcena > 10)
					System.out.println("Greska - Ocena se unosi u rasponu od 5 do 10");
			}while ((ocOcena < 5) || (ocOcena > 10));
			
			st.getOcene()[i] = ocOcena;
		}
	}
	
		/** METODA ZA UCITAVANJE PODATAKA****/
	public static void ucitavanjePodataka(){

		//	ucitavanje studenata
		sviStudenti[brojStudenata] = new Student("e1|Petar Petrovic|Novi Sad|8;9;7;9");
		brojStudenata++;
		sviStudenti[brojStudenata] = new Student("e2|Marko Markovic|Loznica|8;7;7;6");
		brojStudenata++;
		sviStudenti[brojStudenata] = new Student("e3|Nikolic Nikolic|Indjija|9;8;8;7");
		brojStudenata++;
	}
		
	

}
