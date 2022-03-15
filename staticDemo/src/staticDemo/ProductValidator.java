package staticDemo;

public class ProductValidator {

	static {
		System.out.println("Static Yap�c� calisti");
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

//static bir �rnek olu�turur. Sadece 1 tane
// Manager s�n�flar static yap�lmaz. ��nk� herkes sadece 1 nesneden i�lem yap�yor static'de.
// Ana Class Static olamaz
// Class i�inde Class olabilir buna innerClass denir
// innerClass'lar static olabilir

/*
 * public static class BaskaBirClass{ public static void Sil() {
 * 
 * } }
 */
