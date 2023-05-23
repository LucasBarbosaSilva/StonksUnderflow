package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String nome;
	
	@OneToMany(mappedBy = "categoria")
	private List<PossuirCategoriaDiscussao> discussoes;

	public Categoria() {
	}	

	public Categoria(String nome, List<PossuirCategoriaDiscussao> discussoes) {
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

	public List<PossuirCategoriaDiscussao> getDiscussoes() {
		return discussoes;
	}

	public void setDiscussoes(List<PossuirCategoriaDiscussao> discussoes) {
		this.discussoes = discussoes;
	}	

	@Override
	public String toString() {
		return this.nome;
	}
	
	
}
