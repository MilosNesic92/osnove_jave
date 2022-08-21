package d18_08_2022;

public class FacebookPostClass {

	public String imePrezimea;
	public String imePrezimeb;
	public String tekst;
	public int brojLike;
	public int brojShare;
	
	
	public void like() {
		this.brojLike = this.brojShare++;

	}

	public void dislike() {
		if (this.brojLike > 0) {
			this.brojLike = this.brojLike++;

		} else {
			this.brojLike = 0;
		}}
	
	public void share() {
		this.brojShare = this.brojShare++;
	}
	
	public void print() {
		System.out.println(imePrezimea + " >> " + imePrezimeb);
		System.out.println(tekst);
		System.out.println("Likes: " + brojLike + " | " + "Shares: " + brojShare);
	}
//	Od atributa:
//		ime i prezime korisnika koji je objavio post
//		ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//		tekst objave
//		broj lajkova
//		broj deljenja
//		  Od metoda:
//		like(), koja povecava broj lajkova za 1.
//		dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//		share(), koja povecava broj deljenja za 1
//		print(), koja stampa objavu u formatu:
//		(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//		(tekst objave)
//		Likes (broj lajkova) | Shares (broj deljenja)
//
//		U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.

	
	
	
}
