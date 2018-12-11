package vezbe4.primer4;

public class Test {
	
public static void main(String[] args) {
		
		StudentskaSluzba.ucitavanjePodataka();
		int odluka = -1;
		while(odluka!= 0){
			StudentskaSluzba.ispisiTekstOsnovneOpcije();
			System.out.print("opcija:");
			odluka = Utility.ocitajCeoBroj();
			switch (odluka) {
				case 0:	
					System.out.println("Izlaz iz programa");	
					break;
				case 1:
					int odlukaS = -1;
					while(odlukaS!= 0){
						StudentskaSluzba.ispisiTekstStudentOpcije();
						System.out.print("opcija:");
						odlukaS = Utility.ocitajCeoBroj();
						switch (odlukaS) {
							case 0:	
								System.out.println("Izlaz");	
								break;
							case 1:	
								StudentskaSluzba.unosNovogStudenta();	
								break;
							case 2:	
								StudentskaSluzba.izmenaPodatakaOStudentu();	
								break;
							case 3:	
								StudentskaSluzba.ispisiSveStudente();
								break;
							case 4:	
								Student st = StudentskaSluzba.pronadjiStudenta();
								if(st!=null){
									System.out.println(st);
									StudentskaSluzba.ispisiOcene(st);
								}	
								break;
							case 5:	
								Student ocStudent = StudentskaSluzba.pronadjiStudenta();
								if(ocStudent!=null){
									StudentskaSluzba.unosOcena(ocStudent);
								}	
								break;
							default:
								System.out.println("Nepostojeca komanda");
								break;	
						}
					}
					break;
				default:
					System.out.println("Nepostojeca komanda");
					break;
			}
		}
		
		System.out.print("Program izvrsen");
	}

}
