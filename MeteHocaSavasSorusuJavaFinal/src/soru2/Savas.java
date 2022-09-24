package soru2;

import java.util.Random;
import java.util.Scanner;

public class Savas {

	public static void main(String[] args) {
		KirmiziBirlik kb = new KirmiziBirlik();
		MaviBirlik mb = new MaviBirlik();
		GameStart(kb, mb);

	}

	public static void GameStart(KirmiziBirlik kb, MaviBirlik mb) {
		while (kb.can > 0 && mb.can > 0) {
			String dizi[] = { "Mavi", "kirmizi" };
			Random rd = new Random();
			int sonuc = rd.nextInt(2);
			String secilen = dizi[sonuc];
			if (secilen.equals("Mavi"))
				mb.canEksilt(kb, mb);
			else if (secilen.equals("kirmizi"))
				kb.canEksilt(kb, mb);
		}
		playAgain();

	}

	@SuppressWarnings("resource")
	public static boolean playAgain() {
		KirmiziBirlik kb = new KirmiziBirlik();
		MaviBirlik mb = new MaviBirlik();
		boolean bayrak = true;

		do {
			Scanner in = new Scanner(System.in);
			System.out.println("Tekrar oynamak ister misiniz? ({EVET=\"E\",HAYIR=\"H\"})");
			String sorgu = in.next();
			if (sorgu.toUpperCase().equals("E"))
				GameStart(kb, mb);
			else if (sorgu.toUpperCase().equals("H")) {
				bayrak = false;
				System.out.println("Oyununuz Sonlandirildi.");
				System.out.println("----YINE BEKLERIZ------");
			} else {
				bayrak = false;
				System.out.println("Yanlis islem girdiniz.");
				System.out.println("Islem Iptal Edildi.");
			}
			return bayrak;

		} while (bayrak);

	}
}
