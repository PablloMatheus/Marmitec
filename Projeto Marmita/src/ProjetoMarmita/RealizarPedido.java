package ProjetoMarmita;
import java.util.Scanner;

public class RealizarPedido {
	
	Scanner entrada = new Scanner(System.in);
	Tamanho tamanhos;
	
	public Pedido pedido(String feijao, String arroz, String massa, String carne, String tamanho, String sobremesa, String bebida) {
		
		for(Tamanho tamanhos : Tamanho.values()) {
			if(tamanhos.getValor().equals(tamanho)) {
				tamanho = tamanhos.getValor();
			}
		}
		Pedido novo = new Pedido(feijao, arroz, massa, carne, tamanho, sobremesa, bebida);
		return novo;
		
		
		
	}
}
