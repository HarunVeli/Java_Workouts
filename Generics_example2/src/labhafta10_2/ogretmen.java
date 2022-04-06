package labhafta10_2;

public class ogretmen {

	private String ad,soyad;
	private int yas;
	private String brans;
	
	public ogretmen(String ad, String soyad, int yas, String brans) {
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.brans = brans;
	}


	public String toString() {
		System.out.println("Ad soyad->"+ad+" "+soyad);
		System.out.println("Yas->"+yas);
		System.out.println("Brans->"+brans);
		System.out.println("------------------------");
		return super.toString();
	}
	
	
}
