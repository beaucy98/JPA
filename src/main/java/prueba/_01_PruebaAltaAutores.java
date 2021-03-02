package prueba;

import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.entidad.Autor;

public class _01_PruebaAltaAutores {

    public static void main(String args[]) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPALibreria");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Calendar cal = Calendar.getInstance();
        cal.set(1927, 3, 6, 0, 0, 0);
        Autor autor = new Autor(null, "Gabriel", "García Márquez", cal.getTime(), null);
        em.persist(autor);

        cal.set(1899, 8, 24, 0, 0, 0);
        autor = new Autor(null, "Jorge Luis", "Borges", cal.getTime(), null);
        em.persist(autor);

        cal.set(1917, 5, 16, 0, 0, 0);
        autor = new Autor(null, "Juan", "Ruflo", cal.getTime(), null);
        em.persist(autor);

        cal.set(1527, 9, 29, 0, 0, 0);
        autor = new Autor(null, "Miguel", "de Cervantes", cal.getTime(), null);
        em.persist(autor);

        cal.set(1936, 8, 18, 0, 0, 0);
        autor = new Autor(null, "Frederico", "Garcia Lorca", cal.getTime(), null);
        em.persist(autor);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
