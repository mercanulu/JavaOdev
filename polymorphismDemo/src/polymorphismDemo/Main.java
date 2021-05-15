package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		//polymorphism
		//BaseLogger[] loggers = new BaseLogger[] { new EmailLogger(), new DatabaseLogger(), new FileLogger(),new ConsoleLogger() };
		//for (BaseLogger logger : loggers) {
			//logger.Log("Log mesajý");}
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		customerManager.add();
		

	}

}
