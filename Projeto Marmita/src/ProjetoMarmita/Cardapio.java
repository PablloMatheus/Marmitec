package ProjetoMarmita;
import java.util.List;
import java.util.Scanner;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;




public class Cardapio {

	Scanner entrada= new Scanner(System.in);
	Scanner entradaD = new Scanner(System.in);
	
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
	EntityManager em = emf.createEntityManager();
	
	public Cardapio() {
		em.getTransaction().begin();
		Feijao novo = new Feijao("fava", 0);
		em.persist(novo);
		Feijao novo2 = new Feijao("carioca", 0);
		em.persist(novo2);
		Feijao novo3 = new Feijao("macassar", 0);
		em.persist(novo3);
		Feijao novo4 = new Feijao("preto", 0);
		em.persist(novo4);
		Feijao novo5 = new Feijao("verde", 0);
		em.persist(novo5);
		Arroz novo6 = new Arroz("refogado", 0);
		em.persist(novo6);
		Arroz novo7 = new Arroz("arroz de leite", 0);
		em.persist(novo7);
		Arroz novo8 = new Arroz("cozido", 0);
		em.persist(novo8);
		Arroz novo9 = new Arroz("integral comum", 0);
		em.persist(novo9);
		Arroz novo10 = new Arroz("com cenoura", 0);
		em.persist(novo10);
		Carne novo11 = new Carne("frango assado", 0);
		em.persist(novo11);
		Carne novo12 = new Carne("bife cozido", 0);
		em.persist(novo12);
		Carne novo13 = new Carne("bife grelhado com cebola", 0);
		em.persist(novo13);
		Carne novo14 = new Carne("linguiça de frango", 0);
		em.persist(novo14);
		Carne novo15 = new Carne("estrogonofe de frango", 0);
		em.persist(novo15);
		Sobremesa novo16 = new Sobremesa("cupcake", 5.00);
		em.persist(novo16);
		Sobremesa novo17 = new Sobremesa("mousse de maracuja", 4.00);
		em.persist(novo17);
		Sobremesa novo18 = new Sobremesa("delicia de abacaxi", 3.00);
		em.persist(novo18);
		Sobremesa novo19 = new Sobremesa("mousse de morango", 4.00);
		em.persist(novo19);
		Sobremesa novo20 = new Sobremesa("mousse de limao", 4.00);
		em.persist(novo20);
		Bebida novo21 = new Bebida("suco de maracuja", 2.00);
		em.persist(novo21);
		Bebida novo22 = new Bebida("coca cola", 4.00);
		em.persist(novo22);
		Bebida novo23 = new Bebida("suco de laranja", 2.00);
		em.persist(novo23);
		Bebida novo24 = new Bebida("limonada", 3.00);
		em.persist(novo24);
		Bebida novo25 = new Bebida("fanta", 4.00);
		em.persist(novo25);
		Massa novo26 = new Massa("macarrao", 0);
		em.persist(novo26);
		Massa novo27 = new Massa("lasanha", 0);
		em.persist(novo27);
		Massa novo28 = new Massa("panqueca de frango", 0);
		em.persist(novo28);
		Massa novo29 = new Massa("panqueca de sardinha", 0);
		em.persist(novo29);
		Massa novo30 = new Massa("panqueca de carne moida", 0);
		em.persist(novo30);
		em.getTransaction().commit();
		
	}

	
	
	public void add(String tipo, String nome, double preco) {
		em.getTransaction().begin();
		if("feijao".equals(tipo)) {
			Feijao novo = new Feijao(nome, preco);
			em.persist(novo);
			em.getTransaction().commit();
		}
		else if("arroz".equals(tipo)) {
			Arroz novo = new Arroz(nome, preco);
			em.persist(novo);
			em.getTransaction().commit();
		}

		
		else if("carne".equals(tipo)) {
			Carne novo = new Carne(nome, preco);
			em.persist(novo);
			em.getTransaction().commit();
		}
		else if("massa".equals(tipo)) {
			Massa novo = new Massa(nome, preco);
			em.persist(novo);
			em.getTransaction().commit();
		}

		
		else if("sobremesa".equals(tipo)) {
			Sobremesa novo = new Sobremesa(nome, preco);
			em.persist(novo);
			em.getTransaction().commit();
		}
		else if("bebida".equals(tipo)) {
			Bebida novo = new Bebida(nome, preco);
			em.persist(novo);
			em.getTransaction().commit();
		}
		else {
			System.out.println("cardapio não existe");
		}
		
	}
	
	public void deletar(String tipo, String nome) {
		
		if("feijao".equals(tipo)) {
			Feijao comida = null;
			comida = em.find(Feijao.class, nome);
			try {
				if(comida.getNome().equals(nome)) {
					em.getTransaction().begin();
					em.remove(comida);
					em.getTransaction().commit();
				}
				else {
					System.out.println("comida não existe");
				}
			}catch(NullPointerException e) {
				System.out.println("comida não existe");
			}
			
		}
		
		
		
		else if("arroz".equals(tipo)) {
			Arroz comida = null;
			comida = em.find(Arroz.class, nome);
			try {
				if(comida.getNome().equals(nome)) {
					em.getTransaction().begin();
					em.remove(comida);
					em.getTransaction().commit();
				}
				else {
					System.out.println("comida não existe");
				}
			}catch(NullPointerException e) {
				System.out.println("comida não existe");
			}
			
		}
		
		else if("massa".equals(tipo)) {
			Massa comida = null;
			comida = em.find(Massa.class, nome);
			try {
				if(comida.getNome().equals(nome)) {
					em.getTransaction().begin();
					em.remove(comida);
					em.getTransaction().commit();
				}
				else {
					System.out.println("comida não existe");
				}
			}catch(NullPointerException e) {
				System.out.println("comida não existe");
			}
			
		}
		
		
		
		else if("carne".equals(tipo)) {
			Carne comida = null;
			comida = em.find(Carne.class, nome);
			try {
				if(comida.getNome().equals(nome)) {
					em.getTransaction().begin();
					em.remove(comida);
					em.getTransaction().commit();
				}
				else {
					System.out.println("comida não existe");
				}
			}catch(NullPointerException e) {
				System.out.println("comida não existe");
			}
			
		}
		
		
		else if("sobremesa".equals(tipo)) {
			Sobremesa comida = null;
			comida = em.find(Sobremesa.class, nome);
			try {
				if(comida.getNome().equals(nome)) {
					em.getTransaction().begin();
					em.remove(comida);
					em.getTransaction().commit();
				}
				else {
					System.out.println("comida não existe");
				}
			}catch(NullPointerException e) {
				System.out.println("comida não existe");
			}
			
		}
		
		
		
		else if("bebida".equals(tipo)) {
			Bebida bebida = null;
			bebida = em.find(Bebida.class, nome);
			try {
				if(bebida.getNome().equals(nome)) {
					em.getTransaction().begin();
					em.remove(bebida);
					em.getTransaction().commit();
				}
				else {
					System.out.println("comida não existe");
				}
			}catch(NullPointerException e) {
				System.out.println("comida não existe");
			}
			
		}
		
		else {
			System.out.println("cardapio não existe");
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public void print() {
		em.getTransaction().begin();
		Query consulta = em.createQuery("select feijao from Feijao feijao");
		Query consulta2 = em.createQuery("select arroz from Arroz arroz");
		Query consulta3 = em.createQuery("select massa from Massa massa");
		Query consulta4 = em.createQuery("select carne from Carne carne");
		Query consulta5 = em.createQuery("select sobremesa from Sobremesa sobremesa");
		Query consulta6 = em.createQuery("select bebida from Bebida bebida");
		List<Feijao> feijoes = consulta.getResultList();
		List<Arroz> arrozes = consulta2.getResultList();
		List<Massa> massas = consulta3.getResultList();
		List<Carne> carnes = consulta4.getResultList();
		List<Sobremesa> sobremesas = consulta5.getResultList();
		List<Bebida> bebidas = consulta6.getResultList();
		em.getTransaction().commit();
		
		
		System.out.println("TIPOS DE FEIJOES\n");
		for(Feijao prato : feijoes) {
			System.out.printf("Prato: "+prato.getNome()+"\npreço: R$"+"%.2f", prato.getPreco());
			System.out.println();
		}
		
		System.out.println("\nTIPOS DE ARROZ\n");
		for(Arroz prato : arrozes) {
			System.out.printf("Prato: "+prato.getNome()+"\npreço: R$"+"%.2f", prato.getPreco());
			System.out.println();
		
		}
		System.out.println("\nTIPOS DE MASSA\n");
		for(Massa prato : massas) {
			System.out.printf("Prato: "+prato.getNome()+"\npreço: R$"+"%.2f", prato.getPreco());
			System.out.println();
		
		}
		System.out.println("\nTIPOS DE CARNE\n");
		for(Carne prato : carnes) {
			System.out.printf("Prato: "+prato.getNome()+"\npreço: R$"+"%.2f", prato.getPreco());
			System.out.println();
		
		}
		System.out.println("\nTIPOS DE SOBREMESA\n");
		for(Sobremesa prato : sobremesas) {
			System.out.printf("Prato: "+prato.getNome()+"\npreço: R$"+"%.2f", prato.getPreco());
			System.out.println();
		
		}
		System.out.println("\nBEBIDAS\n");
		for(Bebida prato : bebidas) {
			System.out.printf("Prato: "+prato.getNome()+"\npreço: R$"+"%.2f", prato.getPreco());
			System.out.println();
		
		}
	
	}
	
	public void editar(String tipo, String nome, double preco) {
		
		if("feijao".equals(tipo)) {
			em.getTransaction().begin();
			Feijao novo = new Feijao(nome, preco);
			em.merge(novo);
			em.getTransaction().commit();
		}
		
		else if("arroz".equals(tipo)) {
				em.getTransaction().begin();
				Arroz novo = new Arroz(nome, preco);
				em.merge(novo);
				em.getTransaction().commit();
		}
		else if("massa".equals(tipo)) {
			em.getTransaction().begin();
			Massa novo = new Massa(nome, preco);
			em.merge(novo);
			em.getTransaction().commit();
		}
		
		else if("carne".equals(tipo)) {
				em.getTransaction().begin();
				Carne novo = new Carne(nome, preco);
				em.merge(novo);
				em.getTransaction().commit();
		}
		
		else if("sobremesa".equals(tipo)) {
			em.getTransaction().begin();
			Sobremesa novo = new Sobremesa(nome, preco);
			em.merge(novo);
			em.getTransaction().commit();
		}
		
		else if("bebida".equals(tipo)) {
				em.getTransaction().begin();
				Bebida novo = new Bebida(nome, preco);
				em.merge(novo);
				em.getTransaction().commit();
		}
		else {
			System.out.println("cardapio não existe");
		}
		
	}
	
	
	@SuppressWarnings("unchecked")
	public void validarPedido(Pedido pedido) {
		int validator1 = 0;
		int validator2 = 0;
		int validator3 = 0;
		int validator4 = 0;
		int validator5 = 0;
		int validator6 = 0;
		double total = 0;
		em.getTransaction().begin();
		Query consulta = em.createQuery("select feijao from Feijao feijao");
		Query consulta2 = em.createQuery("select arroz from Arroz arroz");
		Query consulta3 = em.createQuery("select massa from Massa massa");
		Query consulta4 = em.createQuery("select carne from Carne carne");
		Query consulta5 = em.createQuery("select sobremesa from Sobremesa sobremesa");
		Query consulta6 = em.createQuery("select bebida from Bebida bebida");
		List<Feijao> feijoes = consulta.getResultList();
		List<Arroz> arrozes = consulta2.getResultList();
		List<Massa> massas = consulta3.getResultList();
		List<Carne> carnes = consulta4.getResultList();
		List<Sobremesa> sobremesas = consulta5.getResultList();
		List<Bebida> bebidas = consulta6.getResultList();
		em.getTransaction().commit();
		
		if(pedido.getFeijao().equals("nao")) {
			validator1 = 1;
		}
		else {
			for(Feijao comparator : feijoes) {
				if(comparator.getNome().equals(pedido.getFeijao())) {
					validator1 = 1;
				}
			}
		}
		
		if(pedido.getArroz().equals("nao")) {
			validator2 = 1;
		}
		else {
			for(Arroz comparator : arrozes) {
				if(comparator.getNome().equals(pedido.getArroz())) {
					validator2 = 1;
				}
			}
		}
		
		if(pedido.getMassa().equals("nao")) {
			validator3 = 1;
		}
		else {
			for(Massa comparator : massas) {
				if(comparator.getNome().equals(pedido.getMassa())) {
					validator3 = 1;
				}
			}
		}
		
		if(pedido.getCarne().equals("nao")) {
			validator4 = 1;
		}
		else {
			for(Carne comparator : carnes) {
				if(comparator.getNome().equals(pedido.getCarne())) {
					validator4 = 1;
				}
			}
		}
		
		if(pedido.getSobremesa().equals("nao")) {
			validator5 = 1;
		}
		else {
			for(Sobremesa comparator : sobremesas) {
				if(comparator.getNome().equals(pedido.getSobremesa())) {
					validator5 = 1;
					total+=comparator.getPreco();
				}
			}
		}
		
		if(pedido.getBebida().equals("nao")) {
			validator6 = 1;
		}
		else {
			for(Bebida comparator : bebidas) {
				if(comparator.getNome().equals(pedido.getBebida())) {
					validator6 = 1;
					total+=comparator.getPreco();
				}
			}
		}
		
		if(validator1 == 0 || validator2 == 0 || validator3 == 0 || validator4 == 0 || 
			 validator5 == 0 || validator6 == 0) {
			System.out.println("ocorreu um erro no seu pedido");
		}
		else {
			if("pequeno".equals(pedido.getTamanho())) {
				total+=15;
			}
			else if("medio".equals(pedido.getTamanho())) {
				total+=20;
			}
			else if("grande".equals(pedido.getTamanho())) {
				total+=25;
			}
			System.out.printf(" pedido efetuado com sucesso\nvalor total: R$"+"%.2f", total+"\n");
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public void sair() {
		em.getTransaction().begin();
		Query consulta = em.createQuery("select feijao from Feijao feijao");
		Query consulta2 = em.createQuery("select arroz from Arroz arroz");
		Query consulta3 = em.createQuery("select massa from Massa massa");
		Query consulta4 = em.createQuery("select carne from Carne carne");
		Query consulta5 = em.createQuery("select sobremesa from Sobremesa sobremesa");
		Query consulta6 = em.createQuery("select bebida from Bebida bebida");
		try {
			List<Feijao> feijoes = consulta.getResultList();
			List<Arroz> arrozes = consulta2.getResultList();
			List<Massa> massas = consulta3.getResultList();
			List<Carne> carnes = consulta4.getResultList();
			List<Sobremesa> sobremesas = consulta5.getResultList();
			List<Bebida> bebidas = consulta6.getResultList();
			for(Feijao comparator : feijoes) {
				em.remove(comparator);
			}
			for(Arroz comparator : arrozes) {
				em.remove(comparator);
			}
			for(Massa comparator : massas) {
				em.remove(comparator);
			}
			for(Carne comparator : carnes) {
				em.remove(comparator);
			}
			for(Sobremesa comparator : sobremesas) {
				em.remove(comparator);
			}
			for(Bebida comparator : bebidas) {
				em.remove(comparator);
			}
			em.getTransaction().commit();
		}catch(PersistenceException e) {
			System.out.println("ocorreu um erro ao tentar trazer um item do banco de dados");
			
		}
		
		
		em.close();
		emf.close();
		System.exit(0);
	}
	
	
	
	
	
}
