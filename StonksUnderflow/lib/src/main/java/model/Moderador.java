package model;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	public String toString() {
		return "MOD "+super.toString();
	}
}
