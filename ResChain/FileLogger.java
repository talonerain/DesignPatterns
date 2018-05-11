package ResChain;
public class FileLogger {

	@Override
	void write(Chain chain) {
		System.out.println("FileLogger is called");
		chain.proceed();
	}
}