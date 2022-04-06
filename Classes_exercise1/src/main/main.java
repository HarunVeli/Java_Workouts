package main;

import java.util.Scanner;

public class main {
	
	public static ogrenciler[] ekle(int kisi_sayisi) {
		
		Scanner scan = new Scanner(System.in);
		
		ogrenciler[] liste = new ogrenciler[kisi_sayisi];
		
		String isim="";
		float vizee,finall;
		
		
		for(int i=0;i<kisi_sayisi;i++) {
			
			System.out.print("Isim->");
			isim = scan.next();
			System.out.print("Soyisim->");
			isim = isim +" "+ scan.next();
			System.out.print("Vize notu->");
			vizee = scan.nextFloat();
			System.out.print("Final notu->");
			finall = scan.nextFloat();
		
			ogrenciler nesne = new ogrenciler(isim,vizee,finall);
			liste[i]=nesne;
			liste[i].setId(i+1);
			
		}
		return liste;
	
	}
	
	public static void listele(int kisi_sayisi,ogrenciler[] liste) {
		
		for(int i=0;i<kisi_sayisi;i++) {
			System.out.println((i+1)+".Uyenin bilgileri \n->");
			liste[i].bilgiYazdir();
		}		
	}
	
	public static void nothesapla(int kisi_sayisi,ogrenciler[] liste) {
		
		int arananoge = arananibul(kisi_sayisi,liste);
		float ort =liste[arananoge].gecmenotuHesapla();
		System.out.println("Gecme notu->"+ort+"\n");
		
	}
	
	public static int arananibul(int kisi_sayisi,ogrenciler[] liste) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Notunu hesaplamak istediginiz ogrenci id->");
		int arananoge = scan.nextInt();
		
		arananoge-=1;
		return arananoge;			
	}
	
	public static void harfnothesapla(int kisi_sayisi,ogrenciler[] liste) {
		
		int arananoge = arananibul(kisi_sayisi,liste);
		liste[arananoge].harfHesapla();
		
	}
	
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int kisi_sayisi=0,secim=0,temp=1;
		ogrenciler[] liste = new ogrenciler[kisi_sayisi];
		
		while(temp==1) {
			System.out.print("Ekleme->1\nListeleme->2\nGecme notu hesapla->3\nHarf notu hesapla->4\nCikis->5\n->");
			secim = scan.nextInt();
			switch(secim) {
		
				case 1:
					System.out.print("Kac kisi ekleyeceksiniz->");
					kisi_sayisi = scan.nextInt();
					//ogrenciler[] liste = new ogrenciler[kisi_sayisi];
					//bu olmadan sorunsuz çalýþtý neden sor
					liste = ekle(kisi_sayisi);
					break;
				case 2:
					listele(kisi_sayisi,liste);
					break;
				case 3:
					nothesapla(kisi_sayisi,liste);
					break;
				case 4:
					harfnothesapla(kisi_sayisi,liste);
					break;
				case 5:
					temp=0;
					break;
				default:
					System.out.println("Yanlis deger girdiniz.");
				}
		
		
		
		}	
	}

}
