package vendes;

public class Contrato extends SistemaPago {
	private int _lineaCredito;
	private String _nom;
	private String _cognoms;
	private String _idPersona;
	public ClienteCorporativo _usa_como_medio_de_pago;

	public void setLineaCredito(int aLineaCredito) {
		this._lineaCredito = aLineaCredito;
	}

	public int getLineaCredito() {
		return this._lineaCredito;
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

	public void setIdPersona(String aIdPersona) {
		this._idPersona = aIdPersona;
	}

	public String getIdPersona() {
		return this._idPersona;
	}
}