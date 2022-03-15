package Adapter;

import java.rmi.RemoteException;

import Manager.UserCheckService;
import odev3.Model.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean CheckIfRealPerson(User user) {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirsName().toUpperCase(),
					user.getLastName().toUpperCase(), user.getBirthOfDate().getYear());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
