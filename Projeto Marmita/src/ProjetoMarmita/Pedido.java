package ProjetoMarmita;

import java.util.Scanner;

public class Pedido {
	
	
	Scanner entrada = new Scanner(System.in);
	
	private String feijao;
	private String arroz;
	private String massa;
	private String carne;
	private String tamanho;
	private String sobremesa;
	private String bebida;
	
	public Pedido(String feijao, String arroz, String massa, String carne, String tamanho,String sobremesa, String bebida) {
		this.feijao = feijao;
		this.arroz = arroz;
		this.massa = massa;
		this.carne = carne;
		this.sobremesa = sobremesa;
		this.bebida = bebida;
		this.tamanho = tamanho;
		
	}

	public String getTamanho() {
		return tamanho;
	}

	public String getSobremesa() {
		return sobremesa;
	}

	public String getBebida() {
		return bebida;
	}

	public String getFeijao() {
		return feijao;
	}

	public String getArroz() {
		return arroz;
	}

	public String getMassa() {
		return massa;
	}

	public String getCarne() {
		return carne;
	}

	
		
	
	
}
