package classesWebAttributes;



public class Product {
	
	//Constructor : Yapıcı Method
	// Her classın kendi isminde bir cons. vardır. bu classdan 
	//  new ile yeni bir nesne türetmek istediğimizde bu constroktor calısıe va yapmak istediğimiz
	// seyleri yapmaua başlar.
	// classla aynı isimde olalacakç
	
	//Burada consttructorlar overloading işlemi yapıldı.
	
	public Product() {
		
	}
	public Product(int id,String name,String description, int stockAmount, double price, String renk)
	{
		System.out.println("Yapıcı method çalıştı");
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
		this.renk=renk;		
	}
	
	

	// Attributes yada field denir.
	// C# daki propertyler
	// JAvada bu attribustesların default erişim belirleyicileri publicdir
	// C# da ise default değer privatedir.
	// PRivate sadece tanımlandıgı blok yanı süslü parantezlerde gecerlidiir.

	/* Encapsulation yazmanmız bazan alanların sadece okunabılır veya 
	 * bu alanlar aynalıs bilgi girilmeden default değerler atamak olabilir.
	 *getter setter yazmak
	 */
	
	
	int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	// kodun set edılemems yanı sadece get lsun readonly olsun o yuzden set
	// sılıyoruz.
	private String kodu;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		// burada kullanılan this ifadesi bu classı niteler.
		// yani bu classdaki attribustes olan id cagırırı ve değer atr.
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	int getStockAmount() {
		return stockAmount;
	}

	void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	String getRenk() {
		return renk;
	}

	void setRenk(String renk) {
		this.renk = renk;
	}

	String getKodu() {
		// substring 0'dan 1'e kadar olan kısmı alır. 1'i dahil etmez.
		return this.name.substring(0, 1) + id;
	}

}
