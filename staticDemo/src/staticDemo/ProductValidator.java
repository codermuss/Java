package staticDemo;

public class ProductValidator {

	static {
		System.out.println("Static Yapýcý calisti");
	}

	public ProductValidator() {
		System.out.println("Constructor calisti");
	}

	public static boolean isValid(Product product) {

		if (product.price > 0 && !product.name.isEmpty()) {
			return true;

		} else {
			return false;
		}

	}

	public void bisey() {
	}

}

//static bir örnek oluþturur. Sadece 1 tane
// Manager sýnýflar static yapýlmaz. Çünkü herkes sadece 1 nesneden iþlem yapýyor static'de.
// Ana Class Static olamaz
// Class içinde Class olabilir buna innerClass denir
// innerClass'lar static olabilir

/*
 * public static class BaskaBirClass{ public static void Sil() {
 * 
 * } }
 */
