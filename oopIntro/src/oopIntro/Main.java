package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB Ram", 10.0);
//		product1.ID=1;
//		product1.name="Lenovo V14";
//		product1.unitPrice=15000;
//		product1.detail="16 GB Ram";
//		
		Product product2 = new Product();
		product2.setID(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		System.out.println(product2.getUnitPriceAfterDiscount());

		Category category1 = new Category();
		category1.setID(1);
		category1.setName("Ýçecek");

		Category category2 = new Category();
		category2.setID(2);
		category2.setName("Yiyecek");
		System.out.println(category1.getName());
		System.out.println(category2.getName());

	}

}
