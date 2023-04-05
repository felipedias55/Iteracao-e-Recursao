/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04.pilha01;

import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class PilhaDinamica {
   private ArrayList<String> conteudo;
   private final int MAX;
    
    public PilhaDinamica(){
        conteudo = new ArrayList<>();
        MAX = -1;
    }
    public PilhaDinamica(int max){
        conteudo = new ArrayList<>();
        MAX = max;
    }
    
    public boolean empilhar(String dado){
        if(estaCheia()){
        
        return false;
        }
        conteudo.add(dado);
        return true;
    }
    public String desempilhar(){
        if(!estaVazia()){
            return conteudo.remove(conteudo.size() - 1);
        }
        return null;
    }
    
    public boolean estaVazia(){
        return conteudo.isEmpty();
    }
    
    public boolean estaCheia(){
        if(MAX < 0){
            return false;
        }
        return (conteudo.size() == MAX);
    }
    
}
