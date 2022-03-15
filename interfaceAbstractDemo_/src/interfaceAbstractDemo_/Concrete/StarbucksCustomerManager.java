package interfaceAbstractDemo_.Concrete;

import interfaceAbstractDemo_.Abstract.BaseCustomerManager;
import interfaceAbstractDemo_.Abstract.ICustomerCheckService;
import interfaceAbstractDemo_.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	ICustomerCheckService _customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService _customerCheckService) {
		super();
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);

		} else {
			System.out.println("Not a valid person");
		}

	}
}
