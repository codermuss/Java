package interfaces;

public class CustomerManager {

	private Logger[] loggers;

	public CustomerManager(Logger[] logger) {

		this.loggers = logger;
	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi: " + customer.getFirstName());
		// this.logger.log(customer.getFirstName());

		Utils.runLoggers(loggers, customer.getFirstName());
	}

	public void delete(Customer customer) {
		System.out.println("Müþteri Silindi: " + customer.getFirstName());
		// this.logger.log(customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}
