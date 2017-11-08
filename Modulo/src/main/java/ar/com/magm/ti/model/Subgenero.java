package ar.com.magm.ti.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy = false)
@Access(value = AccessType.FIELD)
@Table(name = "subgenero")
public class Subgenero implements Serializable {

    private static final long serialVersionUID = 2464927409480955012L;
    @Id
    @GeneratedValue
    private int idSubgenero;
    private String nombre;

    public Subgenero() {
        super();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getIdSubgenero() {
        return idSubgenero;
    }

    public void setIdSubgenero(int idSubgenero) {
        this.idSubgenero = idSubgenero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        return getIdSubgenero();

    }

    @Override
    public String toString() {
        return String.format("Sub-Genero: %s - %s", getIdSubgenero(), getNombre());
    }

    @Override
    public boolean equals(Object obj) {
        return getIdSubgenero() == ((Subgenero) obj).getIdSubgenero();
    }

}
