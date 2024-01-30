/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author victor
 */
public class Vaqueria {
    //Atributos

    private Set<Vaca> vaqueria;

    //Constructor
    public Vaqueria(Set<Vaca> vaqueria) {
        this.vaqueria = vaqueria;
    }

    //Getter and Setter
    public Set<Vaca> getVaqueria() {
        return vaqueria;
    }

    public void setVaqueria(Set<Vaca> vaqueria) {
        this.vaqueria = vaqueria;
    }

    //to string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vaqueria{");
        sb.append("vaqueria=").append(vaqueria);
        sb.append('}');
        return sb.toString();
    }

    //Equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.vaqueria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vaqueria other = (Vaqueria) obj;
        return Objects.equals(this.vaqueria, other.vaqueria);
    }

    //Metodo para saber el numero de vacas
    public int numeroVacas() {
    return vaqueria.size();
    }
}
