package main;

public class ogrenciler {

	private int id;
	private String isim_soyisim;
	private float vize_not;
	private float final_not;
	
	public ogrenciler(String isim_soyisim, float vize_not, float final_not) {
		this.isim_soyisim = isim_soyisim;
		this.vize_not = vize_not;
		this.final_not = final_not;
	}

	public ogrenciler() {
		this.id = 0;
		this.isim_soyisim = "Bilgi yok.";
		this.vize_not = 0;
		this.final_not = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim_soyisim() {
		return isim_soyisim;
	}

	public void setIsim_soyisim(String isim_soyisim) {
		this.isim_soyisim = isim_soyisim;
	}

	public float getVize_not() {
		return vize_not;
	}

	public void setVize_not(float vize_not) {
		this.vize_not = vize_not;
	}

	public float getFinal_not() {
		return final_not;
	}

	public void setFinal_not(float final_not) {
		this.final_not = final_not;
	}
	
	
	
	public void bilgiYazdir() {
		System.out.println("\nId->"+id+"\nIsim soyisim->"+isim_soyisim+"\nVize notu->"+vize_not+"\nFinal notu->"+final_not);
		System.out.println("\n");
	}
	
	public float gecmenotuHesapla() {
		
		float ort = (vize_not*40/100) + (final_not*60/100);	
		
		return ort;
		
	}
	
	public void harfHesapla() {
		
		float ort=gecmenotuHesapla();
		
		if(ort>=85) {
			System.out.println("Harf notunuz->AA");
		}
		else if(ort>=80) {
			System.out.println("Harf notunuz->BA");
		}
		else if(ort>=70) {
			System.out.println("Harf notunuz->BB");
		}
		else if(ort>=65) {
			System.out.println("Harf notunuz->CB");
		}
		else if(ort>=55) {
			System.out.println("Harf notunuz->CC");
		}
		else if(ort>=50) {
			System.out.println("Harf notunuz->DC");
		}
		else if(ort>=45) {
			System.out.println("Harf notunuz->DD");
		}
		else if(ort>=35) {
			System.out.println("Harf notunuz->FD");
		}
		else if(ort>=0) {
			System.out.println("Harf notunuz->FF");
		}
		
	}

}