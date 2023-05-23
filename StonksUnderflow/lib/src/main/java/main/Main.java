package main;

import java.util.ArrayList;

import model.*;
import org.hibernate.Session;

import dao.DAOCategoria;
import hibernate.HibernateConfiguration;

public class Main {
	public static void main(String[] args) {
		HibernateConfiguration hbCfg = new HibernateConfiguration();
		Categoria c = new Categoria("Problema", new ArrayList<PossuirCategoriaDiscussao>());
		DAOCategoria daoCategoria = new DAOCategoria();
		daoCategoria.adicionarOuAlterarCategoria(c);
		Session hbSession = hbCfg.getSession();
	}
}
