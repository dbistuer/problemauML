package vendes;

import java.util.Vector;
import vendes.LiniaPedido;

public class Producto {
	private int _idProducte;
	private String _nom;
	private float _preu;
	public Vector<LiniaPedido> _formado_por = new Vector<LiniaPedido>();

	public void setIdProducte(int aIdProducte) {
		this._idProducte = aIdProducte;
	}

	public int getIdProducte() {
		return this._idProducte;
	}

	public void setNom(String aNom) {
		this._nom = aNom;
	}

	public String getNom() {
		return this._nom;
	}

	public void setPreu(float aPreu) {
		this._preu = aPreu;
	}

	public float getPreu() {
		return this._preu;
	}
}