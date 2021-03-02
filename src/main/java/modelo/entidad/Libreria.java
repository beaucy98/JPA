package modelo.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "libreria")
public class Libreria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "nombre_duenio")
    private String nombreDuenio;
    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "libreria_libros", joinColumns = @JoinColumn(name = "libreria_id"), inverseJoinColumns = @JoinColumn(name = "libro_id"))
    private List<Libro> libreriaLibros = new ArrayList<>();

    public Libreria() {
    }

    public Libreria(Integer id, String nombre, String nombreDuenio) {
        this.id = id;
        this.nombre = nombre;
        this.nombreDuenio = nombreDuenio;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public List<Libro> getLibreriaLibros() {
        return libreriaLibros;
    }

    public void setLibreriaLibros(List<Libro> libreriaLibros) {
        this.libreriaLibros = libreriaLibros;
    }

    @Override
    public String toString() {
        return "Libreria{" + "id=" + id + ", nombre=" + nombre + ", nombreDuenio=" + nombreDuenio + '}';
    }

}
