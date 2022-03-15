package hrmsSystem.hrms.core.utilities.adapters.concretes;

import java.util.Random;

public class ValidationCodeGenerator {

    public static String generete(){
       return String.valueOf((int)(Math.random()*9000+1000));
    }

}
