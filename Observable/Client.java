package Observable;

public class Client {
	public static void main(String args[]) {
		//被观察者对象(目标对象)
		Subject subject = new Subject();
		Observer observer = new ConcreteObserver();
		subject.attach(observer);
		subject.notifyObservers("");
	}
}