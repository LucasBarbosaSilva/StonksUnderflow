package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name= "moderador")
public class Moderador extends Usuario{
	@Column(nullable = false)
	private long registro;
	private long grauReputacao;
	
	public Moderador() {
		super();
	}
	
	public Moderador(String nome, long score, long registro, long grauReputacao) {
		super(nome, score);
		this.registro = registro;
		this.grauReputacao = grauReputacao;
	}
	public long getRegistro() {
		return registro;
	}
	public void setRegistro(long registro) {
		this.registro = registro;
	}
	public long getGrauReputacao() {
		return grauReputacao;
	}
	public void setGrauReputacao(long grauReputacao) {
		this.grauReputacao = grauReputacao;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getScore() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setScore(long score) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Discussao> getDiscussoes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDiscussoes(List<Discussao> discussoes) {
		// TODO Auto-generated method stub
		
	}
}
