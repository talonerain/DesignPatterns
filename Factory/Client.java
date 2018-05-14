package Factory;

public class Client {

	public static void main(String args[]) {
		ShapeFactory factory = new ShapeFactory();

		Shape shapeRect = factory.getShape("Rect");
		Shape shapeCircle = factory.getShape("Circle");

		shapeRect.draw();
		shapeCircle.draw();
	}
}