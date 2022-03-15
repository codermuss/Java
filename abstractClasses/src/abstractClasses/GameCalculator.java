package abstractClasses;

//abstract methodlar override edilmek zorundadýr
// Abstract bir sýnýf olmasý için abstract ile imzalanmalý
// Method'un(Operasyonun) abstract olabilmesi için yine abstract ile imzalanmasý gerekiyor.
// Abstract bir class da Abstract method olmak zorunda deðil.
// Abstract classlar new lenemez. Yani nesnesi oluþturulamaz
public abstract class GameCalculator {
	public abstract void hesapla();

	public final void gameOver() {
		System.out.println("Oyun Bitti");
	}
}
