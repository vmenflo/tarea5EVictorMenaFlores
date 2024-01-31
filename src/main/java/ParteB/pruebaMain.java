/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParteB;

import ParteA.Vaca;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Víctor
 */
public class pruebaMain {
    public static void main(String[] args) {
        VaqueriaOrdenada vaqueria = new VaqueriaOrdenada();
        System.out.println("Esta lleno el set?: " + vaqueria.estaLlena());
        //Método añadir
        Vaca cinco = new Vaca(5, LocalDate.now(), "Vaca lechera");
        Vaca dos = new Vaca(2, LocalDate.of(2012, 1, 12), "Vaca gorda");
        Vaca tres = new Vaca(3, LocalDate.of(2016, 5, 9), "Vaca con manchas");
        Vaca uno = new Vaca(1, LocalDate.of(1994, 1, 26), "Vaca tolon tolon");
        Vaca cuatro = new Vaca(4, LocalDate.of(2016, 5, 9), "Vaca muuu");

        vaqueria.add(uno);
        vaqueria.add(dos);
        vaqueria.add(tres);
        vaqueria.add(cuatro);
        vaqueria.add(cinco);
        //La mostramos
        vaqueria.mostrar();
        System.out.println("-----Total de vacas: " + vaqueria.numeroVacas());
        
        //Borramos
        vaqueria.darBajaVaca(cinco);
        System.out.println("Despues de dar de baja a la número 5: ");
        vaqueria.mostrar();
        System.out.println("-----Total de vacas: " + vaqueria.numeroVacas());
        //Generar ArrayList
        ArrayList<Vaca> listaVacas = vaqueria.generarArrayVacas();
        System.out.println("Las muestra ya ordenadas");
        System.out.println(listaVacas);
    }
}
