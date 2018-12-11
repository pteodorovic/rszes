package vezbe2.primer1;

public class PrimitiveTypes01 {

	public static void main(String[] args) {
		//deklaracija i inicijalizacija vrednosti
		int a = 1;
		double b = 3.14;
		
		//implicitna konverzija, sa manjeg na veci tip MOZE
		System.out.println("1. Stara vrednost b=" + b);
		b = a;
		System.out.println("1. Nova vrednost b=" + b +"\n");
		
		//implicitna konverzija, sa veceg na manji tip NE MOZE
		//naredna linija vraca gresku, odkomentarisite kod
//		a = b;
		
		//eksplicitna konverzija moze, dolazi do gubitka podataka
		System.out.println("2. Stara vrednost a=" + a);
		b = 3.56;
		a = (int)b;
		System.out.println("2. Nova vrednost a=" + a +"\n");
		
		//ARITMETICKI OPERATORI
		//operator + za sabiranje, isprobajte operatore - , * , /
		a = 1+1;
		b = a + 3.14; 
		System.out.println("3. Nova vrednost b=" + b +"\n");
		
		//prioritet operacija
		//da li je rezultat 4 ?, za definisanje prioriteta koristite zadrade
		a = 1+1*2; 
		System.out.println("4. Nova vrednost a=" + a +"\n");
		
		// koriscenje kombinovanog operatora a+=3 isto kao i a=a+3
		// isprobajte za -= , *=
		System.out.println("5. Stara vrednost a=" + a);
		a += 3;
		System.out.println("5. Nova vrednost a=" + a +"\n");
		
		//razlika izmedju prefiksnog ++l i sufiksnog l++
		a=4;
		System.out.println("6. a je " + ++a +"\n");
		a=4;
		System.out.println("7. a je " + a++);
		System.out.println("7. a je " + a +"\n");
		
		//operator %, ostatak pri deljenju
		b=a%2;
		System.out.println("8. Ostatak pri deljenju "+ a + " i 2 je "+b);
	}

}
