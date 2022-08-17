package d16_08_2022;
//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, 
//a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012

public class Proizvod {
	
	String naziv;
	double cena;
	double tezina;
	
	public void stampaj1 (String naziv, double cena, double tezina) {
				
		if (this.tezina > 999 && this.tezina < 9999) {
			System.out.println(naziv + ", " + cena + ", " + (this.tezina / 1000) + " kg");
		} else if (this.tezina > 9999 && this.tezina < 99999) {
			System.out.println(naziv + ", " + cena + ", " + (this.tezina / 100000) + " t");
		} else {
			System.out.println("Niste uneli korektno.");
		}
	}
	public void stampaj2 (String naziv, double cena, double tezina) {
		
		if (this.tezina > 999 && this.tezina < 9999) {
			System.out.println(naziv + ", " + cena + ", " + (this.tezina / 1000) + " kg");
		} else if (this.tezina > 9999 && this.tezina < 99999) {
			System.out.println(naziv + ", " + cena + ", " + (this.tezina / 100000) + " t");
		} else {
			System.out.println("Niste uneli korektno.");
		}
	}

}
