package model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="usarioPadrao")
public class UsuarioPadrao extends Usuario {
	
	public UsuarioPadrao() {
		super();
	}
	
	public UsuarioPadrao(String nome, long score) {
		super(nome, score);
	}
	
}
