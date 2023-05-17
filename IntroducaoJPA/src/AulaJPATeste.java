
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author edson
 */
public class AulaJPATeste {
    public static void main(String[] args) {
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        
        Usuario u1 = new Usuario("Edson");
        Usuario u2 = new Usuario("Renata");
        Usuario u3 = new Usuario("Maria");
        
        em.getTransaction().begin();
        em.persist(u1);
        em.persist(u2);
        em.persist(u3);
        em.getTransaction().commit();
        
    }
}
