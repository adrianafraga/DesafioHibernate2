package com.qintess.hibernate.generics.config;

	
	import java.util.Properties;

	import org.hibernate.SessionFactory;
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.cfg.Environment;
	import org.hibernate.service.ServiceRegistry;

import com.qintess.hibernate.generics.model.Fornecedor;
import com.qintess.hibernate.generics.model.FornecedorHasProduto;
import com.qintess.hibernate.generics.model.Produto;
import com.qintess.hibernate.generics.model.Venda;
import com.qintess.hibernate.generics.model.VendaItens;




	public class HibernateConfig {
		
		
		private static SessionFactory sessionFactory;
		
	
		public static SessionFactory getSessionFactory() {
			
			if(sessionFactory == null) {
				
				try {
					
					Configuration configuration = new Configuration ();
					
					//funciona como hash map, chaves e valores
					Properties  prop = new Properties();
					
					//configuração de conexão ao banco de dadoa
					prop.put(Environment.DRIVER,"org.h2.Driver");
					prop.put(Environment.URL, "jdbc:h2:~/db~DesafioHibernate2");
					prop.put(Environment.USER, "sa");
					prop.put(Environment.PASS, "");
					prop.put(Environment.DIALECT, "org.hibernate.dialect.H2Dialect");// o DIALECT, passa particulares no sql
					
					//mostra as execuções de sql no console
					prop.put(Environment.SHOW_SQL,"true");
					
					//a cada vez que for criado uma banco sera criado e dropado, usado em ambiente de teste
					prop.put(Environment.HBM2DDL_AUTO,"create-drop");
					
					
					configuration.setProperties(prop);
					
					configuration.addAnnotatedClass(Fornecedor.class);
					configuration.addAnnotatedClass(FornecedorHasProduto.class);
					configuration.addAnnotatedClass(Produto.class);
					configuration.addAnnotatedClass(VendaItens.class);
					configuration.addAnnotatedClass(Venda.class);
		
					
					//registro do serviço do hibernate
					ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
														.applySettings(configuration.getProperties())
														.build();
					
					sessionFactory = configuration.buildSessionFactory(serviceRegistry);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			return sessionFactory;
			
		}


}


