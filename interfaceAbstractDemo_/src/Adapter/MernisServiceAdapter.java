package Adapter;

import java.rmi.RemoteException;

import interfaceAbstractDemo_.Abstract.ICustomerCheckService;
import interfaceAbstractDemo_.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		System.out.println(Long.parseLong(customer.NationalityID));
		System.out.println(customer.FirstName.toUpperCase());
		System.out.println(customer.LastName.toUpperCase());
		System.out.println(customer.birthOfDate.getYear());
		try {

			return client.TCKimlikNoDogrula(Long.parseLong(customer.NationalityID), customer.FirstName.toUpperCase(),
					customer.LastName.toUpperCase(), customer.birthOfDate.getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
