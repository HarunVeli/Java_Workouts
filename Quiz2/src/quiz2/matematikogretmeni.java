package quiz2;

public class matematikogretmeni extends ogretmen implements maas{

	public String brans;
	public matematikogretmeni(String ad, String soyad, int yas, int cs) {
		super(ad, soyad, yas, cs);
		this.brans="Matematik";
	}

	

	@Override
	public double maashesapla() {
		double tb=puanhesapla();
		double maas=(tb*5/7)+5000;
		return maas;
	}

	@Override
	public double puanhesapla() {
		double tb=(cs*100)+(yas*2/3);
		return tb;
	}
}
