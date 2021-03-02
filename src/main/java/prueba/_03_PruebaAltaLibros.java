
package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.entidad.Autor;
import modelo.entidad.Editorial;
import modelo.entidad.Libro;

public class _03_PruebaAltaLibros {
    
    public static void main(String args[]) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPALibreria");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        //autores
        Autor gabrielGarcia = em.find(Autor.class, 1);
        Autor jorgeLuis = em.find(Autor.class, 2);
        Autor juanRuflo = em.find(Autor.class, 3);
        Autor miguelCervantes = em.find(Autor.class, 4);
        Autor frederico = em.find(Autor.class, 5);
        //editoriales
        Editorial rae = em.find(Editorial.class, 1);
        Editorial debolsillo = em.find(Editorial.class, 2);
        Editorial catedra = em.find(Editorial.class, 3);
        Editorial lumen = em.find(Editorial.class, 4);
        
        //libro 1
        Libro libro = new Libro(null, "Cien años de soledad", 9.45f, gabrielGarcia, debolsillo);
        em.persist(libro);
        //libro 2
        libro = new Libro(null, "Crónica de una muerte anunciada", 9.95f, gabrielGarcia, debolsillo);
        em.persist(libro);
        //libro 3
        libro = new Libro(null, "Relato de un náufrago", 9.95f, gabrielGarcia, debolsillo);
        em.persist(libro);
        //libro 4
        libro = new Libro(null, "Ficciones", 9.95f, jorgeLuis, debolsillo);
        em.persist(libro);
        //libro 5
        libro = new Libro(null, "Borges profesor", 21.90f, jorgeLuis, lumen);
        em.persist(libro);
        //libro 6
        libro = new Libro(null, "Historia universal de la infamia", 21.90f, jorgeLuis, debolsillo);
        em.persist(libro);
        //libro 7
        libro = new Libro(null, "Pedro Páramo", 9.20f, juanRuflo, catedra);
        em.persist(libro);
        //libro 8
        libro = new Libro(null, "El árbol de la ciencia", 10.20f, juanRuflo, catedra);
        em.persist(libro);
        //libro 9
        libro = new Libro(null, "Don Quijote de la Mancha", 10.20f, miguelCervantes, rae);
        em.persist(libro);
        //libro 10
        libro = new Libro(null, "Entremeses", 13.90f, miguelCervantes, catedra);
        em.persist(libro);
        //libro 11
        libro = new Libro(null, "La casa de Bernarda Alba", 9.20f, frederico, catedra);
        em.persist(libro);
        //libro 12
        libro = new Libro(null, "De viva voz", 10.95f, frederico, debolsillo);
        em.persist(libro);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
