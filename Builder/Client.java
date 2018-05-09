public class Client{
	public static void main(){
		Product instance = Product.Builder.name("name").id(0).build();
		instace.print();
	}
}