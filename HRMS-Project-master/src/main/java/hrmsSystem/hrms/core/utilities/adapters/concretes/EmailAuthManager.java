package hrmsSystem.hrms.core.utilities.adapters.concretes;

import hrmsSystem.hrms.entities.concretes.Users;

public class EmailAuthManager {

    public static boolean Auth(Users users, String code){
        System.out.println("Email authentication has been completed Email: "+users.getEmail()+" Validation code:"+code);
        return true;
    }


}
