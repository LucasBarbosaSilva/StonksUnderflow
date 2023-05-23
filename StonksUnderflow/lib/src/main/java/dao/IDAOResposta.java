package dao;

import model.Categoria;
import model.Resposta;

import java.util.List;

public interface IDAOResposta {
	Resposta getResposta(int id);

	void adicionarOuAlterarResposta(Resposta r);

	void apagarResposta(Resposta r);
}
