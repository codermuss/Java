package interfaceAbstractDemo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.of(1997, 7, 8);
		// BaseCustomerManager baseCustomerManager = new
		// StarBucksCustomerManager(MernisSe);
		Customer customer = new Customer(1, "Mustafa", "Yýlmaz", "TC", date);

		// baseCustomerManager.Save(customer);

		System.out.println();
	}

}
