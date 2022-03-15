package interfaces_Odev;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerManager customerManager = new CustomerManager(new SqlCustomerDal());
		customerManager.add();

	}

}

// bir class birden fazla implement edebilir
// bir ckass birden fazla extends edemez.