package vezbe;

import java.util.Scanner;

public class Main {

	// Deklarisanje i inicijalizacija
	public static void prvaVezba() {
		int broj;
		// Inicijalizacija
		broj = 50;
		broj = 20;
		broj = 30;
		
		//nevlidno broj = "Tekst"
		
		//Deklarisanje i incijalizaija istovremeno
		double decimalniBroj = 50.5;
		String tekst = "Nas prvi string";
		
		System.out.println(broj);
		System.out.println("Decimalni broj koji imamo je: " + decimalniBroj);
		System.out.println(tekst);
	}
	
	//Parni i neparni brojevi - if else struktura
	public static void drugaVezba() {
		//Scanner sluzi za prkupljanje inputa sa konzole
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = scanner.nextInt();
		
		//Operator koji se zove moduo sluza za raunanje ostatka pri deljenju 
		if(broj % 2 == 0) {
			System.out.println("Broj" + broj + "je paran");
		}else {
			System.out.println("Broj" + broj + "je neparan");
		}
	}
	
	//For i while
	public static void trecaVezba() {
		System.out.println("Unesite broj");
		Scanner scanner = new Scanner(System.in);
		int broj = scanner.nextInt();
		
		//For petlja
		for(int brojac = 0; brojac <= broj; brojac++) {
			System.out.println(brojac);
		}
		
		//While petlja
		int brojac = 0;
		while(brojac <= broj) {
			System.out.println(brojac);
			brojac++;
		}
	}
	
	public static void main(String[] args) {
		//prvaVezba();
		//drugaVezba();
		trecaVezba();
	}

}
