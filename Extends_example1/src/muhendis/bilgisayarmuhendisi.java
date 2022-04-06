package muhendis;

public class bilgisayarmuhendisi extends muhendis{

	public bilgisayarmuhendisi(String ad, int yas) {
		super(ad, yas);
		this.brans="Bilgisayar";
	}

	@Override
	public void bilgileriyazdir() {
		super.bilgileriyazdir();
	}

	@Override
	public int puanhesapla() {
		this.puan=this.yas*4;
		return this.puan;
	}

	
	
	
	

	
}
