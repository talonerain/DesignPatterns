package Observable;

public class Subject {

	private List<Object> observers = new ArrayList<>();

	public void attach(Observer observer) {
		observers.add(observer);
		System.out.println("Attached an observer");
	}

	public void detach(Observer observer) {
		observers.remove(observer);
		System.out.println("Detached an observer");
	}

	public void notifyObservers(String newState) {
		for(Observer observer : observers) {
			observer.update(newState);
		}
	}
}