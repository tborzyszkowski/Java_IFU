package Lab.Sklep.Model;

public class Klient {
	private int identyfikator;
	private String telefon;
	private String email;
	private String status;

	public Klient(int identyfikator, String telefon, String email, String statu) {
		this.identyfikator = identyfikator;
		this.telefon = telefon;
		this.email = email;
		this.status = statu;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Klient{");
		sb.append("id=").append(identyfikator);
		sb.append(", telefon='").append(telefon).append('\'');
		sb.append(", email='").append(email).append('\'');
		sb.append(", status='").append(status).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
