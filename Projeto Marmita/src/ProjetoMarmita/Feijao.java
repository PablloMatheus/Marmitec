package ProjetoMarmita;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feijao")

public class Feijao {
	
	
	@Id
	@Column
	private String nome;
	@Column
	private double preco;
	
	public Feijao(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}


	public String getNome() {
		return nome;
	}

	
	
	
}
