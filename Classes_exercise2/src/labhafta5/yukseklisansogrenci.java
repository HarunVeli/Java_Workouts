package labhafta5;

public class yukseklisansogrenci extends ogrenci {

	
	private String durum;
	private String asama;
	private int finalnot;
	
	public yukseklisansogrenci(String isim, String soyisim, String durum, String asama, int finalnot) {
		super(isim, soyisim);
		this.durum = "Yuksek lisans ogrencisi";
		this.asama = asama;
		this.finalnot = finalnot;
	}
	public yukseklisansogrenci() {
		
	}
	
	
	public String getDurum() {
		return durum;
	}
	public void setDurum(String durum) {
		this.durum = durum;
	}
	public String getAsama() {
		return asama;
	}
	public void setAsama(String asama) {
		this.asama = asama;
	}
	public int getFinalnot() {
		return finalnot;
	}
	public void setFinalnot(int finalnot) {
		this.finalnot = finalnot;
	}
	
	
	@Override
	public void bilgileriyazdir() {
	
		super.bilgileriyazdir();
		System.out.println("Durum->"+durum+"\nAsama->"+asama+"\nFinal notu->"+finalnot);

	}
	
	public void harfhesapla() {
		
		int ort= finalnot;	
		
		if(ort>=85) {
			System.out.println("Harf notunuz->AA");
		}
		else if(ort>=80) {
			System.out.println("Harf notunuz->BA");
		}
		else if(ort>=70) {
			System.out.println("Harf notunuz->BB");
		}
		else if(ort>=65) {
			System.out.println("Harf notunuz->CB");
		}
		else if(ort>=55) {
			System.out.println("Harf notunuz->CC");
		}
		else if(ort>=50) {
			System.out.println("Harf notunuz->DC");
		}
		else if(ort>=45) {
			System.out.println("Harf notunuz->DD");
		}
		else if(ort>=35) {
			System.out.println("Harf notunuz->FD");
		}
		else if(ort>=0) {
			System.out.println("Harf notunuz->FF");
		}
	
		
	}
	public void mezuniyethesapla(){
		
		if(asama=="ders"||asama=="DERS") {
			System.out.println("Bitirme suresi 1 seneden fazla.Tahmini->2023 yili");
		}
		else if(asama=="tez"||asama=="TEZ") {
			System.out.println("Bitirme suresi 1 seneden az.Tahmini->2021 yili");
		}
		else {
			System.err.println("Yanlis bilgi girilmis.");
		}
		
	}
	
}
