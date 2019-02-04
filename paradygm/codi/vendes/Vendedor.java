package vendes;

import java.util.Vector;
import vendes.ClientePersonal;

public class Vendedor {
	private String _nom;
	private String _cognoms;
	private String _idVenedor;
	public Vector<ClientePersonal> _atendido_por = new Vector<ClientePersonal>();

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

	public void setIdVenedor(String aIdVenedor) {
		this._idVenedor = aIdVenedor;
	}

	public String getIdVenedor() {
		return this._idVenedor;
	}
}