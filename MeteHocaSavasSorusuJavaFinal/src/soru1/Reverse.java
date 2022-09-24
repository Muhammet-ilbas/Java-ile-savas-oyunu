package soru1;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] vals = { "Volvo", "BMW", "Ford", "Mazda" };
		for (int i = 0; i < vals.length; i++) {
			String metin = vals[i];
			for (int j = metin.length() - 1; j >= 0; j--) {
				System.out.print(metin.charAt(j));
			}
			System.out.println("");
		}

	}
}
/*
public Kullanýcý(String id, String adý, String soyadý, String email, String telefon) {
	super();
	Id = id;
	Adý = adý;
	Soyadý = soyadý;
	Email = email;
	this.telefon = telefon;
}
*/
/*
public class Urun {
	private String Id     ;
	private String Adý     ;
	private int Fiyatý     ;
	private String sonKullanmaTarihi ;
	
	public Urun(String id, String adý, int fiyatý, String sonKullanmaTarihi) {
		super();
		Id = id;
		Adý = adý;
		Fiyatý = fiyatý;
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getAdý() {
		return Adý;
	}

	public void setAdý(String adý) {
		Adý = adý;
	}

	public int getFiyatý() {
		return Fiyatý;
	}

	public void setFiyatý(int fiyatý) {
		Fiyatý = fiyatý;
	}

	public String getSonKullanmaTarihi() {
		return sonKullanmaTarihi;
	}

	public void setSonKullanmaTarihi(String sonKullanmaTarihi) {
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}
	
	
}
*/
/*
public class UrunYorum {
	private String Id;
	private String Yorum;
	private String yorumTarihi;
	private String urunId;
	private String kullanýcýId;
	
	public UrunYorum(String id, String yorum, String yorumTarihi, String urunId, String kullanýcýId) {
		super();
		Id = id;
		Yorum = yorum;
		this.yorumTarihi = yorumTarihi;
		this.urunId = urunId;
		this.kullanýcýId = kullanýcýId;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getYorum() {
		return Yorum;
	}

	public void setYorum(String yorum) {
		Yorum = yorum;
	}

	public String getYorumTarihi() {
		return yorumTarihi;
	}

	public void setYorumTarihi(String yorumTarihi) {
		this.yorumTarihi = yorumTarihi;
	}

	public String getUrunId() {
		return urunId;
	}

	public void setUrunId(String urunId) {
		this.urunId = urunId;
	}

	public String getKullanýcýId() {
		return kullanýcýId;
	}

	public void setKullanýcýId(String kullanýcýId) {
		this.kullanýcýId = kullanýcýId;
	}
	
	
	
	
}
*/
