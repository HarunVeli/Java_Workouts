package labhafta9;

public class ogrenci {
	
	private int no;
	private String ad;
	private String soyad;
	private int vize_not;
	private int final_not;
	private double gecme_not;
	private static int kisisayisi;
	
	public ogrenci(String ad, String soyad, int vize_not, int final_not) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.vize_not = vize_not;
		this.final_not = final_not;
		this.gecme_not=(vize_not*4/10) + (final_not*6/10);
		kisisayisi+=1;
		this.no=kisisayisi;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getVize_not() {
		return vize_not;
	}

	public void setVize_not(int vize_not) {
		this.vize_not = vize_not;
	}

	public int getFinal_not() {
		return final_not;
	}

	public void setFinal_not(int final_not) {
		this.final_not = final_not;
	}

	public double getGecme_not() {
		return gecme_not;
	}

	public void setGecme_not(double gecme_not) {
		this.gecme_not = gecme_not;
	}

	public static int getKisisayisi() {
		return kisisayisi;
	}

	public static void setKisisayisi(int kisisayisi) {
		ogrenci.kisisayisi = kisisayisi;
	}
	
	
	
	
	
	
}
