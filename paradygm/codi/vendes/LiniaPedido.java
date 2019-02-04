package vendes;

public class LiniaPedido {
	private int _idLiniaPedido;
	private float _preu;
	private java.util.Vector<Producto> _unnamed_Producto_1;
	public Pedidos _consta_de;

	public void setIdLiniaPedido(int aIdLiniaPedido) {
		this._idLiniaPedido = aIdLiniaPedido;
	}

	public int getIdLiniaPedido() {
		return this._idLiniaPedido;
	}

	public void setPreu(float aPreu) {
		this._preu = aPreu;
	}

	public float getPreu() {
		return this._preu;
	}

	public void setUnnamed_Producto_1(Producto aUnnamed_Producto_1) {
		this._unnamed_Producto_1 = aUnnamed_Producto_1;
	}

	public Producto getUnnamed_Producto_1() {
		return this._unnamed_Producto_1;
	}
}