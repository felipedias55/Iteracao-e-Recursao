/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04.pilha02;

/**
 *
 * @author felip
 */
public class PilhaDinamica {

    private No inicio, topo;

    public PilhaDinamica() {
        inicio = null;
        topo = null;
    }

    public boolean estaVazia() {
//        if(inicio == null){
//            return true;
//        }
//        return false;
        return (inicio == null);
    }

    public void empilhar(String dado) {
        No novoNo = new No(dado);
        if(estaVazia()){
        inicio = novoNo;
        } else{
            topo.setProximo(novoNo);
        }
        topo = novoNo;
    }
    
    public void exibir(){
        if(estaVazia()){
            System.out.println("Pilha Vazia");
        }
        No aux = inicio;
        
        do{
            System.out.println(aux.getDado());
            aux = aux.getProximo(); // move o No auxiliar para o próximo No da pilha
        } while(aux != null);
        
    }
    
}