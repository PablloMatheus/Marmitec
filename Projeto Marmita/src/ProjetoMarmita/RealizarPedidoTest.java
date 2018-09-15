package ProjetoMarmita;
import static org.junit.Assert.*;

import org.junit.Test;

public class RealizarPedidoTest {

	@Test
	public void testRealizarPedido() {
		RealizarPedido teste = new RealizarPedido();
		Pedido recebido = teste.pedido("preto", "refogado", "macarrao", "frango assado", "pequeno", "mousse de maracuja","coca cola");
		assertEquals("preto", recebido.getFeijao());
		assertEquals("refogado", recebido.getArroz());
		assertEquals("macarrao", recebido.getMassa());
		assertEquals("frango assado", recebido.getCarne());
		assertEquals("pequeno", recebido.getTamanho());
		assertEquals("mousse de maracuja", recebido.getSobremesa());
		assertEquals("coca cola", recebido.getBebida());
		
	}
	
	@Test
	public void testCriarComida() {
		Feijao novo = new Feijao("preto",13);
		assertEquals("preto", novo.getNome());
		assertEquals(13.0, novo.getPreco(), 0);
	}
	

}
