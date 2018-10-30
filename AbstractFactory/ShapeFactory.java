package AbstractFactory;

public class ShapeFactory implements AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		if(shape == null) {
			return null;
		}
		if(shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if(shape.equalsIgnoreCase("RECT")) {
			return new Rect();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}
}