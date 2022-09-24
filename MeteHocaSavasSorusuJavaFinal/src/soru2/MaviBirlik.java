package soru2;

import java.util.Random;

public class MaviBirlik extends Birlik {
	int saldiri_mavi, savunma_mavi;

	public MaviBirlik() {
	}

	public int getSaldiri_mavi() {
		return saldiri_mavi;
	}

	public void setSaldiri_mavi(int saldiri_mavi) {
		this.saldiri_mavi = saldiri_mavi;
	}

	public int getSavunma_mavi() {
		return savunma_mavi;
	}

	public void setSavunma_mavi(int savunma_mavi) {
		this.savunma_mavi = savunma_mavi;
	}

	public int getCan() {
		return can;
	}

	public void setCan(int can) {
		this.can = can;
	}

	public MaviBirlik(int saldiri_mavi, int savunma_mavi) {
		this.saldiri_mavi = saldiri_mavi;
		this.savunma_mavi = savunma_mavi;
	}

	@Override
	public void random() {
		Random sal = new Random();
		saldiri_mavi = 10 + sal.nextInt(10);
		savunma_mavi = sal.nextInt(5);
	}

	@Override
	public void canEksilt(KirmiziBirlik kb, MaviBirlik mb) {
		kb.random();
		mb.random();
		mb.can -= mb.saldiri_mavi - kb.savunma_kirmzi;
		System.out.println("Kirmizi kalan cani:" + (mb.can));
		if (can <= 0)
			System.out.println("Mavi birlik kazandi");
	}
}