package d16_08_2022;

public class SmartAirConditioning {

	public String marka;
	public int temp;
	public String mod;

	public void stampajAc() {
		System.out.println("Klima marke " + this.marka + ", podesena temperatura je: " + this.temp + ", izabrani mod: " + this.mod);
	}
	public boolean razlikaVise(int spoljnaTemp) {
		if (this.temp < spoljnaTemp) {
			return true;
		} else {
			return false;
		}
	}
}
