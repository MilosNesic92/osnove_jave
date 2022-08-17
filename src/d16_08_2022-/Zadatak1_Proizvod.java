package d16_08_2022;

public class Zadatak1_Proizvod {

	public static void main(String[] args) {
		
		Proizvod meso = new Proizvod();

		meso.cena = 25;
		meso.naziv = "Meso";
		meso.tezina = 1200;
		
		meso.stampaj1(meso.naziv, meso.cena, meso.tezina);
		
		
		Proizvod pesak = new Proizvod();
		
		
		pesak.cena = 29.23;
		pesak.naziv = "Pesak";
		pesak.tezina = 12000;
		
		pesak.stampaj2(pesak.naziv, pesak.cena, pesak.tezina);
		
	}

}
