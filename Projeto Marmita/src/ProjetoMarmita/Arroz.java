package ProjetoMarmita;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="arroz")
public class Arroz {
	
	@Id
	@Column
	private String nome;
	@Column
	private double preco;
	
	public Arroz(String nome, double preco) {
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
