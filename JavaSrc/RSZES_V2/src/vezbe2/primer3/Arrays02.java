package vezbe2.primer3;

public class Arrays02 {

	public static void main(String[] args) {
		int A [] = { 1 , 2 , 3 , 4 ,  5};	//deklaracija, alokacija i inicijalizacija
		
		//prikazi sumu niza A
		int suma = 0;
		for (int i = 0; i < A.length; i++)
			suma += A[i]; // suma = suma + niz[i];
		
		System.out.println("1. Suma niza A je:" + suma + "\n");
		
		//TODO pronaci maksimalni element niza A
		
		
		//definisanje visedimenzionalnih nizova
		int C [] [] = new int [4] [7];
		
		for (int i = 0; i < 4 ; i++ )
			for (int j = 0; j < 7 ; j++ )
				C[i][j] = j;
		
		//ispis clanova matrice C
		System.out.println("2. Ispis matrice C");
		for (int i = 0; i < 4 ; i++ )
			for (int j = 0; j < 7 ; j++ )
				System.out.println("C [" + i +"][" + j + "] clan niza je " + C[i][j]);
				
		//skraceni oblik, koje su dimenzije niza? sta se desava sa 48
		char D [] [] = { { 'a', 'b' ,'c'} , { 48 } , { '1', '2' , '3'} };
		
		//ispis clanova matrice D
		//probajte da zamenite granice sa 3 i 3
		System.out.println("");
		System.out.println("3. Ispis matrice D");
		for (int i = 0; i < D.length ; i++ )
			for (int j = 0; j < D[i].length ; j++ )
				System.out.println("D [" + i +"][" + j + "] clan niza je " + D[i][j]);
		
		//TODO DEFINISATI MATRICU nxm sledeceg oblika
		// utvrditi zavisnost za vrednost elementa u odnosu na brojace i i j
		/*
		 * 0 1 2 3
		 * 1 2 3 4
		 * 2 3 4 5
		 * 3 4 5 6
		 * 4 5 6 7
		 */
	}
}
