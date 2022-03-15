package interfaces;

public class DataBaseLogger implements Logger {

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("Database Loglandý: " + message);

	}

}
