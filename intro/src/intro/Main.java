package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String internetSubeButonu="�nternet �ubesi";
		double dolarDun = 8.20;
		double dolarBugun=8.20;
		int vade=36;
		boolean dustuMu=true;
		System.out.println(internetSubeButonu);
		
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar D��t� Resmi");
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("Dolar Artt� Resmi");
		}
		else {
			System.out.println("Dolar E�ittir Resmi");
		}
		
		
		
		String[] krediler= {"H�zl� Kredi","Mutlu Emekli Kredisi","Konut Kredisi","�ift�i Kredisi","Msb Kredisi","Meb Kredisi","K�lt�r Bakanl��� Kredisi"};
		//foreach
		for(String kredi:krediler) {
			
			System.out.println(kredi);
		}
		//saya� g�d�ml� d�ng�
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
		
		
		//String'de istisna var Char array'i olsa da De�er Tipi olarak i�lem yap�yor buradaki ��kt� Istanbuldur.
		String sehir1="Ankara";
		String sehir2="Istanbul";
		sehir1=sehir2;
		sehir2="Izmir";
		System.out.println(sehir1);
		
	}

}
