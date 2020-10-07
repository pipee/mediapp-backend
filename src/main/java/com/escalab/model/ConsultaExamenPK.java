package com.escalab.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * 
 * @author Luis Armijo
 * Clase creada para manejar la relación muchos a muchos
 *
 */
@Embeddable
public class ConsultaExamenPK  implements Serializable {

    @ManyToOne
    @JoinColumn(name = "id_examen", nullable = false)
    private Examen examen;

    @ManyToOne
    @JoinColumn(name = "id_consulta", nullable = false)
    private Consulta consulta;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConsultaExamenPK that = (ConsultaExamenPK) o;

        if (examen != null ? !examen.equals(that.examen) : that.examen != null) return false;
        return consulta != null ? consulta.equals(that.consulta) : that.consulta == null;
    }

    @Override
    public int hashCode() {
        int result = examen != null ? examen.hashCode() : 0;
        result = 31 * result + (consulta != null ? consulta.hashCode() : 0);
        return result;
    }
}
