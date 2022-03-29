package deneme1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class deneme1 {

	public static void main(String[] args) {
		/*
		 * 
		 * ALAN CEVRE HESAPLAYICI
		 * 
		 * 
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Lutfen yaricap giriniz->");
		
		double sayi = scan.nextInt();
		double alan,cevre;
		double pi = 3.14;
		
		alan = pi * sayi * sayi;
		cevre = 2 * pi * sayi;
		
		System.out.println("Yaricapi "+sayi+" olan dairenin alani->"+new DecimalFormat("##,##").format(alan)+" cevresi->"+new DecimalFormat("##,##").format(cevre));
		*/
		
		
		
		/*	ASAL SAYI BULMA
			
		Scanner scan  = new Scanner(System.in);
		System.out.print("Bir sayi giriniz->");
		int sayac = 0,sayi = scan.nextInt();
		
		
		for(int i= 2 ; i<sayi ; i++ ) {
			
			if(sayi%i==0) {
				sayac++;
			}
			
		}
		if( sayac == 0) {
			System.out.println(sayi+" Sayisi asaldir");
			
		}
		else {
			System.out.println(sayi+" Sayisi asal degildir");	
		}
		
		*/
		
		
		/*BASAMAK TOP VE SAYI BULMA
		 * 
		 * System.out.print("Sayi giriniz->");
		int bsayac=0,toplam=0,kalan=0,sayi=scan.nextInt();		
		int temp = sayi;
		
		while(sayi>0) {
			kalan = sayi%10;
			toplam+=kalan;
			sayi= sayi-kalan;
			sayi = sayi/10;
			bsayac+=1;
			
		}
		
		System.out.println(temp+"'nin basamak sayisi->"+bsayac+" basamak toplami->"+toplam);
		 * 
		 */
		
		/*BASAMAK TERS CEVIRME
		 * 
		 * System.out.print("Sayi giriniz->");
		int bsayac=0,toplam=0,kalan=0,sayi=scan.nextInt();		
		int temp = sayi;
		
		while(sayi>0) {
			toplam*=10;
			kalan = sayi%10;
			toplam+=kalan;
			sayi= sayi-kalan;
			sayi = sayi/10;
			
			
		}
		
		
		System.out.println(temp+"'nin ters hali->"+toplam);
		 */
		
		/*BOSLUK VARSA ATLA
		 * 
		 * Scanner scan= new Scanner(System.in);
		
		System.out.print("isim giriniz->");
		String isim= scan.nextLine();
		
		int uzunluk= isim.length();
		
		for(int i=0; i<uzunluk; i++) {
			char a=isim.charAt(i);
			if(a !=' ') {
				System.out.println(a);
			}
			
		}
		 */
		
		/*PALÝNDROM KELÝME BULMA
		 * 
		 * System.out.print("kelime giriniz->");
		String kelime = scan.next();
		
		int uz = kelime.length()-1;
		
		int sayac = uz/2;
		int k=0;
		for(int i = 0; i<sayac; i++) {
			if(kelime.charAt(i)==kelime.charAt(uz-i)) {
				++k;
				if(k==sayac) {
					System.out.println(kelime+" kelimesi palindromdur.");
				}
			}
			
		}
		if(k!=sayac) {
			System.out.println(kelime+" kelimesi palindrom degildir.");
		}
		
		*/
		
		/*SAYININ TAM BOLENLERINI BULMA
		 * 
		 * System.out.print("sayi giriniz->");
		int sayi = scan.nextInt();
		
		for(int i = 1; i<=sayi; i++) {
			if(sayi%i==0) {
				System.out.println(i);
			}
			
		}
		
		*BUBBLESORT kucukten buyuge siralama
		*
		*int sayi=0;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("deger giriniz->");
		sayi = scan.nextInt();
		int[] dizi= new int[sayi];
		
		for (int i=0;i<sayi;i++) {
			System.out.print("->");
			dizi[i]=scan.nextInt();			
		}
		
		for(int i=0;i<dizi.length;i++) {
			for(int j=dizi.length-1;j>i;j--) {
				if(dizi[j-1]>dizi[j]) {
					int temp = dizi[j-1];
					dizi[j-1]=dizi[j];
					dizi[j]=temp;
				}
			}
		}
		
		for(int i=0;i<sayi;i++) {
			System.out.println(dizi[i]);
		}			
		*
		*
		*
		*
		*
		*
		*
		*
		*
		*
		*
		*
		*
		*/
		 
		
	}
}

