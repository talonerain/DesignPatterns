package Factory;

public class ShapeFactory {

	public Shape getShape(String type) {
		if(type == null) {
			return null;
		}
		if(type.equals("CIRCLE")) {
			return new Circle();
		} else if(type.equals("RECT")) {
			return new Rect();
		}
		return null;
	}
}