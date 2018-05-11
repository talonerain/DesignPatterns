package Decorator;

public abstract class Decorator implements Shape {
	protected Shape decoratorShape;

	public Decorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		decoratedShape.draw();
	}
}