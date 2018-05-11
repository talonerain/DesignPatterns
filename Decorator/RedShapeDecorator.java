package Decorator;

public class RedShapeDecorator extends Decorator {

	public RedShapeDecorator (Shape decoratorShape) {
		super(decoratorShape);
	}

	@Override
	public void draw() {
		decoratorShape.draw();
		setRedBorder(decoratorShape);
	}

	//为被装饰对象增加的职能
	private void setRedBorder(Shape decoratorShape) {
		System.out.println("Border Color: Red");
	}
}