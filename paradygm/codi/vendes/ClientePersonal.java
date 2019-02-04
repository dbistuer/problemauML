package vendes;

public class ClientePersonal extends Cliente {
	private String _idcliPer;
	public Vendedor _atendido_por;
	public TarjetaCredito _usa_como_medio_de_pago;

	public void setIdcliPer(String aIdcliPer) {
		this._idcliPer = aIdcliPer;
	}

	public String getIdcliPer() {
		return this._idcliPer;
	}
}