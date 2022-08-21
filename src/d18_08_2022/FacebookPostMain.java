package d18_08_2022;

public class FacebookPostMain {

	public static void main(String[] args) {
		FacebookPostClass post = new FacebookPostClass();
		
		
		post.imePrezimea = "Janko Jankovic";
		post.imePrezimeb = "Nikola Nikolic";
		post.tekst = "Barry White beo u gipsu kad je ceo.";
		post.brojLike = 0;
		post.brojShare= 0;

		post.like();
		post.like();
		post.like();
		
		post.dislike();
		post.dislike();
		
		post.share();
		post.share();
		
		post.print();
		
		
		
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
