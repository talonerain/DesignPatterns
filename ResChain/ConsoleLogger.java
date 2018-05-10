package ResChain;
public class ConsoleLogger {

	@Override
	void write(Chain chain) {
		System.out.println("ConsoleLogger is called");
		chain.proceed();
	}
}