package vendes;

public class ClienteCorporativo extends Cliente {
	private String _idCliCorp;
	public Contrato _usa_como_medio_de_pago;

	public void setIdCliCorp(String aIdCliCorp) {
		this._idCliCorp = aIdCliCorp;
	}

	public String getIdCliCorp() {
		return this._idCliCorp;
	}
}