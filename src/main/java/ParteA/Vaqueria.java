/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParteA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author victor
 */
public class Vaqueria {
    //Atributos

    private Set<Vaca> vaqueria = new HashSet<>();

    //Constructor
    public Vaqueria() {

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

    //Metodo añadir Vaqueria de Vacas
    public void add(Vaca vaca) {
        this.vaqueria.add(vaca);
    }

    //Método para saber si la vaqueria tiene vacas
    public boolean estaLlena() {
        return !this.vaqueria.isEmpty();

    }

    //Saber si un animal está en la vaqueria
    public boolean buscarVaca(Vaca vaca) {
        return this.vaqueria.contains(vaca);
    }

    //Sacar todos los animales en forma de Array
    public ArrayList<Vaca> generarArrayVacas() {
        ArrayList<Vaca> lista = new ArrayList<>(vaqueria);

        return lista;
    }

    //Dar de baja una vaca
    public void darBajaVaca(Vaca vaca) {
        this.vaqueria.remove(vaca);
    }

    //Mostrar
    public void mostrar() {
        this.vaqueria.forEach(System.out::println);
    }

    //Mostrar vaqueria con iterador
    public void mostrarConIterador() {
        Iterator<Vaca> iterador = vaqueria.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador);
        }
    }
}
