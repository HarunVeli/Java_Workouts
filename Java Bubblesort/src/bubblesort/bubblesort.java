package bubblesort;

import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		
		int sayi=0;
		
		
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
		//["15","45","65","789"]
		System.out.println(Arrays.toString(dizi));
	}
}
