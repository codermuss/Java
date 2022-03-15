package abstractClasses;

//abstract methodlar override edilmek zorundad�r
// Abstract bir s�n�f olmas� i�in abstract ile imzalanmal�
// Method'un(Operasyonun) abstract olabilmesi i�in yine abstract ile imzalanmas� gerekiyor.
// Abstract bir class da Abstract method olmak zorunda de�il.
// Abstract classlar new lenemez. Yani nesnesi olu�turulamaz
public abstract class GameCalculator {
	public abstract void hesapla();

	public final void gameOver() {
		System.out.println("Oyun Bitti");
	}
}
