package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String yenimesaj = sehirVer();
		System.out.println(yenimesaj);
		int sayi = topla(15, 7);
		System.out.println(sayi);
		int toplam = topla(2, 3, 53, 9, 7);
		System.out.println("Variable Argument :"+toplam);

	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");
	}

	public static String sehirVer() {
		return "Ankara";
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	// burada variable arguments. yani aslında parametre olaak bir sayı dizisi
	// alıyormus gibi düşünğn.
	// buraya asayısı belırtılmedı ama ıstenıldıgı kadar sayi parametresi
	// gonderılebılır.

	public static int topla(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
}
