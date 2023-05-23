package main;

import org.hibernate.Session;

import hibernate.HibernateConfiguration;

public class Main {
	public static void main(String[] args) {
		HibernateConfiguration hbCfg = new HibernateConfiguration();
		
		Session hbSession = hbCfg.getSession();
	}
}
