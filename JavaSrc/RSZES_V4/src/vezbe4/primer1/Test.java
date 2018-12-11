 package vezbe4.primer1;

public class Test {

	public static void main(String[] args) {
		//kreiramo objekat student koji je instanca klase Student
		Student stud = new Student();
		//postavimo atribute na odredjene vrednosti
		//e10002|Marko Markovic|Loznica|7;9;8;10
		stud.index = "e10002";
		stud.imeIPrezime = "Marko Markovic";
		stud.grad = "Loznica";
		int[] ocene = {7,9,8,10};
		stud.ocene = ocene;
		
		//pozivamo metode
		System.out.println("Prosecna ocena je " + stud.izracunajProsek());
		System.out.println("Najmanja ocena je " + stud.pronadjiNajmanjuOcenu());
		

	}

}
