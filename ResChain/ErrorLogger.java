package ResChain;
public class ResChain {

	@Override
	void write(Chain chain) {
		System.out.println("ResChain is called");
		chain.proceed();
	}
}