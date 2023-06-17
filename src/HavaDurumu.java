import java.util.Scanner;
public class HavaDurumu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Merhaba Size Nasıl Hitap Etmemi İstersiniz? ");
		String kullaniciAdi = scanner.nextLine();
		
		System.out.println("Bulunduğunuz Yerde Hava Durumu Nasıl " + kullaniciAdi + "?");
		System.out.println("1- Güneişli");
		System.out.println("2- Bulutlu");
		System.out.println("3- Yağmurlu");
		System.out.println("4- Fırtınalı");
		System.out.println("Lütfen Bir Numara Giriniz," + kullaniciAdi);
		
		int secim =scanner.nextInt();
		
		if (secim == 1) {
			System.out.println("Hava Güvenşli, " + kullaniciAdi + "Şapka Ve Güneş Gözülüğünü Unutma.");
		} else if (secim ==2) {
			System.out.println("Hava Bulutlu, " + kullaniciAdi + ", Yanına Bir Hırka Alman Senin için İyi Olabilir.");

		} else if ( secim == 3) {
			System.out.println("Hava Yağmurlu, " + kullaniciAdi + ", Şemsiye Veya Yağmurluk Almanı Öneririm.");
		
		} else if (secim == 4) { 
			System.out.println("Hava Fırtınalı, " + kullaniciAdi + ", Dışarıya Çıkma Ve Güvende Kal.");
		}
		
		else {
			System.out.println("Geçersiz Bir seçenek Girdin, " + kullaniciAdi);
		}
	}

}
