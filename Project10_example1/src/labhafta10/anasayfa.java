package labhafta10;

public class anasayfa {

	public static void main(String[] args) {

		jenerik<Integer> intdeger=new jenerik (50);
		jenerik<String> stdeger=new jenerik <String>("HarunVeli");
		jenerik<Double> dbldeger=new jenerik <Double>(42.42);
		
		//intdeger.add(new Integer(50));
		
		intdeger.nesnebilgilerinigoruntule();
		stdeger.nesnebilgilerinigoruntule();
		dbldeger.nesnebilgilerinigoruntule();
		
		calisan ogrenci= new calisan("Harun","Veli",18);
		
		jenerik<calisan> calisnesne=new jenerik<calisan>(ogrenci);
		calisnesne.nesnebilgilerinigoruntule();
		
	}

}
