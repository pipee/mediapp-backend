package com.escalab.model;

import javax.persistence.*;

@Entity
@Table(name = "examen")
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idExamen;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "descripcion", nullable = true, length = 150)
    private String descripcion;

    public Integer getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(Integer idExamen) {
        this.idExamen = idExamen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Examen examen = (Examen) o;

        return getIdExamen() != null ? getIdExamen().equals(examen.getIdExamen()) : examen.getIdExamen() == null;
    }

    @Override
    public int hashCode() {
        return getIdExamen() != null ? getIdExamen().hashCode() : 0;
    }
}
