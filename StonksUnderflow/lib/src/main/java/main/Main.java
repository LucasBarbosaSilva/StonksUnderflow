package main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import dao.DAOCategoria;
import dao.DAODiscussao;
import dao.DAOResposta;
import dao.DAOUsuario;
import hibernate.HibernateConfiguration;
import model.Categoria;
import model.Discussao;
import model.Moderador;
import model.Resposta;
import model.Usuario;
import model.UsuarioPadrao;
import utils.ENUMStatusDiscussao;

public class Main {
	public static void main(String[] args) {
		HibernateConfiguration hbCfg = new HibernateConfiguration();
		Session hbSession = hbCfg.getSession();
		
//		DAOCategoria daoCategoria = new DAOCategoria();
//		List<Categoria> categorias = new ArrayList<Categoria>();
//		Categoria c = daoCategoria.getCategoria(1);
//		categorias.add(c);
//		DAOUsuario daoUsuario = new DAOUsuario();
//		Usuario u = new UsuarioPadrao("Lucas", 10);
//		daoUsuario.adicionarOuAlterarUsuario(u);
//		List<Usuario> usuarios = daoUsuario.getUsuarios("Lu");
//		System.out.println(usuarios);
//		Discussao d = new Discussao("Deu um problema aqui", "Tava codando com Java e deu tudo errado", ENUMStatusDiscussao.ABERTA, categorias, usuarios.get(0));
//		DAODiscussao daoDiscussao = new DAODiscussao();
//		daoDiscussao.adicionarOuAlterarDiscussao(d);
//		d = daoDiscussao.getDiscussoes("um problema").get(0);
//		Resposta r = new Resposta("A culpa é sua", 1 , u, d, null);
//		DAOResposta daoResposta = new DAOResposta();
//		daoResposta.adicionarOuAlterarResposta(r);
	}
}
