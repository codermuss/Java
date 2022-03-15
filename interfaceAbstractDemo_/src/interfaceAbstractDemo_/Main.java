package interfaceAbstractDemo_;

import java.time.LocalDate;

import Adapter.MernisServiceAdapter;
import interfaceAbstractDemo_.Abstract.BaseCustomerManager;
import interfaceAbstractDemo_.Concrete.StarbucksCustomerManager;
import interfaceAbstractDemo_.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate dTarihi = LocalDate.of(1997, 7, 8);

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(0, "Mustafa", "Yýlmaz", dTarihi, "202029064474"));

	}

}
