package dao;

import java.util.List;

import model.Usuario;
import model.UsuarioPadrao;


public interface IDAOUsuarioPadrao {

	UsuarioPadrao getUsuarioPadrao(int id);
	List<UsuarioPadrao> getUsuariosPadrao();
	void adicionarOuAlterarUsuarioPadrao(UsuarioPadrao u);
	List<UsuarioPadrao> getUsuariosPadrao(String filtroNome);
	void apagarUsuarioPadrao(UsuarioPadrao u);
	
}
