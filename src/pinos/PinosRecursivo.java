/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pinos;

/**
 *
 * @author felip
 */
public class PinosRecursivo {
public static void main (String[] args){
    int linhas = 4;
    int resposta = pinosRecursivo(linhas);
     System.out.println("Para "+ linhas + " linhas o total é: " + pinosRecursivo(linhas));
     
}

static int pinosRecursivo(int numeroLinhas){
    
    // caso base ou ponto de parada(o menor problema, que sei de bate pronto)
    if(numeroLinhas == 1){
        return 1;
    }
    // caso geral
    return numeroLinhas + pinosRecursivo(numeroLinhas -1);
    /*  Quando chamamos o método dentro dele mesmo,  é uma nova execução do método
        e não uma repetição do método. Tanto que, neste caso, o numeroLinhas irá mudar a cada execução 
    */
}   
}
