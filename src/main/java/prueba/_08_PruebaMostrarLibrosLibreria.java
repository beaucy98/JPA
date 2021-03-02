
package prueba;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.entidad.Libreria;
import modelo.entidad.Libro;


public class _08_PruebaMostrarLibrosLibreria {
 
    public static void main(String args[]) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPALibreria");

        EntityManager em = emf.createEntityManager();
        
        List<Libro> libros = em.createQuery("select l from Libro l").getResultList();
        for(Libro l : libros) {
            System.out.println("******************************************");
            System.out.println(l.toString());
            for(Libreria li : l.getLibreria()) {
                System.out.println(li.toString());
            }
        }
        
        em.close();
        emf.close();
    }
}
