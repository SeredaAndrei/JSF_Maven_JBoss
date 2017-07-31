package products;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sereda.ExampleBean;

public class EntityManagerProducer {

	  @PersistenceContext(unitName = "examplePU")
	    private EntityManager entityManager;

	    @Produces
	    public EntityManager createEntityManager(){
	        return entityManager;
	    }

	    @Produces
	    @ExampleQualifier
	    public ExampleBean createExampleBean(){
	        return new ExampleBean();
	    }
	}
