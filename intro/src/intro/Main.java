package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String internetSubeButonu="Ýnternet Þubesi";
		double dolarDun = 8.20;
		double dolarBugun=8.20;
		int vade=36;
		boolean dustuMu=true;
		System.out.println(internetSubeButonu);
		
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar Düþtü Resmi");
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("Dolar Arttý Resmi");
		}
		else {
			System.out.println("Dolar Eþittir Resmi");
		}
		
		
		
		String[] krediler= {"Hýzlý Kredi","Mutlu Emekli Kredisi","Konut Kredisi","Çiftçi Kredisi","Msb Kredisi","Meb Kredisi","Kültür Bakanlýðý Kredisi"};
		//foreach
		for(String kredi:krediler) {
			
			System.out.println(kredi);
		}
		//sayaç güdümlü döngü
		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		//value types
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		
		System.out.println(sayi1);
		
		//reference types
		int[]sayilar1= {1,2,3,4,5};
		int[]sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		
		
		//String'de istisna var Char array'i olsa da Deðer Tipi olarak iþlem yapýyor buradaki çýktý Istanbuldur.
		String sehir1="Ankara";
		String sehir2="Istanbul";
		sehir1=sehir2;
		sehir2="Izmir";
		System.out.println(sehir1);
		
	}

}
