package dao;

import java.util.List;

import model.Moderador;


public interface IDAOModerador{
	
	Moderador getModerador(int id);
	List<Moderador> getModeradores();
	void adicionarOuAlterarModerador(Moderador m);
	List<Moderador> getModeradores(String filtroNome);
	void apagarModerador(Moderador m);
	
}
