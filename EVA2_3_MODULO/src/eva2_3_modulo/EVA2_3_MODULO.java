/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_modulo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_3_MODULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor, residuo;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el valor");
        valor = input.nextInt();
        
        residuo = valor % 2; // % operador de modulo --> residuo
        if(residuo == 0) //VALOR ES PAR
            System.out.println("EL VALOR ES PAR");
        else
            System.out.println("EL VALOR ES IMPAR");
        
        
    }
    
}
