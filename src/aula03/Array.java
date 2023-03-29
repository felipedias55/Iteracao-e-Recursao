/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class Array {
public static void main(String[] args){
    
    ArrayList<Integer> lista = new ArrayList<>();
    
    for (int i = 0;i < 5; i++){
    lista.add(i);
    }
//    System.out.println(lista);
    
    for (int i = 0; i < lista.size(); i++){
        System.out.print(lista.get(i) + " ");
    }
    System.out.println("-------");
    for (Integer numero: lista){ // Para cada número da lista, faça:
        System.out.print(numero+" ");
    }
    
    System.out.println("\nremovendo");
    lista.remove(1);
    System.out.println(lista);
    System.out.println(lista.get(1));
}
}
