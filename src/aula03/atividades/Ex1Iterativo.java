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
public class Ex1Iterativo {
public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int numero;
    
    System.out.println("Informe o valor do N: ");
    numero = teclado.nextInt();
    
    System.out.println("Soma de 1 até "+ numero + " = "+ SomaIt(numero));
}
static int SomaIt(int n){
    int soma = 0;
    
    for(int i = 1; i <= n ; i++){
        soma += i;
    }
    return soma;
}
    
}
