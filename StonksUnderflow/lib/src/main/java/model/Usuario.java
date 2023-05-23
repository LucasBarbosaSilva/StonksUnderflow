package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Usuario {
	@Id
	@GeneratedValue
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

	public abstract int getId();

	public abstract void setId(int id);

	public abstract String getNome();

	public abstract void setNome(String nome);

	public abstract long getScore();

	public abstract void setScore(long score);

	public abstract List<Discussao> getDiscussoes();

	public abstract void setDiscussoes(List<Discussao> discussoes);
	
	
}
