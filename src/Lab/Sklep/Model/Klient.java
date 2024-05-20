package Lab.Sklep.Model;

public class Klient {
	private int identyfikator;
	private String telefon;
	private String email;
	private String statu;

	public Klient(int identyfikator, String telefon, String email, String statu) {
		this.identyfikator = identyfikator;
		this.telefon = telefon;
		this.email = email;
		this.statu = statu;
	}

	public int getIdentyfikator() {
		return identyfikator;
	}

	public void setIdentyfikator(int identyfikator) {
		this.identyfikator = identyfikator;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatu() {
		return statu;
	}

	public void setStatu(String statu) {
		this.statu = statu;
	}
}
