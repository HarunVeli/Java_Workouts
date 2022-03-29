package labhafta10_2;

public class ogrenci {

	private int no;
	private String ad,soyad;
	
	
	
	public ogrenci(int no, String ad, String soyad) {
		super();
		this.no = no;
		this.ad = ad;
		this.soyad = soyad;
	}



	public String toString() {
	
		System.out.println("Ad soyad->"+ad+" "+soyad);
		System.out.println("No->"+no);
		System.out.println("------------------------");
		return super.toString();
	}
	
	
}
