package muhendis;

public class makinemuhendisi extends muhendis{

	public makinemuhendisi(String ad, int yas) {
		super(ad, yas);
		this.brans="Makine";
	}

	@Override
	public void bilgileriyazdir() {
		super.bilgileriyazdir();
	}
	
	
	@Override
	public int puanhesapla() {
		return this.yas*3;
	}

	

	
}
