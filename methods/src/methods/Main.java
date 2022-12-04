package methods;

public class Main {
	//methoslar kendımızı tekrarlamamızı engeller.

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		
	}
	
	public static void sayiBulmaca()
	{
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak=13;
		boolean varMi=false;
		
		for (int sayi : sayilar) {
			
			if(sayi==aranacak)
			{
				varMi= true;
				break;
			}
		}
		if (varMi) {
			mesajVer("Sayı mevcuttur : "+aranacak);
			
		}
		else {
			mesajVer("Sayı mevcuttur değildir : "+aranacak);
		}
			
	}
	
	public static void mesajVer(String mesaj) {
		
		System.out.println(mesaj);
		
	}
}
