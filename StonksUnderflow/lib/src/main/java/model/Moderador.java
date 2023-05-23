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
	
	public Moderador(long registro, long grauReputacao) {
		super();
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
