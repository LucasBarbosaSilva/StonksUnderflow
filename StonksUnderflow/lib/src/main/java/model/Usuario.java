package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nome;
	private long score;
	@OneToMany(mappedBy = "usuario")
	private List<Discussao> discussoes;

	@OneToMany(mappedBy = "usuario")
	private List<Resposta> respostas;

	public List<Resposta> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}

	public Usuario() {
		//Para o hibernate
	}
	
	public Usuario(String nome, long score) {
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

	@Override
	public String toString() {
		return this.nome + " Score: "+this.score;
	}
	
	
}
