/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04.pilha02;

/**
 *
 * @author felip
 */
public class AppPilha02 {
    public static void main(String[] args){
        
        PilhaDinamica p = new PilhaDinamica();
        System.out.println("Pilha Vazia? " + p.estaVazia());
        p.empilhar("F");
        p.empilhar("N");
        p.empilhar("A");
        
        p.exibir();
    }
    
}
