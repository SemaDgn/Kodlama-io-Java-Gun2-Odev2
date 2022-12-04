package classesWebAttributes;

public class Main {

	public static void main(String[] args) {
		//1. constructor çalısır.
		Product product = new Product();
		product.setName("Laptop");
		product.id=1;
		product.setDescription("Asus LAptop");
		product.setStockAmount(3);
		product.setPrice(5.000);
		product.setRenk("");
		
		//2. constructor çalıstı.
		product= new Product(2,"Laptop","Lenoca Laptop",5,6.000,"");																			
		
		ProductMannager productMannager= new ProductMannager();
		productMannager.Add(product);
		System.out.println("Ürün kodu : "+product.getKodu());
	}
}
