package quiz;

public class calisan {
	public String ad,soyad;
	public int yas;
	public String bolum;
	private static int sayi=0;
	
	
	public calisan(String ad, String soyad, int yas) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		sayi+=1;
	}
	public calisan() {
		
	}
	
	
	public static int getSayi() {
		return sayi;
	}
	public static void setSayi(int sayi) {
		calisan.sayi = sayi;
	}
	public void bilgileriyazdir() {
		System.out.println("isim->"+ad+"\nsoyad->"+soyad+"\nyas->"+yas+"\nbolum->"+bolum);
	}
	final public void calisansayiver() {
		System.out.println("\ntum calisanlar->"+sayi);
	}
	
	
	
	
	
	
	
	
	
	
	
}
