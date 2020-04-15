package com.qintess.hibernate.generics.dao;

import com.qintess.hibernate.generics.base.EntBase;
import com.qintess.hibernate.generics.config.HibernateConfig;
import com.qintess.hibernate.generics.model.Produto;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class GenericDao <T extends EntBase > {
	
	
	//leitura
	public T localizar (Class<T> clazz, long id)  {
		
		Session sessao = HibernateConfig.getSessionFactory().openSession();
		Transaction transacao = null;
		return sessao.find(clazz, id);
		
			
	}
	
	//salvar e update
	public void salvar (T obj)  {
		
		Session sessao = HibernateConfig.getSessionFactory().openSession();
		Transaction transacao = null;
		
		try {
			transacao = sessao.beginTransaction();
			sessao.save(obj);
			transacao.commit();			
			} catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw erro;
			}
			finally {
				sessao.close();
		}
	}	
	

	//deletar
	public void apagar (T obj) {
		Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.remove(obj);
            session.getTransaction().commit();

        }catch (Exception e) {
            if(transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

        } finally {
            session.close();
        }
    }
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletar() {
		// TODO Auto-generated method stub
		
	}

	public void apagar(Class<Produto> clazz, int id) {
		// TODO Auto-generated method stub
		
	}

	public void localizar(Class<Produto> clazz, int id) {
		// TODO Auto-generated method stub
		
	}

	public void localizar(Produto produto1) {
		// TODO Auto-generated method stub
		
	}

	

}
