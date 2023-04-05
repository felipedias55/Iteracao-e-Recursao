/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04.pilha02;

/**
 *
 * @author felip
 */
public class No {

    private String dado;
    private No proximo;

    public No(String dado) {
        this.dado = dado;
    }

    public String getDado() {
        return dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
