package muhendis;

public class elektrikmuhendisi extends muhendis{

	public elektrikmuhendisi(String ad, int yas) {
		super(ad, yas);
		this.brans="Elektric";
	}

	@Override
	public void bilgileriyazdir() {
		super.bilgileriyazdir();
	}

	@Override 
	public int puanhesapla() {
		this.puan=this.yas*5;
		return this.puan;
	}

	
}
