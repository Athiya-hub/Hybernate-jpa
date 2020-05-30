package com.athiya.hybernatewithjpa.HybernateJpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	JpaModel jp=new JpaModel();
    	jp.setId(100);
    	jp.setName("rimsha");
    	jp.setMarks(100);
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
    	EntityManager em=emf.createEntityManager();
		/* JpaModel jpa=em.find(JpaModel.class,1); */
    	em.getTransaction().begin();
    	em.persist(jp);
    	em.getTransaction().commit();
       System.out.println(jp);
    }
}
