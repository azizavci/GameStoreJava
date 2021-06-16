package Adapter;


import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entity.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
        boolean result = false;
          try {
              result = soapClient.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalId()), gamer.getFirstName(), gamer.getLastName(), gamer.getDateOfBirth());
          } catch (NumberFormatException e) {
               e.printStackTrace();
          } catch (RemoteException e) {
               e.printStackTrace();
          }
         return result;
	}

		
	

}
