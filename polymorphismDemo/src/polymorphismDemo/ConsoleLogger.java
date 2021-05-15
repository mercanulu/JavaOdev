package polymorphismDemo;

public class ConsoleLogger extends BaseLogger {
	@Override
	public void Log(String message) {
		System.out.println("Logged to console : " + message);
	}
}
