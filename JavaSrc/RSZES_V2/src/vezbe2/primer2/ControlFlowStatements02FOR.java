package vezbe2.primer2;

public class ControlFlowStatements02FOR {

	public static void main(String[] args) {
		
		/*	 
		for (inicijalizacija; logicki uslov; korekcija) {
		 		naredbe koje se izvrsavaju sve dok inicijalna 
		 		vrednost ne dostigne granicu
		}
		 */
		
		//ako znate da je potrebno deset puta uraditi istu stvar onda sledeca for petlja
		for(int i = 0; i < 10; i++){
			System.out.println("Usao sam u for petlju " + i + ". put");
		}
		
		System.out.println("*********************************************\n");
		//ispis prvih N prirodnih brojeva
		int granica = 10;
		System.out.println("Ispis prvih N="+granica+" prironih brojeva");
		for ( int i = 1; i <= granica; i++ ){
			System.out.print(i+" ");
		}
	
		//TODO napisati da ide unazad od 10 do 1
		
		//TODO prebrojati koliko cetvrtina ima izmedju broja -1 i 1.5. 
		//Ispisati odgovarajucu poruku na ekran

	}

}
