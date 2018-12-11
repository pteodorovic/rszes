package vezbe4.primer1;

//klasa
class Student {

	//atributi
	String index;
	String imeIPrezime;
	String grad;
	int[] ocene;
	
	
	//metode
	double izracunajProsek(){	
		double retVal = 0;
		if(ocene == null)
			return retVal;
		
		int suma = 0;
		for (int i = 0; i < ocene.length; i++) {
			suma+=ocene[i];
		}
		//zasto stoji (double)?
		retVal = (double)suma/ocene.length;
		return retVal;
	}
	
	int pronadjiNajmanjuOcenu(){	
		int minOcena = 10;
		//TODO pronaci najmanju ocenu
		for (int ocena : ocene){
			minOcena=(ocena<minOcena)?ocena:minOcena;
		}
		return minOcena;
	}
	
/*	void postaviNovoStanje(String novoImeIPrezime){
		imeIPrezime = novoImeIPrezime;
	}
	
	void postaviNovoStanje(String imeIPrezime, String grad){
		this.imeIPrezime = imeIPrezime;
		this.grad = grad;
	}
*/
}
