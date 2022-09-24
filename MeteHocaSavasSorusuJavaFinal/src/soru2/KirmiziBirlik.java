package soru2;

import java.util.Random;

public class KirmiziBirlik extends Birlik {
	int saldiri_kirmizi, savunma_kirmzi;

	public KirmiziBirlik() {
	}

	public int getSaldiri_kirmizi() {
		return saldiri_kirmizi;
	}

	public void setSaldiri_kirmizi(int saldiri_kirmizi) {
		this.saldiri_kirmizi = saldiri_kirmizi;
	}

	public int getSavunma_kirmzi() {
		return savunma_kirmzi;
	}

	public void setSavunma_kirmzi(int savunma_kirmzi) {
		this.savunma_kirmzi = savunma_kirmzi;
	}

	public KirmiziBirlik(int saldiri_kirmizi, int savunma_kirmzi) {
		this.saldiri_kirmizi = saldiri_kirmizi;
		this.savunma_kirmzi = savunma_kirmzi;
	}

	@Override
	public void random() {
		Random sal = new Random();
		saldiri_kirmizi = sal.nextInt(10);
		savunma_kirmzi = 10 + sal.nextInt(25);
	}

	@Override
	public void canEksilt(KirmiziBirlik kb, MaviBirlik mb) {
		kb.random();
		mb.random();
		kb.can -= kb.saldiri_kirmizi - mb.savunma_mavi;
		System.out.println("Mavi kalan cani:" + (kb.can));
		if (can <= 0)
			System.out.println("Kirmizi birlik kazandi.");

	}

}