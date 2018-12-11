package vezbe1.primer3;

//ovo je jednolinijski komentar, precica je Ctrl + /
/*
 * Ovo je viselinijski komentar, 
 * precica je Ctrl + Shift + /
 * pre toga se selektuje tekst koji zelimo da stavimo pod komentar
 */
public class IfStatement {

	public static void main(String[] args) {
			// znacenje null vrednosti cemo diskutovati kasnije
		String name = null;
			//if naredba, uslovno izvrsavanje koda 
		if(name == null)
			System.out.println("name == null");
		
			//if else
			// == poredi da li su dva objekta ista
			// .equals() metoda poredi dva stringa, karakter po karakter
		name = "Student";
		String name1 = new String("Student");
		if(name == name1)
			System.out.println("Poredjenje vrednosti Stringova MOZE sa ==");
		else {
			System.out.println("Poredjenje vrednosti Stringova NE MOZE sa ==, za poredjenje koristiti metodu name.equals(name1)");
		}
			// else deo moze da ima novi if
		if(name.equals("student")){
			System.out.println("name.equals(student)");
		} else if(name.equalsIgnoreCase("student")){
			System.out.println("name.equalsIgnoreCase(student)");
		} else 
			System.out.println("! name.equalsIgnoreCase(student)");
		
			//uslovni ternarni operator
		System.out.println("Conditional operator");
		String message = ((2==3)?"Tacan uslov":"Netacan uslov");
		System.out.println(message);
	}

}
