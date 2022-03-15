package mernisv2;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) {
		KPSPublicSoapProxy service = new KPSPublicSoapProxy();
		String tcNO = "";
		try {
			boolean result = service.TCKimlikNoDogrula(Long.parseLong(tcNO), "MUSTAFA", "YILMAZ", 1900);
			System.out.println(result);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
