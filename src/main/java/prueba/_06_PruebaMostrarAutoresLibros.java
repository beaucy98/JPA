
package prueba;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.entidad.Autor;
import modelo.entidad.Libro;

public class _06_PruebaMostrarAutoresLibros {
    
    public static void main(String args[]) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPALibreria");

        EntityManager em = emf.createEntityManager();
        
        List<Autor> autores = em.createQuery("select a from Autor a").getResultList();
        for(Autor a : autores) {
            System.out.println("******************************************");
            System.out.println(a.toString());
            for(Libro l : a.getLibros()) {
                System.out.println(l);
            }
        }
        
        em.close();
        emf.close();
        
    }
}
