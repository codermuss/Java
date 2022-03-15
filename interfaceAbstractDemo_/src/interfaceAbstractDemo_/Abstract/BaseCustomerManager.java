package interfaceAbstractDemo_.Abstract;

import interfaceAbstractDemo_.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Saved to db: " + customer.FirstName);
	}

}
