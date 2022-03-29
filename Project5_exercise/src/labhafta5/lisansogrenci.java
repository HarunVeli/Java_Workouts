package labhafta5;

public class lisansogrenci extends ogrenci{

	
	private String durum;
	private int sinif;
	private int vizenot;
	private int finalnot;
	
	
	
	
	public lisansogrenci(String isim, String soyisim, String durum, int sinif, int vizenot,int finalnot) {
		super(isim, soyisim);
		this.durum = "Lisans ogrencisi";
		this.sinif = sinif;
		this.vizenot = vizenot;
		this.finalnot = finalnot;
	}
	public lisansogrenci() {
		
	}
	
	
	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}

	public int getSinif() {
		return sinif;
	}

	public void setSinif(int sinif) {
		this.sinif = sinif;
	}

	public int getVizenot() {
		return vizenot;
	}

	public void setVizenot(int vizenot) {
		this.vizenot = vizenot;
	}

	public int getFinalnot() {
		return finalnot;
	}

	public void setFinalnot(int finalnot) {
		this.finalnot = finalnot;
	}

	public void gecmenotuhesapla() {
		int gecmenotu = vizenot*40/100 + finalnot*60/100;
		super.bilgileriyazdir();
		System.out.print("Gecme notu->"+gecmenotu);
	}
	public void mezuniyetyilihesapla() {
		int mezun=4-sinif;
		mezun = 2021+mezun;
			System.out.println("Ogrenci "+mezun+"'de mezun olacaktir.");
			
	}
	
	@Override
	public void bilgileriyazdir() {
		
		super.bilgileriyazdir();
		System.out.println("Durum->"+durum+"\nOgretim yili->"+sinif+"\nVize notu->"+vizenot+"\nFinal notu->"+finalnot);
	}
	
	
	
}
