package labhafta10;

public class jenerik <A>{
	
	private A a;
	
	
	public void nesnebilgilerinigoruntule() {
		System.out.println("Bilgileri->"+a.toString());
		System.out.println("Tipi->"+a.getClass().getName());
		System.out.println("------------------------");
	}
	
	public jenerik(A a) {
		this.a = a;
	}
	
	
	
}
