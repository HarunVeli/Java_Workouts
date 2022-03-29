package quiz;

import java.util.Scanner;

public class anasayfa {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Yazilimci sayisi->");
		int yazsayisi=scan.nextInt();
		
		yazilimci[] dizi = new yazilimci[yazsayisi];
		
		String ad,soyad;
		int yas,gs;
		
		
		for(int i=0;i<yazsayisi;i++) {
			System.out.print("\nAd->");
			ad = scan.next();
			System.out.print("Soyad->");
			soyad = scan.next();
			System.out.print("Yas->");
			yas = scan.nextInt();
			System.out.print("Gs->");
			gs = scan.nextInt();
			
			dizi[i]=new yazilimci(ad,soyad,yas,gs);
			
		}
		
		dizi[0].calisansayiver();
		System.out.println("\nListeleniyor.");
		for(int i=0;i<yazsayisi;i++) {
			
			dizi[i].bilgileriyazdir();
			dizi[i].zamhesapla();
		}
		
		
		
		
	}

}
