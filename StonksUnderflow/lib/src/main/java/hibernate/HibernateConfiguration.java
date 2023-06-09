 package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import model.Categoria;
import model.Discussao;
import model.Moderador;
import model.Usuario;
import model.UsuarioPadrao;
import model.PossuirCategoriaDiscussao;
import model.Resposta;

public class HibernateConfiguration {

	private Configuration cfg;
	private SessionFactory factory;

	public HibernateConfiguration(){
		cfg = new Configuration();
		cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL55Dialect");
		cfg.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:33061/stonks");
		cfg.setProperty("hibernate.connection.username", "root"); 
		cfg.setProperty("hibernate.connection.password", "1234");

       //opcionais - INICIO
		cfg.setProperty("hibernate.connection.characterEncoding", "utf8");
		cfg.setProperty("hibernate.hbm2ddl.auto", "update"); //Se houver alguma incompatibilidade entre tabela e classe, o hibernate se vira pra resolver.
		cfg.setProperty("hibernate.connection.autoReconnect", "true"); //Se houver queda em execução, a idiea é que ele tente reconectar
		cfg.setProperty("hibernate.show_sql", "true"); //antes de executar o comando, ele printa o comando sql
         //opcionais - FIM

		//Classes persistentes - inicio
		cfg.addAnnotatedClass(Discussao.class);
		cfg.addAnnotatedClass(PossuirCategoriaDiscussao.class);
//		cfg.addAnnotatedClass(Usuario.class);
		cfg.addAnnotatedClass(UsuarioPadrao.class);
		cfg.addAnnotatedClass(Categoria.class);
		cfg.addAnnotatedClass(Moderador.class);
		cfg.addAnnotatedClass(Resposta.class);
		//Classes persistentes - fim
		
	    ServiceRegistry serviceRegistry = 
      new StandardServiceRegistryBuilder().applySettings(this.cfg.getProperties()).build();
	    factory = cfg.buildSessionFactory(serviceRegistry);
	}
	
	
	public Session getSession() {
        //Retorna a sessão aberta
    	return this.factory.openSession();
    }
    
    public Configuration getConfiguration() {
        //Retorna a configuracao
    	return this.cfg;
    }
}
