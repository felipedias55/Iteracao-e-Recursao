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
    private final int MAX;
    private int qtdeItens;

    public PilhaDinamica() {
        inicio = null;
        topo = null;
        MAX = -1;
    }
    
    public PilhaDinamica(int tamanhoMaximo) {
        inicio = null;
        topo = null;
        MAX = tamanhoMaximo;
    }

    public boolean estaVazia() {
        return (inicio == null);
    }
    
        public boolean estaCheia(){
        if(MAX < 0){
            return false;
        }
        return (qtdeItens == MAX);
    }

    public boolean empilhar(String dado) {
        if(estaCheia()){
            return false;
        }
        
        No novoNo = new No(dado);
        if (estaVazia()) {
            inicio = novoNo;
        } else {
            topo.setProximo(novoNo);
        }
        topo = novoNo;
        qtdeItens ++;
        return true;
    }

    public String desempilhar() {
        if (estaVazia()) {
            return "";
        }
        No aux = inicio;
        String dado = topo.getDado();
        qtdeItens --;
        
        if(inicio == topo){ // Só tem 1 No na Pilha
            inicio = null;
            topo = null;
            return dado;
        }    
        
        while (aux.getProximo() != topo) {
            aux = aux.getProximo(); // Move o auxi para o próximo No da lista  
        }
        aux.setProximo(null);
        topo = aux; // atualiza a referência do TOPO para o No anterior
        
        return dado;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Pilha Vazia");
            return;
        }
        No aux = inicio;

        do {
            System.out.println(aux.getDado());
            aux = aux.getProximo(); // move o No auxiliar para o próximo No da pilha
        } while (aux != null);

    }
    
    public void exibirRecursivo(){
        if(estaVazia()){
            System.out.println("Pilha vazia");
            return;
        }
        exibirRecursivo(inicio);
    }
    
    private void exibirRecursivo(No aux){
        if(aux == topo){
            System.out.println(aux.getDado());
            return;
        }
        exibirRecursivo(aux.getProximo());
        System.out.println(aux.getDado());
    }

}
