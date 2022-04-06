package labhafta9;

import java.util.ArrayList;
import java.util.Scanner;

public class anasayfalab9 {

	public static void main(String[] args) {
		int secim=0;
		String ad,soyad;
		int vize_not,final_not;
		
		
		ArrayList<ogrenci> liste= new ArrayList<ogrenci>();

		Scanner scan=new Scanner(System.in);
		
		while(secim!=5) {
			System.out.println("------------------");
			System.out.println("ekleme->1\nlisteleme->2\narama->3\nsilme->4\ncikis->5");
			System.out.println("------------------\n->");
			secim=scan.nextInt();
			
			switch(secim) {
			
			case 1:
				System.out.print("Ogrenci adi->");
				ad=scan.next();
				System.out.print("Ogrenci soyadi->");
				soyad=scan.next();
				System.out.print("Ogrenci vize notu->");
				vize_not=scan.nextInt();
				System.out.print("Ogrenci final notu->");
				final_not=scan.nextInt();
				
				//ogrenci ogr =new ogrenci(ad,soyad,vize_not,final_not);
				liste.add(new ogrenci(ad,soyad,vize_not,final_not));//istersen ek degisken ogr ile ekleyebilirsin
				
				break;
			case 2:
				for(ogrenci ogrenciler:liste) {
					System.out.println("Ogrenci No->"+ogrenciler.getNo());
					System.out.println("Ogrenci adi->"+ogrenciler.getAd());
					System.out.println("Ogrenci soyadi->"+ogrenciler.getSoyad());
					System.out.println("Ogrenci gecme notu->"+ogrenciler.getGecme_not());
				}
				
				break;
			case 3:
				System.out.print("Aranacak ogrenci adi->");
				ad=scan.next();
				int sayac=0;
				for(ogrenci ogrenciler:liste) {
					//equeals obje karþýlaþtýrýyor
					if(ogrenciler.getAd().compareTo(ad)==0) {
						System.out.println("Ogrenci bulundu.");
						sayac+=1;
						System.out.println("Ogrenci No->"+ogrenciler.getNo());
						System.out.println("Ogrenci adi->"+ogrenciler.getAd());
						System.out.println("Ogrenci soyadi->"+ogrenciler.getSoyad());
						System.out.println("Ogrenci gecme notu->"+ogrenciler.getGecme_not());
					}
				}
				break;
			case 4:
				System.out.print("Silinecek ogrenci adi->");
				ad=scan.next();
				
				for(ogrenci ogrenciler:liste) {
					//equeals obje karþýlaþtýrýyor
					if(ogrenciler.getAd().compareTo(ad)==0) {
						System.out.println("Ogrenci silindi.");
						liste.remove(ogrenciler);
					}
				}
				
				break;
				
			case 5:
				System.out.println("Cikis yapildi.");
				break;
				
			default:
				System.out.println("1-5 arasi deger gir delirtme beni.");
			}
			
		}
		
		
		
	}

}
