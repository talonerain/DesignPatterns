package AdapterClass;
public class Adapter extends Adaptee implement Target {
	@Override
	public void sampleOperation2() {
		System.out.println("sampleOperation2 is called");
	}
}