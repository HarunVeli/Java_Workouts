package labhafta5;

public class anasayfa {

	public static void main(String[] args) {
		//ogrenci ogrenci1 = new ogrenci("Mehmet","Kara");
		lisansogrenci ogrenci2 = new lisansogrenci("Harun","Tosun","",2,62,75);
		yukseklisansogrenci ogrenci3 = new yukseklisansogrenci("Namýk","Ekin","","ders",78);
		/*yukseklisansogrenci ogrenci4 = new yukseklisansogrenci("Namýk","Ekin","","Yuksek lisans okuyor",78);
		yukseklisansogrenci ogrenci5 = new yukseklisansogrenci("Namýk","Ekin","","Yuksek lisans okuyor",78);*/
		
		
		//ogrenci1.bilgileriyazdir();
		//System.out.println("");
		
		ogrenci2.bilgileriyazdir();
		System.out.println("");
		ogrenci2.gecmenotuhesapla();
		System.out.println("");
		ogrenci2.mezuniyetyilihesapla();
		System.out.println("");
		ogrenci3.bilgileriyazdir();
		ogrenci3.harfhesapla();
		ogrenci3.mezuniyethesapla();
		
		//Dizi nesne ekleme
		/*
		lisansogrenci ogrenci5 = new lisansogrenci("Harunasda","Tosunadasd","",2,625,7598);
		ogrenci[] dizi=new ogrenci[3];
		dizi[0]=ogrenci5;
		dizi[0].bilgileriyazdir();
		*/
		lisansogrenci ogrenci5 = new lisansogrenci("Harun","Veli","",2,625,7598);
		lisansogrenci[] dizi = new lisansogrenci[3];
		dizi[0]=ogrenci5;
		ogrenci5.bilgileriyazdir();
		
		/*System.out.println("");
		ogrenci4.bilgileriyazdir();
		System.out.println("");
		ogrenci5.bilgileriyazdir();
		System.out.println("");*/
	}

}
