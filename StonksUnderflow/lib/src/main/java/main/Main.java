package main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import dao.DAOCategoria;
import dao.DAODiscussao;
import dao.DAOModerador;
import dao.DAOResposta;
import dao.DAOUsuarioPadrao;
import hibernate.HibernateConfiguration;
import model.Categoria;
import model.Discussao;
import model.Resposta;
import model.UsuarioPadrao;
import utils.ENUMStatusDiscussao;

public class Main {
	public static void main(String[] args) {
		HibernateConfiguration hbCfg = new HibernateConfiguration();
		Session hbSession = hbCfg.getSession();
		DAOResposta daoResposta = new DAOResposta();
		DAOCategoria daoCategoria = new DAOCategoria();
		DAODiscussao daoDiscussao = new DAODiscussao();
		DAOUsuarioPadrao daoUsuarioPadrao = new DAOUsuarioPadrao();
		DAOModerador daoModerador = new DAOModerador();
//		
//		UsuarioPadrao usuario = new UsuarioPadrao("Pedro", 10);
//		Categoria categoria = new Categoria("Java");
//		daoUsuarioPadrao.adicionarOuAlterarUsuarioPadrao(usuario);
//		daoCategoria.adicionarOuAlterarCategoria(categoria);
//		
//		List<Categoria> categorias = new ArrayList<Categoria>();
//		categorias.add(categoria);
//		Discussao discussao = new Discussao("Problemas com Java", "Tudo dando errado", ENUMStatusDiscussao.ABERTA, categorias, usuario);
//		daoDiscussao.adicionarOuAlterarDiscussao(discussao);
//		
		
		
		DAODiscussao daoDiscussao2 = new DAODiscussao();
		
		Categoria categoria2 = new Categoria("MySQL");
		Categoria categoria3 = new Categoria("Xamp");
		
		List<Categoria> categorias = new ArrayList<Categoria>();
		categorias.add(categoria2);
		categorias.add(categoria3);
		daoCategoria.adicionarOuAlterarCategoria(categoria2);
		daoCategoria.adicionarOuAlterarCategoria(categoria3);
		
		UsuarioPadrao usuario = new UsuarioPadrao("Cayo", 11);
		daoUsuarioPadrao.adicionarOuAlterarUsuarioPadrao(usuario);
		Discussao discussao2 = new Discussao("Problemas com MySQL e Xamp", "Algo dando errado", ENUMStatusDiscussao.ABERTA, categorias, usuario);
		daoDiscussao2.adicionarOuAlterarDiscussao(discussao2);
		
		List<Discussao> discussoes = daoDiscussao2.getDiscussoes();
		for(Discussao d: discussoes) {
			System.out.println(d);
		}
	}
}
