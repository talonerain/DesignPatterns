public class Product{
	private String name;
	private int id;
	private int length;
	private String ext;

	public void print(){
		System.out.println("name: " + name);
	}

	public static class Builder{
		Product product = new Product();

		public Builder name(String name){
			product.name = name;
		}

		public Builder id(int id){
			product.id = id;
		}

		public Builder length(int length){
			product.length = length;
		}

		public Builder ext(String ext){
			product.ext = ext;
		}

		public Product build(){
			return product;
		}
	}
}