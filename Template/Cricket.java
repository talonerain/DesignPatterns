package Template;

public class Cricket extends Game {

	@Override
	void init() {
		System.out.println("init");
	}

	@Override
	void start() {
		System.out.println("start");
	}

	@Override
	void end() {
		System.out.println("end");
	}
}