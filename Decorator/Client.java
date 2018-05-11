package Decorator;
public class Client {

	public static void main(String args[]) {
		Shape circle = new Circle();	//被装饰对象
		Shape redCircle = new RedShapeDecorator(circle);

		redCircle.draw();	//即调用了被装饰对象的方法，又调用添加的方法
	}
}