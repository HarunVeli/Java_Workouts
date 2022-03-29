package quiz2ornek;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class anasayfa {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		System.out.print("Isci sayisi giriniz->");
		int isayi=scan.nextInt();
		
		isci[] dizi= new isci[isayi];
		
		FileWriter yazici = new FileWriter("bilgiler.txt", true);
		
		
		
		for(int i=0;i<isayi;i++) {
			scan.nextLine();
			System.out.print("Ad->");
			String ad=scan.nextLine();
			System.out.print("Soyad->");
			String soyad=scan.nextLine();
			System.out.print("Yas->");
			int yas=scan.nextInt();
			System.out.print("Cs->");
			int cs=scan.nextInt();
			
			dizi[i]=new isci(ad,soyad,yas,cs);
		}
	
		System.out.println();
		for(int i=0;i<isayi;i++) {
			
			System.out.println(dizi[i].id+" "+dizi[i].ad+" "+dizi[i].soyad+" "+dizi[i].maashesapla()+" "+dizi[i].gorev);
			
		}
		
		String ekle="";
		for(int i=0;i<isayi;i++) {
			
			ekle+=dizi[i].id+" "+dizi[i].ad+" "+dizi[i].soyad+" "+dizi[i].maashesapla()+" "+dizi[i].gorev+" ";
			
		}
		yazici.write(ekle);
		yazici.close();
	}
	

}
