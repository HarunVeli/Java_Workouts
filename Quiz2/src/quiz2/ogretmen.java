package quiz2;

public abstract class ogretmen {

	public String ad,soyad;
	public int yas,cs,id;
	public static int sayac =1000;
	
	public ogretmen(String ad, String soyad, int yas, int cs) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.cs = cs;
		this.id=sayac;
		sayac+=2;
	}



	abstract public double puanhesapla();
	
}
