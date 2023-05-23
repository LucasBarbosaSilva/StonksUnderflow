package dao;

import java.util.List;

import model.Usuario;


public interface IDAOUsuario{
	
	Usuario getUsuario(int id);
	List<Usuario> getUsuarios();
	void adicionarOuAlterarUsuario(Usuario u);
	List<Usuario> getUsuarios(String filtroNome);
	void apagarUsuario(Usuario u);
	
}
