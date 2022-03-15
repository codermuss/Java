package interfaceAbstractDemo;

import java.rmi.RemoteException;

public class StarBucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService _customerCheckService;

	public StarBucksCustomerManager(ICustomerCheckService _customerCheckService) {
		super();
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		try {
			_customerCheckService.CheckIfRealPerson(customer);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Saved to DB: " + customer.getFirstName());
	}

}
