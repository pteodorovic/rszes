package samostalni;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class SamostalniVezbe3Zad01 {

		
	public static int ocitajPodatkeIzFajla(String [] indexSt, String [] namesSt, String [] codePr, 
			String [] namesPr, int [] pointsT, int [] pointsP, double [] average, int [] grades) throws IOException{

		//brojac rezultata
		int brojacRezultata = 0;
	
		String sP = System.getProperty("file.separator");	
		File rezultati = new File("."+sP+"data"+sP+"rezultati.csv");
		
		if(rezultati.exists()){
//			BufferedReader in = new BufferedReader(
//				new InputStreamReader(new FileInputStream( 
//				rezultati), "UTF8")); 
			BufferedReader in = new BufferedReader(
					new FileReader(rezultati));
			String s2;
			
			while((s2 = in.readLine()) != null) {
//				System.out.println(s2);
				
				String [] infoSt = s2.split(",");
				//popunjavanje podataka
				//popunjavanje podataka
				indexSt[brojacRezultata] 	= infoSt[0];
				namesSt[brojacRezultata]	= infoSt[1];
				codePr[brojacRezultata]		= infoSt[2];
				namesPr[brojacRezultata]	= infoSt[3];
				pointsT[brojacRezultata]	= Integer.parseInt(infoSt[4]);
				pointsP[brojacRezultata]	= Integer.parseInt(infoSt[5]);
				average[brojacRezultata]	= Double.parseDouble(infoSt[6]);
				grades[brojacRezultata]		= Integer.parseInt(infoSt[7]);	

				//uvecavamo brojac da znamo koliko rezultata smo do sada ocitali
				brojacRezultata++;
			}
			in.close();
		} else {
			System.out.println("Ne postoji fajl!");
			System.exit(0);
		}

		return brojacRezultata;
	}
	
	public static void sacuvajPodatkeUFajl(String [] indexSt, String [] namesSt, String [] codePr, 
			String [] namesPr, int [] pointsT, int [] pointsP, double [] average, int [] grades, int brojacRezultata) throws IOException{
		System.out.println("---------SNIMANJE----------");
		String sP = System.getProperty("file.separator");
		File rezultati = new File("."+sP+"data"+sP+"rezultati.csv");
//		PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(rezultati), "UTF8"));
		PrintWriter out = new PrintWriter(new FileWriter(rezultati));	
		for (int i = 0; i < brojacRezultata; i++) {
			
			StringBuffer buf = new StringBuffer(indexSt[i]+","+namesSt[i]+","); //ubaci indeks, ime studenta
			buf.append(codePr[i]+","+namesPr[i]+","); //sifru predmeta, ime predmeta
			buf.append(pointsT[i]+","+pointsP[i]+","); //bodove iz teorije i prakticnog dela
			buf.append(average[i]+","+grades[i]); //prosecan broj bodova i konacnu ocenu
			out.println(buf.toString());
		}
		out.flush();
		out.close();
		System.out.println("--------Snimanje Zavrseno-----");

	}
	
	public static void izpisiGlavniMeni(){
		//definisanje izgleda menija
		System.out.println("-----------------------------------");
		System.out.println("Studentska Sluzba opcije:");
		System.out.println("\t1.Ispis svih rezultata");
		System.out.println("\t2.Ispis podataka o odredjenom rezultatu");
		System.out.println("\t3.Izmena odredjenog rezultata");
		System.out.println("\t0.Izlaz iz programa");
		//citanje odluke
		System.out.println("-----------------------------------");
		System.out.print("Odaberite opciju: ");
	}
	
	public static void ispisPodatakaORezultatu(String [] indexSt, String [] namesSt, String [] codePr, 
			String [] namesPr, int [] pointsT, int [] pointsP, double [] average, int [] grades){
		System.out.println("-----------------------------------");
		System.out.print("Unesite redni broj rezultata: ");
		int n = Utility.ocitajCeoBroj();;
		n -=1;
		System.out.println("-----------------------------------");
		System.out.println("Student:"+namesSt[n]+" sa indeksom:"+indexSt[n]+" na predmetu "+namesPr[n]+
				" sa sifrom "+codePr[n]+" ima "+pointsT[n]+"+"+pointsP[n]+"="+average[n]+ " i dobio je "+grades[n]);
	}
	
	public static void izmenaPodatakaORezultatu(String [] namesPr, int [] pointsT, int [] pointsP, double [] average, int [] grades){
		System.out.println("-----------------------------------");
		System.out.print("Unesite redni broj rezultata: ");
		int n = Utility.ocitajCeoBroj();
		n -=1;
		System.out.println("Unesite novi broj bodova iz teorije:");
		int brTeorija = Utility.ocitajCeoBroj();
		System.out.println("Unesite novi broj bodova iz prakticnog dela:");
		int brPrakticni = Utility.ocitajCeoBroj();
		System.out.println("Unesite prosecan broj bodova:");
		double brProsecni = Utility.ocitajRealanBroj();
		System.out.println("Unesite konacnu ocenu:");
		int ocena = Utility.ocitajCeoBroj();
		pointsT[n]	= brTeorija;
		pointsP[n]	= brPrakticni;
		average[n]	= brProsecni;
		grades[n]	= ocena;
	}
	
	public static void main(String[] args) throws IOException {
		//brojac rezultata
		int brojacRezultata = 0;
				
		//definisanje odgovarajucih struktura  
		String [] indexSt = new String [100];
		String [] namesSt = new String [100];
		String [] codePr = new String [100];
		String [] namesPr = new String [100];
		int []    pointsT = new int    [100];
		int []    pointsP = new int    [100];
		double [] average = new double [100];
		int []    grades  = new int    [100];
				
		brojacRezultata = ocitajPodatkeIzFajla(indexSt, namesSt, codePr, namesPr, pointsT, pointsP, average, grades);
		
		//LOGIKA APLIKACIJE
		int choice = 0;
		do{
			izpisiGlavniMeni();
			choice = Utility.ocitajCeoBroj();
			
			//ispisivanje podataka u odnosu na odluku
			System.out.println("Odluka je:"+choice);
			switch (choice) {
				case 1: 
					System.out.println("-----------------------------------");
					for (int i = 0; i < brojacRezultata; i++) {
						System.out.println((i+1) + namesSt[i]+" "+namesPr[i]+" "+grades[i]);
					}
					break;
				case 2: 
					ispisPodatakaORezultatu(indexSt, namesSt, codePr, namesPr, pointsT, pointsP, average, grades);
					break;
				case 3:
					izmenaPodatakaORezultatu(namesPr, pointsT, pointsP, average, grades);
					break;
				case 0: 
					System.out.println("--------IZLAZ------------");
					break;
				default: 
					System.out.println("Nepostojeca komanda");
					break;
			}
			
		}while (choice != 0);
		
		sacuvajPodatkeUFajl(indexSt, namesSt, codePr, namesPr, pointsT, pointsP, average, grades, brojacRezultata);
		System.out.println("Program izvrsen");
	}
}
