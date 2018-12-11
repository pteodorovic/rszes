package vezbe2.primer1;

public class PrimitiveTypes02 {

	public static void main(String[] args) {
		//deklaracija i inicijalizacija vrednosti
		double a = 20;

		//ARITMETICKI I LOGICKI OPERATORI
		//provera cemu je jednako a, sta ce biti ispisano?
		if (a == 20)
			System.out.println("a je 20\n");
		else if ((a<7) && (a>3))
				System.out.println("a je vece od 3 i manje od 7\n");
		else
			System.out.println("a nije 20, i nije izmedju 3 i 7 nego je " + a +"\n");
		
		//formatizovani ispis na ekran
		System.out.printf("Ispis celog broja %d \n", 10);
		System.out.printf("Ispis karaktera %c \n", 'A');
		System.out.printf("Ispis razlomljenog broja %f \n", 3.13);
		System.out.printf("Ispis razlomljenog broja preciznosti 2 decimale %.2f \n\n", 3.13);
		
		System.out.println("Ispis vise atributa");
		System.out.printf("%d,%c,%f \n\n", 10, 'A', 3.13);
		
		System.out.println("Poravnjanja");
		System.out.printf("%10d \n", 1);
		System.out.printf("%10d \n", 100);
		System.out.printf("%10d \n", 1000000);
	}

}
