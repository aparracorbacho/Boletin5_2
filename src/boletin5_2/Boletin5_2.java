/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_2;

import java.util.Scanner;

/**
 *
 * @author MotherFoquita
 */
public class Boletin5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double meridiano, paralelo, distancia;
        System.out.println("Introduce en que meridiano esta el satelite");
        Scanner meridianoTeclado = new Scanner(System.in);
        meridiano = meridianoTeclado.nextFloat();
        
        System.out.println("Introduce en que paralelo esta el satelite");
        Scanner pareleloTeclado = new Scanner(System.in);
        paralelo = pareleloTeclado.nextFloat();
        
        System.out.println("Introduce a que distancia esta el satelite");
        Scanner distanciaTeclado = new Scanner(System.in);
        distancia = distanciaTeclado.nextFloat();
        
        Satelite sat = new Satelite(meridiano, paralelo, distancia);
        sat.verPosicion();
    }
    
}
