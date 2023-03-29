/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03.atividades;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class Ex1Recursivo {
public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int numero;
    
    System.out.println("Informe o valor do N: ");
    numero = teclado.nextInt();
    
    System.out.println("Soma de 1 até "+ numero + " = "+ SomaRec(numero));

}

static int SomaRec(int n){ 
    if(n <= 1){ // caso base
        return n;    
    }
    return n + SomaRec(n-1);
    
}  
}