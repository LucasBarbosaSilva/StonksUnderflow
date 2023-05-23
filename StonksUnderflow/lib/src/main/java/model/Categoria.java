package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
	@Id
	@GeneratedValue	
	private int id;
	private String nome;
	
	@OneToMany(mappedBy = "categoria")
	private List<possuirCategoriaDiscussao> discussoes;

	public Categoria() {
	}	

	public Categoria(int id, String nome, List<possuirCategoriaDiscussao> discussoes) {
		this.id = id;
		this.nome = nome;
		this.discussoes = discussoes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<possuirCategoriaDiscussao> getDiscussoes() {
		return discussoes;
	}

	public void setDiscussoes(List<possuirCategoriaDiscussao> discussoes) {
		this.discussoes = discussoes;
	}	

	
	
	
}
