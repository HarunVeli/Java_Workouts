package quiz2ornek;

public class isci extends calisan implements maas{

	public String gorev;
	
	public isci(String ad, String soyad, int yas, int cs) {
		super(ad, soyad, yas, cs);
		this.gorev="Isci";
	}

	@Override
	public double maashesapla() {
		
		return 3000+zamoranihesapla();
	}

	@Override
	public double zamoranihesapla() {
		double zammik=(cs*100)+(yas*2/3);
		return zammik;
	}

}
