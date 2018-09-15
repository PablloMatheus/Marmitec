package ProjetoMarmita;

public enum Tamanho {
	
	PEQUENO("pequeno"), MEDIO("medio"), GRANDE("grande");
	
	private String valor;
	
	Tamanho(String valor){
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
	
	
}
