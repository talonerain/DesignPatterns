package ResChain;
public class Chain implements AbsLogger.IChain {

	List<AbsLogger> loggers;
	private int index;

	public Chain(int index, List<AbsLogger> loggers) {
		this.loggers = loggers;
		this.index = index;
	}

	@Override
	void proceed() {
		if(index >= loggers.size()) throw new AssertionError();
		Chain next = new Chain(index + 1, loggers);
		AbsLogger logger = loggers.get(index);
		logger.write(next);
	}
}