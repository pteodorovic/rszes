package vezbe4.primer3;


public class Student {
	
	//modifikatori pristupa, sta koji znaci?
	public 		String index;
	protected 	String imeIPrezime;
				String grad;
	private int[] ocene;
	
	public void publicMogucPoziv(){
		System.out.println("public moguc poziv");
	}
	
	protected void protectedMogucPoziv(){
		System.out.println("protected moguc poziv");
	}
	
	private void privateNemogucPoziv(){
		System.out.println("private nemoguc poziv");
	}
	
	public void publicMetodaUmetodi(){
		System.out.println("Poziv unutar metode:");
		privateNemogucPoziv();
	}
	
	//staticki atribut koji se moze menjati
	public static int indexCounter = 1;
	//staticki atribut koji se ne moze menjati, ovo je zapravo konstanta
	//obicno se konstante pisu velikim slovima
	public static final String INDEX_LETTER = "e"; 
		
	
	//TODO POSTAVI SET i GET metode za ostale atribute
	
	
}
