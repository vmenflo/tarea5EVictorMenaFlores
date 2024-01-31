/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParteA;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author victor
 */
public class Main {

    public static void main(String[] args) {

        Vaqueria vaqueria = new Vaqueria();
        //Método añadir
        Vaca uno = new Vaca(1, LocalDate.now(), "Vaca lechera");
        Vaca dos = new Vaca(2, LocalDate.now(), "Vaca gorda");
        Vaca tres = new Vaca(3, LocalDate.now(), "Vaca con manchas");
        Vaca cuatro = new Vaca(4, LocalDate.now(), "Vaca tolon tolon");

        vaqueria.add(uno);
        vaqueria.add(dos);
        vaqueria.add(tres);
        vaqueria.add(cuatro);
        //La mostramos
        vaqueria.mostrar();
        
        //Probar método tamaño
        System.out.println(vaqueria.numeroVacas());
        //Ver si está vacía
        System.out.println("¿Está llena? : " + vaqueria.estaLlena());
        
        //Pasar a una arraylist
        ArrayList<Vaca> vaqueriaLista = vaqueria.generarArrayVacas();
        System.out.println("Array de Vaqueria \n " + vaqueriaLista);
        
        //Buscar una vaca
        System.out.println("Se encuentra en la lista la vaca uno? "
                +vaqueria.buscarVaca(uno));
        //Darla de baja
        vaqueria.darBajaVaca(tres);
        vaqueria.mostrar();
    }
}
