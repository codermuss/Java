package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		// müþteri ekleme kodlarý
		System.out.println("Müþteri Eklendi");
		// Bir kodun içerisinde iþ yapan bir sýnýf new 'leniyorsa hayýr gelmez.
		// DatabaseLogger logger = new DatabaseLogger();
		logger.log();
	}
}
