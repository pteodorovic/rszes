package vezbe2.primer3;

public class Arrays01 {

	public static void main(String[] args) {
		//naredni kod definise niz koji sadrzi prvih 5 prirodnih brojeva
		int A [];			//deklaracija niza ciji su elementi celi brojevi
		A = new int [5]; 	//alokacija 5 memoriskih polja velicine celobrojnog tipa
		A[0]  = 1;			//promena vrednosti 1. elementa niza
		A[1]  = 2;			//promena vrednosti 2. elementa niza
		A[2]  = 3;			//promena vrednosti 3. elementa niza
		A[3]  = 4;			//promena vrednosti 4. elementa niza
		A[4]  = 5;			//promena vrednosti 5. elementa niza
		
		//skraceni oblik ovog istog
		int B [] = { 1 , 2 , 3 , 4 ,  5};	//deklaracija, alokacija i inicijalizacija
		
		// elementi niza mogu da budu vrednost konstante, promenljive, rezultati poziva funkcije
		// niz celih, sta ce da se desi sa 11/3
		int broj = 2;
		int[] Celi = { 7, 5, broj, 9, 11/3, -13, 1 };
		
		// niz realnih
		double[] Realni = { Math.PI/2, 3.0, 2+3/5, Math.E, Math.sqrt(3)};
		
		// niz reci
		String[] Imena = { "Pera", "Mika", "Laza" };
		
		//pristup elementu niza A
		System.out.println("1. Peti element niza A je " + A[4] +"\n");
		
		//ispis niza pomocu metode toString, pogledajte rezult
		System.out.println("2. Niz A je " + A.toString()+"\n");
		
		//ispis elemenata niza A
		System.out.println("3. Ispis elemenata niza");
		for (int i = 0; i < A.length ; i++ )
			System.out.println(i+ " clan niza A je " + A[i]);
		
		//TODO ISPISATI NIZA Imena u obrnutom redosledu
	}
}
