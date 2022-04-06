package labhafta5;

public class ogrenci {

	private int id;
	private String isim,soyisim;
	private static int sayac = 1;
	
	public ogrenci(String isim, String soyisim) {
		this.id = sayac;
		sayac+=1;
		this.isim = isim;
		this.soyisim = soyisim;
	}
	

	public ogrenci() {
	}

	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public void bilgileriyazdir() {
		System.out.println("Id->"+id+"\nIsim->"+isim+"\nSoy isim->"+soyisim);
	}
	
}
