import java.util.ArrayList;
//Harun Veli Tosun-20010011011
public class kursiyer {

	private int kursiyerid;
	private String kursiyeradsoyad;
	private int kursiyeryas;
	ArrayList<kurs>alinankurslar = new ArrayList<kurs>();
	
	public kursiyer(int kursiyerid, String kursiyeradsoyad, int kursiyeryas) {
		super();
		this.kursiyerid = kursiyerid;
		this.kursiyeradsoyad = kursiyeradsoyad;
		this.kursiyeryas = kursiyeryas;
	}

	public int getKursiyerid() {
		return kursiyerid;
	}

	public void setKursiyerid(int kursiyerid) {
		this.kursiyerid = kursiyerid;
	}

	public String getKursiyeradsoyad() {
		return kursiyeradsoyad;
	}

	public void setKursiyeradsoyad(String kursiyeradsoyad) {
		this.kursiyeradsoyad = kursiyeradsoyad;
	}

	public int getKursiyeryas() {
		return kursiyeryas;
	}

	public void setKursiyeryas(int kursiyeryas) {
		this.kursiyeryas = kursiyeryas;
	}

	
	
	
	
	
	
}
