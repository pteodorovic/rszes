package vezbe4.primer2;

public class Test {

	public static void main(String[] args) {

		///////////// rad sa konstruktorima i sa modifikatorima pristupa
		Student[] lista = new Student[4];
		
		//pozivanje konstruktora bez parametra
		Student student1 = new Student();
		student1.index = "e22";
		student1.imeIPrezime = "Petar Petrovic";
		student1.grad = "Novi Sad";	
		lista[0] = student1;

		//pozivanje konstruktora sa jednim parametrom
		Student student2 = new Student("e23|Petar Petrovic|Novi Sad|9;5;8;9;6");
		lista[1] = student2;
		
		//pozivanje konstruktora sa vise parametara
		Student student3 = new Student("e24", "Marko Markovic", "Stara Pazova");
		lista[2] = student3;
		
		/*pozivanje copy konstruktora sa parametrom tipa Student
			copy konstruktor omogucava preuzimanje svih vrednosti iz originala
			pravljenje kopija svih vrednosti */
		Student kopija = new Student(student1);
		kopija.index = "e25";
		lista[3] = kopija;
		
		
		for (int i = 0; i < lista.length; i++) {
			Student st = lista[i];
			//ispis vrednosti
			//TODO u narednoj liniji ispisati sve podatke o studentima (osim ocena)
			System.out.println("Student sa indeksom " + st.index );
		}
		
		System.out.println("Zavrsen rad sa konstruktorima");
	}

}
