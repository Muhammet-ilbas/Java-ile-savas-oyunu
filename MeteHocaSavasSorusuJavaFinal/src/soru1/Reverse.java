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
public Kullan�c�(String id, String ad�, String soyad�, String email, String telefon) {
	super();
	Id = id;
	Ad� = ad�;
	Soyad� = soyad�;
	Email = email;
	this.telefon = telefon;
}
*/
/*
public class Urun {
	private String Id     ;
	private String Ad�     ;
	private int Fiyat�     ;
	private String sonKullanmaTarihi ;
	
	public Urun(String id, String ad�, int fiyat�, String sonKullanmaTarihi) {
		super();
		Id = id;
		Ad� = ad�;
		Fiyat� = fiyat�;
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getAd�() {
		return Ad�;
	}

	public void setAd�(String ad�) {
		Ad� = ad�;
	}

	public int getFiyat�() {
		return Fiyat�;
	}

	public void setFiyat�(int fiyat�) {
		Fiyat� = fiyat�;
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
	private String kullan�c�Id;
	
	public UrunYorum(String id, String yorum, String yorumTarihi, String urunId, String kullan�c�Id) {
		super();
		Id = id;
		Yorum = yorum;
		this.yorumTarihi = yorumTarihi;
		this.urunId = urunId;
		this.kullan�c�Id = kullan�c�Id;
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

	public String getKullan�c�Id() {
		return kullan�c�Id;
	}

	public void setKullan�c�Id(String kullan�c�Id) {
		this.kullan�c�Id = kullan�c�Id;
	}
	
	
	
	
}
*/
