import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//Harun Veli Tosun-20010011011
public class anasayfa {

	public static void main(String[] args) throws IOException {
		
		Scanner scan =new Scanner(System.in);
		
		File kursiyerdosya = new File("kursiyer.txt");
		if(!kursiyerdosya.exists()) {
			kursiyerdosya.createNewFile();
		}
		File kursdosya = new File("kurs.txt");
		if(!kursdosya.exists()) {
			kursdosya.createNewFile();
		}
		
		ArrayList<kursiyer>kursiyerler=new ArrayList<kursiyer>();
		ArrayList<kurs>kurslar=new ArrayList<kurs>();
		
		String okunan[],satir,ad;
		int no,yas,i=-1;
		
		FileReader okuyucu = new FileReader(kursiyerdosya);
		BufferedReader br = new BufferedReader(okuyucu);
		//kursiyer dosyasindaki bilgiler okunup kursiyerler ArrayList'e kaydediliyor
		while((satir=br.readLine()) !=null) {
			
			if(satir.contains("*")==true) {
				okunan=satir.split("-");
				
				//* ile ayirma islemi
				okunan[0]=okunan[0].substring(1);
				
				no=Integer.parseInt(okunan[0]);
				ad=okunan[1];
				yas=Integer.parseInt(okunan[2]);
				kursiyerler.add(new kursiyer(no,ad,yas));
				i+=1;
			}
			else {
				kursiyer temp=kursiyerler.get(i);
				
				okunan=satir.split("-");
				//% ile ayirma islemi
				okunan[0]=okunan[0].substring(1);
				
				no=Integer.parseInt(okunan[0]);
				ad=okunan[1];
				
				temp.alinankurslar.add(new kurs(no,ad));
				
			}
		}
		/*okuyucu.close();
		br.close();
		*/
		FileReader okuyucu1 = new FileReader(kursdosya);
		BufferedReader br1 = new BufferedReader(okuyucu1);
		//kurs dosyasindaki bilgiler okunup kurslar ArrayList'e kaydediliyor
		while((satir=br1.readLine()) !=null) {
			
				okunan=satir.split("-");
				//% ile ayirma islemi
				//okunan[0]=okunan[0].substring(1);
				
				no=Integer.parseInt(okunan[0]);
				ad=okunan[1];
				
				kurslar.add(new kurs(no,ad));
			
		}
		okuyucu.close();
		br.close();
		
		boolean dongu=true;
		int secim;
		while(dongu) {
			
			System.out.print("Kurs ekle->1\nKurs listele->2\nKursiyer ekle->3\nKursiyer ara->4\nKursiyer sil->5\nKursiyerleri listele->6\nKursiyerleri ayrintili listele->7\nKursiyerin odeyecegi tutari hesapla->8\nCikis->9\n->");
			secim=scan.nextInt();

			switch(secim) {
			
			case 1:
				System.out.print("Eklenecek kurs id giriniz->");
				int id = scan.nextInt();
				scan.nextLine();
				System.out.print("Eklenecek kurs adi giriniz->");
				String isim = scan.nextLine();
				int kontrol=0;
				
				//id kontrolu(her kursun tek bir id'si olabilir.)
				for(kurs ogr:kurslar) {
					if(ogr.getKursid()==id) {
						System.out.println("Ayni id degerine sahip kurs bulundu lutfen farkli id ile ekleme yapiniz.");
						kontrol=1;
						break;
					}
				}
				if(kontrol!=1) {
					kurslar.add(new kurs(id,isim));
				}
				System.out.println("");
				break;
			case 2:
				System.out.println("\nKurs Id  |  Kurs Adi\n----------------------");
				for(kurs ogr:kurslar) {
					System.out.println(" "+ogr.getKursid()+"    |   "+ogr.getKursad());
				}
				System.out.println("");
				break;
			case 3:
				System.out.print("Eklenecek kursiyer id giriniz->");
				id = scan.nextInt();
				scan.nextLine();
				System.out.print("Eklenecek kursiyer adi giriniz->");
				isim = scan.nextLine();
				System.out.print("Eklenecek kursiyer yasi giriniz->");
				yas = scan.nextInt();
				int sayac;
				System.out.print("Kac kursa kayit olacak->");
				sayac=scan.nextInt();
				kontrol=0;
				//Once kursiyerin bilgileri alinip kontrol yapiliyor daha sonra kursun bilgileri aliniyor sorun cikmazsa ekleme yapiliyor.
				for(kursiyer ogr:kursiyerler) {
					if(ogr.getKursiyerid()==id) {
						System.out.println("Ayni id degerine sahip kursiyer bulundu lutfen farkli id ile ekleme yapiniz.");
						kontrol=1;
						break;
					}
				}
				if(kontrol!=1) {
					kursiyer temp=new kursiyer(id,isim,yas);//bu satirda yeni kursiyer nesnesi olusturuluyor
					for(int j=0;j<sayac;j++) {
						System.out.print("Kursiyerin eklenecek kurs id'sini giriniz->");
						int kursid = scan.nextInt();
						scan.nextLine();
						System.out.print("Kursiyerin eklenecek kurs adini giriniz->");
						String kursisim = scan.nextLine();
							
						temp.alinankurslar.add(new kurs(kursid,kursisim));//bu satirda kursiyerin icindeki alinankurslar ArrayList'ine ekleme yapiliyor
					}
					kursiyerler.add(temp);//en son kursiyerler ArrayList'ine ekleme yapiliyor
				}
				System.out.println("");
				break;
			case 4:
				scan.nextLine();
				System.out.print("Aranacak kursiyer adi->");
				isim =scan.nextLine();
				boolean index=false;
				
				for(kursiyer ogr:kursiyerler) {
					if(ogr.getKursiyeradsoyad().equals(isim)) {//equals ile string karsilastirma yapilarak kursiyeri buluyoruz
						index=true;
						System.out.println("Id->"+ogr.getKursiyerid()+" Ad->"+ogr.getKursiyeradsoyad()+" Yas->"+ogr.getKursiyeryas());
						for(int j=0;j<ogr.alinankurslar.size();j++) {
							System.out.println("Kurs id->"+ogr.alinankurslar.get(j).getKursid()+"Kurs adi->"+ogr.alinankurslar.get(j).getKursad());
						}
						break;
					}
				}
				if(index==false) {
					System.out.println("Aranan kursiyer bulunamadi.");
				}
				
				System.out.println("");
				break;
			case 5:
				System.out.print("Silinecek kursiyer id->");
				id =scan.nextInt();
				index=false;
				i=-1;
				
				for(kursiyer ogr:kursiyerler) {
					i+=1;
					if(id==ogr.getKursiyerid()) {
						index=true;
						System.out.println("Basariyla silindi.");
						
						break;
					}
				}
				kursiyerler.remove(i);//indis numarasina gore silme yapiliyor
				if(index==false) {
					System.out.println("Silinecek kursiyer id bulunamadi.");
				}
				System.out.println("");
				break;
			case 6:
				System.out.println("\nTum Kursiyerler\n-----------------");
				for(kursiyer ogr:kursiyerler) {
					System.out.println(ogr.getKursiyerid()+" "+ogr.getKursiyeradsoyad()+" "+ogr.getKursiyeryas());
				}
				System.out.println("");
				break;
			case 7:
				System.out.println("\nTum Kursiyerler ve Aldiklari Kurslar\n------------------------------------");
				for(kursiyer ogr:kursiyerler) {
					System.out.println(ogr.getKursiyerid()+" "+ogr.getKursiyeradsoyad()+" "+ogr.getKursiyeryas());
					for(int j=0;j<ogr.alinankurslar.size();j++) {
						System.out.println("     "+ogr.alinankurslar.get(j).getKursid()+" "+ogr.alinankurslar.get(j).getKursad());
					}
				}
				System.out.println("");
				break;
			case 8:
				System.out.print("Ucreti hesaplanacak kursiyer id->");
				id =scan.nextInt();
				i=-1;
				int tutar=400;
				
				for(kursiyer ogr:kursiyerler) {
					if(id==ogr.getKursiyerid()) {
						i=ogr.alinankurslar.size();	//id bulunursa kursiyerin kurs sayisini i degiskenine aliyorum
						break;
					}
				}
				if(i==-1) {
					System.out.println("Girdiginiz id'de kursiyer bulunamadi.");
				}
				else {
					if(i==0) {
						System.out.println("Kursiyerin kayitli kursu yok.");
					}
					else if(i==1) {
						System.out.println("Kursiyerin aylik odeyecegi tutar->400(tek kurs icin kampanya bulunmamaktadir)");
					}
					else if(i==2) {
						System.out.println("Kursiyerin aylik odeyecegi tutar->"+(400+tutar-(tutar*15/100))+"(Kampanya 1)");
					}
					else if(i==3) {
						System.out.println("Kursiyerin aylik odeyecegi tutar->"+(800+tutar-(tutar*25/100))+"(Kampanya 2)");
					}
					else if(i>3) {
						tutar=tutar-(tutar*10/100);
						System.out.println("Kursiyerin aylik odeyecegi tutar->"+tutar*i+"(Kampanya 3)");
					}
				}
				System.out.println("");
				break;
			case 9:
				System.out.println("Cikis yapiliyor.");
				
				kursiyerdosya.delete();
				kursdosya.delete();
				
				File kursiyerdosya1 = new File("kursiyer.txt");
				if(!kursiyerdosya1.exists()) {
					kursiyerdosya1.createNewFile();
				}
				
				FileWriter yazici2 = new FileWriter(kursiyerdosya1);
				
				try(BufferedWriter by2 = new BufferedWriter(yazici2);){
					for(kursiyer ogr:kursiyerler) {
						by2.write("*"+ogr.getKursiyerid()+"-"+ogr.getKursiyeradsoyad()+"-"+ogr.getKursiyeryas()+"\n");
						for(int j=0;j<ogr.alinankurslar.size();j++) {
							by2.write("%"+ogr.alinankurslar.get(j).getKursid()+"-"+ogr.alinankurslar.get(j).getKursad()+"\n");
						}
					}
				}
				yazici2.close();
				
				File kursdosya1 = new File("kurs.txt");
				if(!kursdosya1.exists()) {
					kursdosya1.createNewFile();
				}
				
				FileWriter yazici1 = new FileWriter(kursdosya1);
				
				try(BufferedWriter by1 = new BufferedWriter(yazici1);){
				for(kurs ogr:kurslar) {
					by1.write(ogr.getKursid()+"-"+ogr.getKursad()+"\n");
				}
				}
				yazici1.close();
				dongu=false;
				break;
			default:
				System.out.println("\n----------------------------------------\nYanlis deger girdiniz tekrar deneyiniz.\n----------------------------------------\n");
				break;
			}
		}
	}
}
