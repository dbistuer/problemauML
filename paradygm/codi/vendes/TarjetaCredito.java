package vendes;

public class TarjetaCredito extends SistemaPago {
	private String _idUsuari;
	private String _nom;
	private String _cognoms;
	private float _saldo;
	public ClientePersonal _usa_como_medio_de_pago;

	public void pagar(float aSaldo) {
		throw new UnsupportedOperationException();
	}

	public void ingressar(float aSaldo) {
		throw new UnsupportedOperationException();
	}

	public void setIdUsuari(String aIdUsuari) {
		this._idUsuari = aIdUsuari;
	}

	public String getIdUsuari() {
		return this._idUsuari;
	}

	public void setNom(String aNom) {
		this._nom = aNom;
	}

	public String getNom() {
		return this._nom;
	}

	public void setCognoms(String aCognoms) {
		this._cognoms = aCognoms;
	}

	public String getCognoms() {
		return this._cognoms;
	}

	public void setSaldo(float aSaldo) {
		this._saldo = aSaldo;
	}

	public float getSaldo() {
		return this._saldo;
	}
}