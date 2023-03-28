/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maiorVetor;

import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class MaiorVetor {
public static void main (String[] args){
    final int TAM = 10;
    
    int vetor[] = new int[10];
   
    for(int i = 0; i < TAM; i++){
       vetor[i] = (int) (Math.random() * TAM * 10);
    }
    
    for (int i = 0; i <vetor.length; i++){
          System.out.print(vetor[i] + " ");
    }
    System.out.println("\nMaior: "+ maior(vetor, TAM));
    
}
    static int maior(int vetor[], int tam){
        
        if(tam ==1){
         return vetor[0];   
        }
        int maiorParcial = maior(vetor, tam-1);
        
        if (vetor[tam -1] > maiorParcial){
            return vetor[tam -1];
        }
        return maiorParcial;

    }
}
