/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04.pilha01;

/**
 *
 * @author felip
 */
public class AppPilha01 {
    public static void main(String args[]){
        PilhaDinamica p = new PilhaDinamica(5);
        
       for(int i = 0; i < 10; i++){
           p.empilhar(String.valueOf(i));
       }
       
       while(!p.estaVazia()){
           System.out.print(p.desempilhar()+ " ");
       }
    } 
}
