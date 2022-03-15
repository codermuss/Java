package hrmsSystem.hrms.core.utilities.adapters.concretes;

import hrmsSystem.hrms.core.utilities.adapters.abstracts.NationIdControllService;

public class MernisControlAdapter implements NationIdControllService {

    @Override
    public boolean controll(String nationalId) {
        System.out.println("Your national identity number: "+nationalId+" successfully controlled!");
        return true;
    }


}
