package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		KrediUI krediUI = new KrediUI();
		
		// burada krediUI basemanager türünden bir nesne aldıgı ve
		// bu asagıdakı  classların hepsi baseden inheritance edildikleri
		//için parametre olarak bunları gonderebılırırz. Çünkü baseManager onları içine alır.
		//bu işlee çok biçimlilik ,(Polimarfizm)
		krediUI.KrediHesapla(new AskerKrediManager());
		krediUI.KrediHesapla(new TarimKrediManager());
		krediUI.KrediHesapla(new OgretmenKrediManager());
	
	}
}
