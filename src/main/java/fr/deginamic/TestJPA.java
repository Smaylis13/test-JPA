package fr.deginamic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestJPA {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("toto");
		EntityManager em = entityManagerFactory.createEntityManager();

		
		 Query query = em.createNativeQuery("SELECT * FROM PIZZA");
		 
		  List<Object[]> rows = query.getResultList();
		  for (Object[] row : rows) {
			  for(Object o : row){
				  System.out.println(o);
			  }
		  
		  }
		 
		
		em.close();
		entityManagerFactory.close();
	}

}
