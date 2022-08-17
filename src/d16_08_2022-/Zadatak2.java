package d16_08_2022;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// Kreirati klasu SmartAirConditioning koja ima:
		// atribut za marku klime (npr: Samsung, Galanz, Gree, …)
		// atribut za izabranu temperaturu
		// atribut za mod (hladi/greje) - string
		// metodu za stampu (proizvoljno)
		// metodu koja vraca informaciju da li je napolju veca
		// temperatura od one na koju je klima postavljena.
		// Metoda kao parametar prima temperaturu koja je napolju.

		// U glavnom programu kreirati minimum 2 objekta klase
		// SmartAirConditioning i za svaki od njih pozvati metode

		SmartAirConditioning a = new SmartAirConditioning();
		Scanner s = new Scanner(System.in);
		a.marka = "Galanz";
		a.temp = 36;
		a.mod = "Greje. ";

		SmartAirConditioning b = new SmartAirConditioning();
		b.marka = "Vivax ";
		b.temp = 23;
		b.mod = "Hladi. ";

		a.stampajAc();

		System.out.print("Unesite spoljasnju temperaturu: ");
		int spolja = s.nextInt();

		boolean razlika = a.razlikaVise(spolja);
		if (razlika == true) {
			System.out.print("Spoljasnja temperatura je veca od izabrane. ");
		} else {
			System.out.print("Spoljasnja temperatura nije veca od izabrane. ");
		}

		b.stampajAc();

		System.out.print("Unesite spoljasnju temp: ");
		int spoljasnja = s.nextInt();
		razlika = b.razlikaVise(spoljasnja);
		if (razlika == true) {
			System.out.print("Spoljasnja temperatura je veca od izabrane. ");
		} else {
			System.out.print("Spoljasnja temperatura nije veca od izabrane. ");
		}
}


} 
