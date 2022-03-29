package quiz2;
import java.util.Scanner;


public class anasayfa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Ogretmen sayisi giriniz->");
		int osayi=scan.nextInt();
		
		matematikogretmeni[] dizi= new matematikogretmeni[osayi];
		
		for(int i=0;i<osayi;i++) {
			scan.nextLine();
			System.out.print("Ad->");
			String ad=scan.nextLine();
			System.out.print("Soyad->");
			String soyad=scan.nextLine();
			System.out.print("Yas->");
			int yas=scan.nextInt();
			System.out.print("Cs->");
			int cs=scan.nextInt();
			
			dizi[i]=new matematikogretmeni(ad,soyad,yas,cs);
		}
		System.out.println();
		for(int i=0;i<osayi;i++) {
			
			System.out.println(dizi[i].id+" "+dizi[i].ad+" "+dizi[i].soyad+" "+dizi[i].maashesapla()+" "+dizi[i].brans);
			
		}
		boolean sayac=true;
		while(sayac) {
			
			System.out.print("\nDegistirilecek iki indis numarasi giriniz(0<=indis<"+osayi+")\n1->");
			int i1=scan.nextInt();
			System.out.print("2->");
			int i2=scan.nextInt();
			if(i1<0||i2<0) {
				System.out.println("Sifirdan kucuk deger girilemez.");
			}
			else {
				if(i1<=osayi-1 && i2<=osayi-1) {
					matematikogretmeni temp;
					
					temp=dizi[i1];
					dizi[i1]=dizi[i2];
					dizi[i2]=temp;
					sayac=false;
					
					System.out.println("Degistirme yapildi.");
					for(int i=0;i<osayi;i++) {
						
						System.out.println(dizi[i].id+" "+dizi[i].ad+" "+dizi[i].soyad+" "+dizi[i].maashesapla()+" "+dizi[i].brans);
						
					}
					
				}
				else {
					System.out.println("Degistirme yapilamadi dogru deger giriniz.");
				}
			}
			
		}
			
	}

}
