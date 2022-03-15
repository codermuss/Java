package interfaceAbstractDemo_.Concrete;

import interfaceAbstractDemo_.Abstract.ICustomerCheckService;
import interfaceAbstractDemo_.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		// TODO Auto-generated method stub
		// test için kullanýlabliir.
	}

}
