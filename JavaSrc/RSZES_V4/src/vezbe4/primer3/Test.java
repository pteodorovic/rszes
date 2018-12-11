package vezbe4.primer3;



public class Test {

	public static void main(String[] args) {
		
		/////////////modifikatorima pristupa

		//pozivanje konstruktora bez parametra
		Student student1 = new Student();
		
		//index je public, pa moze svuda da mu se pristupi
		student1.index = "e22";
		
		//ime je protected, moze u klasi koja nasledjuje ili u klasi koja je u istom paketu
		student1.imeIPrezime = "Petar Petrovic";
		System.out.println(student1.imeIPrezime);
		
		//grad je unspecified (friendly) moze samo iz istog paketa
//		student1.grad = "Novi Sad";
		
		//ocene je private zabranjen pristup
//		student1.ocene = new int [4];

		//ako je metoda public poziv je moguc uvek iz bilo koje klase
		student1.publicMogucPoziv();
		
		//ako je metoda protected poziv je moguc samo u okviru klasa koje nasledjuju ili u okviru klasa iz istog paketa
		student1.protectedMogucPoziv();
		
		//ako je metoda private poziv je moguc samo u okviru same klase u kojoj je metoda napisana
//		student1.privateNemogucPoziv();
		student1.publicMetodaUmetodi();

		System.out.println("Zavrsen rad sa modifikatorima pristupa");
		System.out.println("-------------------------------------------");
		
		///////////// rad sa static atributima
		//moze i preko objekta, ali eclipse daje warning
		student1.indexCounter = 25;
		System.out.println(student1.indexCounter);
		
		//ne mora postojati objekat da bi se pristupilo static atributu
		Student.indexCounter = 10;
		System.out.println(student1.indexCounter);
		
		//static final atribut se moze procitati, ali se ne moze menjati
		System.out.println(Student.INDEX_LETTER);
//		Student.INDEX_LETTER = "a";
		
		//slicna je situacija i sa static metodama
		System.out.println("Zavrsen rad sa static atributima");
		System.out.println("-------------------------------------------");
	}
	
}
