package test;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.TodoItem;

@Stateless
@LocalBean
@WebService(serviceName = "TodoService", name = "TodoService", //
portName = "TodoBeanPort", targetNamespace = "http://xmlns.wellnr.com")
public class TodoService {

	@PersistenceContext(unitName = "TodoApp")
	private EntityManager em;
	
	public TodoItem add(String summary, String description) {
		TodoItem item = new TodoItem();
		item.setDescription(description);
		item.setSummary(summary);
		
		em.persist(item);
		
		return item;
	}
	
}
