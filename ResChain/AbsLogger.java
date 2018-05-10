package ResChain;

public interface AbsLogger {
	void write(IChain chain);

	interface IChain {
		void proceed();
	}
}