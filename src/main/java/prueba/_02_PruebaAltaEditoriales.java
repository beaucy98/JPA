
package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.entidad.Editorial;

public class _02_PruebaAltaEditoriales {
    
    public static void main(String args[]) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPALibreria");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        Editorial editorial = new Editorial(null, "Ediciones Cátedra", "CL JUAN IGNACIO LUCA DE TENA ,15 28017, MADRID, MADRID", null);
        em.persist(editorial);

        editorial = new Editorial(null, "LUMEN", "Travessera de Gràcia, 47-49 08021 BARCELONA España", null);
        em.persist(editorial);

        editorial = new Editorial(null, "DEBOLSILLO", "CP 11520, Miguel Hidalgo, Ciudad de México", null);
        em.persist(editorial);

        editorial = new Editorial(null, "RAE", "C/ Felipe IV, 4, 28014 Madrid", null);
        em.persist(editorial);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
