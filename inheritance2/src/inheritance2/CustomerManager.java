package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		// m��teri ekleme kodlar�
		System.out.println("M��teri Eklendi");
		// Bir kodun i�erisinde i� yapan bir s�n�f new 'leniyorsa hay�r gelmez.
		// DatabaseLogger logger = new DatabaseLogger();
		logger.log();
	}
}
