package prueba;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.entidad.Libro;

public class _05_PruebaMostrarLibros {

    public static void main(String args[]) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPALibreria");

        EntityManager em = emf.createEntityManager();

        List<Libro> libros = em.createQuery("select l from Libro l").getResultList();
        for (Libro l : libros) {
            System.out.println("******************************************");
            System.out.println(l.toString());
            System.out.println(l.getAutor().toString());
            System.out.println(l.getEditorial().toString());
        }

        em.close();
        emf.close();
    }
}
