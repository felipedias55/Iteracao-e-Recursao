/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatorial;

/**
 *
 * @author felip
 */
public class FatorialRecursivo {
public static void main (String[] args){
    int n = 4;  
    System.out.println("O fatorial de "+ n + " é "+ fatorialRecursivo(n)); 
}

static int fatorialRecursivo(int numero){
    
    // caso base
    if (numero ==0){
        return 1;
    }
    return numero * fatorialRecursivo(numero -1 );
}
    
}
