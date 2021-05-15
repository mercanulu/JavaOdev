package polymorphismDemo;

public class EmailLogger extends BaseLogger {
	@Override
	public void Log(String message) {
		System.out.println("Logged to email : " + message);
	}
}
