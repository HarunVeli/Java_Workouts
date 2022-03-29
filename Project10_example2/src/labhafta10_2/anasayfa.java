package labhafta10_2;

public class anasayfa {

	public static <T> void bilgiler(T t) {
		t.toString();
		System.out.println("Nesnenin classi->"+t.getClass().getName());
		System.out.println("------------------------");
	}
	
	
	public static void main(String[] args) {
		
		ogrenci ogrnesne = new ogrenci(18,"Harun","Veli");
		ogretmen ogrtnesne = new ogretmen("Namýk","Ekin",38,"Canavar");
		
		bilgiler(ogrnesne);
		bilgiler(ogrtnesne);
		
	}

}
