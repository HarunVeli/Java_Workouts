package main;

import java.util.Scanner;

public class main {
	
	public static calisanlar[] nesneOlustur(int sayi) {
		
		Scanner scan = new Scanner(System.in);
		
		int id = 1,num=0;
		//num üye sayısını belirtiyor ve static hepsinde aynı.
		
		calisanlar[] liste= new calisanlar[sayi];
		
		for(int i=0; i<sayi ;i++) {
			
			calisanlar nesne = new calisanlar();
			liste[i]=nesne;
			liste[i].setId(id);
			liste[i].setNumara(num);
			System.out.print("Isim->");
			liste[i].setIsim(scan.nextLine());
			
			System.out.print("\nSoy Isim->");
			liste[i].setSoyisim(scan.nextLine());
			
			System.out.print("Yas->");
			liste[i].setYas(scan.nextInt());
			
			System.out.print("Cocuk sayisi->");
			liste[i].setCocuksayisi(scan.nextInt());
			
			System.out.print("Maas->");
			liste[i].setMaas(scan.nextFloat());
			num+=1;
			++id;
			System.out.print("------------------\n");
		}
		return liste;
	}
	
	public static void nesneYazdir(int sayi,calisanlar[] liste) {
		
		for(int i=0; i<sayi;i++) {
			
			liste[i].bilgiYazdir();
			
		}
		
		
	}
	
	
	public static void maasHesapla(int sayi,calisanlar[] liste) {
		
		for(int i=0; i<sayi;i++) {
			
			liste[i].yeniMaasHesapla();
			
		}	
	}
	
	
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Kac kisi ekleme yapacaksiniz->");
		int sayi = scan.nextInt();
		System.out.print("------------------------------\n");		
		calisanlar[] liste= new calisanlar[sayi];
		liste=nesneOlustur(sayi);
		maasHesapla(sayi,liste);
		nesneYazdir(sayi,liste);
		
		/*construction metod
		calisanlar yeninesnem = new calisanlar(15,"harun","tosun",18,0,3275);
		liste[0]= yeninesnem;
		*/
	}

}
