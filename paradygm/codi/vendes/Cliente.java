package vendes;

public class Cliente {
	private int _idClient;
	private String _nom;
	private String _cognoms;
	private java.util.Vector<Pedidos> _unnamed_Pedidos_3;

	public void setIdClient(int aIdClient) {
		this._idClient = aIdClient;
	}

	public int getIdClient() {
		return this._idClient;
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

	public void setUnnamed_Pedidos_3(Pedidos aUnnamed_Pedidos_3) {
		this._unnamed_Pedidos_3 = aUnnamed_Pedidos_3;
	}

	public Pedidos getUnnamed_Pedidos_3() {
		return this._unnamed_Pedidos_3;
	}
}