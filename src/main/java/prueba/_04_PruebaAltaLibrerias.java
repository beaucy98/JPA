package prueba;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.entidad.Libreria;
import modelo.entidad.Libro;

public class _04_PruebaAltaLibrerias {

    public static void main(String args[]) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPALibreria");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Libreria libreria = new Libreria(null, "Sin Tarima Libros", "Pedro Perez");
        List<Libro> libros = new ArrayList();
        libros.add(em.find(Libro.class, 11));
        libros.add(em.find(Libro.class, 10));
        libros.add(em.find(Libro.class, 2));
        libros.add(em.find(Libro.class, 7));
        libros.add(em.find(Libro.class, 3));
        libros.add(em.find(Libro.class, 1));
        libros.add(em.find(Libro.class, 4));
        libreria.setLibreriaLibros(libros);
        em.persist(libreria);

        libreria = new Libreria(null, "Casa del Libro", "Maria Lopez");
        libros = new ArrayList();
        libros.add(em.find(Libro.class, 4));
        libros.add(em.find(Libro.class, 12));
        libros.add(em.find(Libro.class, 5));
        libros.add(em.find(Libro.class, 9));
        libros.add(em.find(Libro.class, 6));
        libros.add(em.find(Libro.class, 8));
        libros.add(em.find(Libro.class, 10));
        libreria.setLibreriaLibros(libros);
        em.persist(libreria);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}
