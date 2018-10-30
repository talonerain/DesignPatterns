package AbstractFactory;

public class Client {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		Shape shapeCircle = shapeFactory.getShape("CIRCLE");
		shapeCircle.draw();

		Color colorRed = colorFactory.getColor("RED");
		colorRed.fill();
	}
}