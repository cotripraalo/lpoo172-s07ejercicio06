/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio06;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creando Scanner
        Scanner input = new Scanner(System.in);
        
        //mostrar mensaje al usuario
        System.out.println("INGRESE LADO DE UN HEXAGONO: ");
        double lado= input.nextDouble();
        
        //Calculando el area de hexagono 
        double area=((3 * Math.pow(3,0.5))/2)* Math.pow(lado,2);
        
        //Mostrando el resultado
        System.out.println("El area del hexagono es " + area);
    }
    
}
