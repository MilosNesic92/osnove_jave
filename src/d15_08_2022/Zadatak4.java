package d15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
//		Napisati metodu koja stampa podatke o korisniku u formatu:
//		JMBG: [jmbg]
//		Ime: [ime]
//		Prezime: [prezime]
//		God. rodjenja: [god]
//		Aktivan: [true/false]
//		Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
//		Metoda nista ne vraca.
			
		podaci(65546874, "Janko", "Jankovic", 30, false);

	} 
	
	public static void podaci (int jmbg, String ime, String prezime, int godRodj, boolean aktivan) {
		
		System.out.println("JMBG: " + jmbg);
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("God. rodjenja: " + godRodj);
		System.out.println("Aktivan: " + aktivan);
		
	}

}
