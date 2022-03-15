package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();

		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";

		CustomerManager customerManager = new CustomerManager();

		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "9999";
		/*
		 * customerManager.add(hepsiBurada); customerManager.add(engin);
		 * customerManager.add(abc);
		 */

		Customer[] customers = { engin, abc, hepsiBurada };
		customerManager.addMultiple(customers);
	}

}
