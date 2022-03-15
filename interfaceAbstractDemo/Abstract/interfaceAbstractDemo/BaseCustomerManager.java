package interfaceAbstractDemo;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Saved to DB: " + customer.getFirstName());
	}

}
