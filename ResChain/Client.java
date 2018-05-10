package ResChain;
public class Client {

	public static void main(String args[]) {
		List<AbsLoggers> list = new ArrayList<>();
		list.add(new ConsoleLogger());
		list.add(new ErrorLogger());
		list.add(new FileLogger());
		Chain chain = new Chain(list, 0);
	}
}