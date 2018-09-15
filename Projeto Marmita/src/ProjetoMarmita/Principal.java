package ProjetoMarmita;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		
		Scanner entrada= new Scanner(System.in);
		Scanner entradaD= new Scanner(System.in);
		Cardapio cardapio = new Cardapio();
		
		while(true) {
			
			System.out.print("comando: ");
			String cmd = entrada.nextLine();
			if("add".equals(cmd)) {
				try {
					System.out.print("digite o tipo de comida: ");
					String tipo = entrada.nextLine();
					System.out.print("nome do prato: ");
					String nome = entrada.nextLine();
					System.out.print("preço: ");
					double preco = entradaD.nextDouble();
					cardapio.add(tipo, nome, preco);
				}catch(InputMismatchException e) {
					System.out.println("parametros incorretos");
				}
				
			}
			
			else if("deletar".equals(cmd)) {
				System.out.print("digite o tipo de comida: ");
				String tipo = entrada.nextLine();
				System.out.print("digite o nome do prato: ");
				String nome = entrada.nextLine();
				try {
					cardapio.deletar(tipo, nome);
				}catch(IllegalStateException e) {
					em.getTransaction().rollback();
					System.out.println("item não existe");
				}
				
			}
			
			else if("cardapio".equals(cmd)) {
				cardapio.print();
			}
			
			else if("editar".equals(cmd)) {
				try {
					System.out.print("digite o tipo de comida: ");
					String tipo = entrada.nextLine();
					System.out.print("digite o nome do prato: ");
					String nome = entrada.nextLine();
					System.out.print("digite o preco: ");
					double preco = entradaD.nextDouble();
					cardapio.editar(tipo, nome, preco);
				}catch(InputMismatchException e) {
					System.out.println("parametros incorretos");
				}
				
			}
			
			else if("pedir".equals(cmd)) {
				System.out.print("Feijão: ");
				String feijao =  entrada.nextLine();
				System.out.print("Arroz: ");
				String arroz = entrada.nextLine();
				System.out.print("massa: ");
				String massa = entrada.nextLine();
				System.out.print("carne: ");
				String carne = entrada.nextLine();
				System.out.print("tamanho: ");
				String tamanho = entrada.nextLine();
				System.out.print("sobremesa: ");
				String sobremesa = entrada.nextLine();
				System.out.print("bebida: ");
				String bebida = entrada.nextLine();
				RealizarPedido pedido = new RealizarPedido();
				Pedido pedidoCliente = pedido.pedido(feijao, arroz, massa, carne, tamanho, sobremesa, bebida);
				cardapio.validarPedido(pedidoCliente);
			}
			else if("sair".equals(cmd)) {
				cardapio.sair();
			}
		}
	}
}
