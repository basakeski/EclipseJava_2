
public class Mainn {

	public static void main(String[] args) {
		product Product= new product(1,"laptop","asus laaptop",3000,2,"siyah");
		Product.name="Laptop";
		Product.setId(1);
		Product.description="Asus Laptop";
		Product.price=5000;
		Product.stockAmount=3;
		ProductManager productManager= new ProductManager();
		productManager.Add(Product);
		
		
	}

}
