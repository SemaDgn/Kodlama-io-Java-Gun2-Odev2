package clases;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager1 = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager1 = customerManager2;
		customerManager1.Add();
		customerManager1.Remove();
		customerManager1.Update();

		// value type vriable
		//bu veri tipleri stack hafızada tutuldukları için sayi1 nın değeri değiştiğinde 
		//sayi2nin değeri sayi1 nin ilk dğğeri olarak kaldı. bu durumsa referans tipli verilede değişir.tam tersidir.
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);//10 yazar.
		
		
		// burada sayiların2 sının elemenıda değişir. Çünkü referans tipli verilerde adres bilgisi stack hfızada tutulurken değer bilgisi heap hafızada 
		// tutulur ve siz bir değişkeni birine atanırsak o değişkenin heap hafızadaki değei değil adres bilgisi kopyalanıyor. biri değiştiğinde ikiside değişiyor.
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);

	}
}
