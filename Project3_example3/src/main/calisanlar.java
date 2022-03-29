package main;

public class calisanlar {

	private int id;
	private String isim;
	private String soyisim;
	private int yas;
	private int cocuksayisi;
	private float maas;
	private static int numara;
	
	float zammiktari =1;
	
	public static int getNumara() {
		return numara;
	}
	public void setNumara(int numara) {
		this.numara = numara;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public int getCocuksayisi() {
		return cocuksayisi;
	}
	public void setCocuksayisi(int cocuksayisi) {
		this.cocuksayisi = cocuksayisi;
	}
	public float getMaas() {
		return maas;
	}
	public void setMaas(float f) {
		this.maas = f;
	}

	public calisanlar(int id,String isim,String soyisim,int yas,int cocuksayisi,float maas){
		
		this.id=id;
		this.isim=isim;
		this.soyisim=soyisim;
		this.yas=yas;
		this.cocuksayisi=cocuksayisi;
		this.maas=maas;
		
	}
	//bu metod olmasaydý main içerisinde calisanlar(*)-> * bölümünü doldurmamý isteyecekti.
	public calisanlar() {
		this(0,"Bilgi yok","Bilgi yok",0,0,0);
	}
	
	
	public void bilgiYazdir(){
		
		System.out.println("ýd->"+id+"\nIsim->"+isim+"\nSoy isim->"+soyisim+"\nYas->"+yas+"\nCocuk sayisi->"+cocuksayisi+"\nMaas->"+maas+"\nUye sayisi->"+numara);
		System.out.println("-------------------------------------------------------\n");
	}
	
	public void yeniMaasHesapla(){
		
		
		if(cocuksayisi>=1) {
			zammiktari = (float) ((1.5/100)*cocuksayisi);
			
			maas = (maas*zammiktari)+maas;
		}
		if(yas>40) {
			zammiktari = (float)(3.5/100);
			
			maas = (maas*zammiktari)+maas;
		}
		if(yas<40 && cocuksayisi==0) {
			zammiktari = (float)(2.5/100);
			
			maas = (maas*zammiktari)+maas;
		}
		if(yas<40) {
			zammiktari = (float)(3/100);
			
			maas = (maas*zammiktari)+maas;
		}
		if(maas<=2500) {
			zammiktari = (float)(5/100);
			
			maas = (maas*zammiktari)+maas;
			
		}
		
	}
}
