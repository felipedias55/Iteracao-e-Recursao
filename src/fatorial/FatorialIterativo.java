/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatorial;

/**
 *
 * @author felip
 */
public class FatorialIterativo {
public static void main (String[] args){
    int n = 4;  
    System.out.println("O fatorial de "+ n + " é "+ fatorialIterativo(n));          
}
  
static int fatorialIterativo(int numero){
    int fat = 1;
    
    for(int i = numero; i>0; i--){
        fat *=i; //fat = fat * i;
    }
    return fat;
}
}
