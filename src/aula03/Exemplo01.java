/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

/**
 *
 * @author felip
 */
public class Exemplo01 {
    public static void main(String[] args){
        int numero = 5;
        Pessoa p;
        
        numero = 8;
        System.out.println(numero);
        
  
        
        p = new Pessoa();
        p.idade = 12;
        
        System.out.println(p.idade);
        System.out.println(p.nome);
        p = new Pessoa();
        
        System.out.println(p.idade);
        
    }
    
}
