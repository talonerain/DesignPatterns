package Observable;

public class ConcreteObserver extends Observer {
	
	private String observerState;

	@Override
	public void update(int state) {
		this.observerState = state;
		System.out.println("ConcreteObserver state: " + observerState);
	}
}