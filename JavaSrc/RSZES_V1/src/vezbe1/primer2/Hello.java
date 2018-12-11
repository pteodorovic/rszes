package vezbe1.primer2;

//Ime klase je isto kao u prethodnom primeru, 
//ali to je samo SimpleName, puno ime je ime paketa + ime klase
//Trudimo se da je puno ime klase jedinstveno ne samo na nivou 
//naseg projekta, nego na globalnom nivou - pogledajte naziv paketa
public class Hello {


	public static void main(String[] args) {
			//Deklaracija lokalne varijable name koja je tipa String
		String name;
			//Dodela string literala "Student" varijabli name
			//ovo moze da bude i na odmah prilikom deklaracije
		name = "Student";
			//Konkatenacija stringova se vrsi pomocu operatora +
		System.out.println("HelloWorld " + name + "!");
			//Primer konkatenacije stringova koja se smesta u lokalnu promenljivu
			//pa tek onda ispisuje
		String message = "HelloWorld " + name + "!";
		System.out.println(message);
			//Specijalni karakteri se moraju eskejpovati pomocu \
		System.out.println("HelloWorld \"" + name + "\"!");
			//Specijalne konstrukcije \n i \t
		System.out.println("\nRed razmaka");
		System.out.println("\tUvucen tekst");
	}

}
