package prueba;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.entidad.Libreria;
import modelo.entidad.Libro;

public class _07_PruebaMostrarLibreriasLibros {

    public static void main(String args[]) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPALibreria");

        EntityManager em = emf.createEntityManager();

        List<Libreria> librerias = em.createQuery("select l from Libreria l").getResultList();
        for(Libreria a : librerias) {
            System.out.println("******************************************");
            System.out.println(a.toString());
            for(Libro l : a.getLibreriaLibros()) {
                System.out.println(l);
            }
        }
        
        em.close();
        emf.close();
    }
}
