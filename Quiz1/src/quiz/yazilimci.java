package quiz;

public class yazilimci extends calisan{
	private int id;
	public int gs;
	private static int sayac=0;
	
	public yazilimci(String ad, String soyad, int yas, int gs) {
		super(ad, soyad, yas);
		this.gs = gs;
		bolum="Yazilim";
		sayac+=1;
		this.id=sayac;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getSayac() {
		return sayac;
	}

	public static void setSayac(int sayac) {
		yazilimci.sayac = sayac;
	}

	@Override
	public void bilgileriyazdir() {
		System.out.println("\nid->"+id);
		System.out.println("isim->"+ad+"\nsoyad->"+soyad+"\nyas->"+yas+"\nbolum->"+bolum);
		System.out.println("gs->"+gs);
	}

	public void zamhesapla() {
		int x=0;
		if(gs>20) {
			
			x=yas*40/100;
		}
		else if(gs>10) {
			
			x=yas*30/100;
		}
		else {
			
			x=yas*10/100;
		}
		System.out.println("Zam miktari->"+x);
		System.out.println("");
	}
	
	
}
