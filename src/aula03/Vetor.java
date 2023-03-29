/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

/**
 *
 * @author felip
 */
public class Vetor {
public static void main(String[] args){
    
    int vet[] = new int[5];
    
    System.out.println(vet);
    
    for (int i = 0; i < vet.length; i++){
        vet[i] = i;
    }
    for (int i = 0; i < vet.length; i++){
        System.out.println(vet[i]+ " ");;
    }
}    
    
}
