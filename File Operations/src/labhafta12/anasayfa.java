package labhafta12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class anasayfa {

	public static void main(String args[]) throws IOException {
		
		//ogrenci a = new ogrenci(12,"harun","veli");
		Scanner scan =new Scanner(System.in);
		//liste.add(a);
		
		String line;
		
		ArrayList<ogrenci> liste= new <ogrenci>ArrayList();
		
		File dosya = new File("bilgiler.txt");
		if(!dosya.exists()) {
			dosya.createNewFile();
		}
		
		FileReader okuyucu = new FileReader(dosya);
		BufferedReader br = new BufferedReader(okuyucu);
		String[] oku;
		
		int no;
		String ad,soyad;
		
		while((line=br.readLine()) !=null) {
			System.out.println("->"+line);
			oku=line.split(" ");
			no=Integer.parseInt(oku[0]);
			ad=oku[1];
			soyad=oku[2];
			liste.add(new ogrenci(no,ad,soyad));
		}
		okuyucu.close();
		br.close();
		for(ogrenci ogr:liste) {
			System.out.println("No->"+ogr.no+" Ad->"+ogr.ad+" Soyad->"+ogr.soyad);
		}
		
		boolean tercih=true;
		
		while(tercih) {
			System.out.print("Ekle->1\nlistele->2\nCikis->3\n->");
			int secim=scan.nextInt();
			
			switch(secim) {
			
			case 1:
				scan.nextLine();
				System.out.println("Eklenecek numara->");
				no=scan.nextInt();
				scan.nextLine();
				System.out.println("Eklenecek isim->");
				ad=scan.nextLine();
				System.out.println("Eklenecek soyisim->");
				soyad=scan.nextLine();
				liste.add(new ogrenci(no,ad,soyad));
				break;
			case 2:
				for(ogrenci ogr:liste) {
					System.out.println("No->"+ogr.no+" Ad->"+ogr.ad+" Soyad->"+ogr.soyad);
				}
				break;
			case 3:
				System.out.println("Cikis yapiliyor.");
				
				FileWriter yazici = new FileWriter(dosya);
				
				try(BufferedWriter by = new BufferedWriter(yazici);){
					for(ogrenci ogr:liste) {
						
						by.write(ogr.no+" "+ogr.ad+" "+ogr.soyad+"\n");
						
					}
					//yazici.close();
					//br.close();
					tercih=false;
					
				}
				break;
			default:
				System.out.println("Tekrar dene");
				break;
			}
		}
	}
}
