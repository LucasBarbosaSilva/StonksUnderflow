package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private long score;
	@OneToMany(mappedBy = "usuario")
	private List<Discussao> discussoes;
	
	public Usuario() {
		//Para o hibernate
	}
	
	public Usuario(int id, String nome, long score) {
		this.id = id;
		this.nome = nome;
		this.score = score;
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

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}

	public List<Discussao> getDiscussoes() {
		return discussoes;
	}

	public void setDiscussoes(List<Discussao> discussoes) {
		this.discussoes = discussoes;
	}
}
