package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="usarioPadrao")
public class UsuarioPadrao extends Usuario {

	public UsuarioPadrao() {
		super();
	}
	
	public UsuarioPadrao(int id, String nome, long score) {
		super(id, nome, score);
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
