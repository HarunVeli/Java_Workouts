package muhendis;

import java.util.Scanner;

public class main {
	
	public static void bilgilerilistele(muhendis[] dizi) {
		
		//Gec baglama ozelligi (Hangisinin kullanilacagi henuz belli degil)
		for(int i=0;i<dizi.length;i++) {
			dizi[i].bilgileriyazdir();
		}
	}
	public static void puanlariyazdir(muhendis muhendis) {
		
		System.out.println("Muhendisin puaný->"+muhendis.puanhesapla());
	}
			

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int bs,ms,es,toplam,yas;
		String ad;
		//Polimorfizm kuralý burada geçerli alt sýnýf old için muhedis dizisine ekleme yapýlabýlýyor
		
		System.out.print("Kac adet bilgisayar muh. olacak->");
		bs=scan.nextInt();
		System.out.print("Kac adet elektric muh. olacak->");
		es=scan.nextInt();
		System.out.print("Kac adet makine muh. olacak->");
		ms=scan.nextInt();
		
		toplam=bs+ms+es;
		
		muhendis[] dizi=new muhendis[toplam];
		
		for(int i=0;i<bs;i++) {
			System.out.print("Bilgisayar muh adini giriniz->");
			ad=scan.next();
			System.out.print("Bilgisayar muh yasini giriniz->");
			yas=scan.nextInt();
			dizi[i]=new bilgisayarmuhendisi(ad,yas);
		}
		for(int i=bs;i<es+bs;i++) {
			System.out.print("Elektric muh adini giriniz->");
			ad=scan.next();
			System.out.print("Electric muh yasini giriniz->");
			yas=scan.nextInt();
			dizi[i]=new elektrikmuhendisi(ad,yas);
		}
		for(int i=bs+es;i<toplam;i++) {
			System.out.print("Makine muh adini giriniz->");
			ad=scan.next();
			System.out.print("Makine muh yasini giriniz->");
			yas=scan.nextInt();
			dizi[i]=new makinemuhendisi(ad,yas);
		}
		System.out.println();
		for(int i =0;i<dizi.length;i++) {
			puanlariyazdir(dizi[i]);
			
		}
		bilgilerilistele(dizi);
	}

}
