/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;

/**
 *
 * @author victor
 */
public class Main {

    public static void main(String[] args) {

        Vaqueria vaqueria = new Vaqueria();

        vaqueria.add(new Vaca(1, LocalDate.now(), "Vaca lechera"));
        vaqueria.add(new Vaca(2, LocalDate.now(), "Vaca lechera"));
        vaqueria.add(new Vaca(3, LocalDate.now(), "Vaca lechera"));
        vaqueria.add(new Vaca(4, LocalDate.now(), "Vaca lechera"));

        //Probar método tamaño
        System.out.println(vaqueria.numeroVacas());
    }
}
