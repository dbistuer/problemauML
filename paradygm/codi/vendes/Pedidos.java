package vendes;

public class Pedidos {
	private int _idPedido;
	private java.util.Vector<LiniaPedido> _unnamed_LiniaPedido_2;
	public Cliente _realitza;

	public void setIdPedido(int aIdPedido) {
		this._idPedido = aIdPedido;
	}

	public int getIdPedido() {
		return this._idPedido;
	}

	public void setUnnamed_LiniaPedido_2(LiniaPedido aUnnamed_LiniaPedido_2) {
		this._unnamed_LiniaPedido_2 = aUnnamed_LiniaPedido_2;
	}

	public LiniaPedido getUnnamed_LiniaPedido_2() {
		return this._unnamed_LiniaPedido_2;
	}
}