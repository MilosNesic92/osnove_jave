package d19_08_2022;

public class facebookPost {
//	Kreirati klasu FacebookPost koja ima:
//	   Od atributa:
//	ime i prezime korisnika koji je objavio post
//	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na 
//	tudjem profilu)
//	tekst objave
//	broj lajkova
//	broj deljenja
//	 Konstruktore:
//	difoltni konstuktor
//	konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je profilu objavnljen i 
//	tekst objave
//	  Od metoda:
//	like(), koja povecava broj lajkova za 1.
//	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//	share(), koja povecava broj deljenja za 1
//	print(), koja stampa objavu u formatu:
//	(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//	(tekst objave)
//	Likes (broj lajkova) | Shares (broj deljenja)
//
//	U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
	
	private String imePrezimeObjava;
	private String imePrezimeProfil;
	private String tekst;
	private int like;
	private int share;
	
	public facebookPost() {
		
	}
	
	public facebookPost (String imePrezimeObjava, String imePrezimeProfil, String tekst, int like, int share) {
		
		this.imePrezimeObjava = imePrezimeObjava;
		this.imePrezimeProfil = imePrezimeProfil;
		this.tekst = tekst;
		this.like = 0;
		this.share = 0;
		
	}
	
	public String getImePrezimeObjava(String imePrezimeObjava) {
		return imePrezimeObjava;
	}
	
	public void setImePrezimeObjava(String imePrezimeObjava) {
		this.imePrezimeObjava = imePrezimeObjava;
	}
	
	public String getImePrezimeProfil() {
		return imePrezimeProfil;
	}
	
	public void setImePrezimeProfil(String imePrezimeProfil) {
		this.imePrezimeProfil = imePrezimeProfil;
	}
	
	public String getTekst(String tekst) {
		return tekst;
	}
	
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	
	public void share() {
		this.share++;
	}
	
	public void like() {
		this.like++;
	}
	
	public void dislike() {
		if (this.like > 0) {
			this.like--;
		}
	}
	
	public void print() {
		System.out.println(this.imePrezimeObjava + " >>> " + this.imePrezimeProfil);
		System.out.println(this.tekst);
		System.out.println("Likes " + this.like + " | Shares " + this.share);
	}

	
	
	
	
	
	
}
