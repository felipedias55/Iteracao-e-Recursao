/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pinosIterativo;

/**
 *
 * @author felip
 */
public class PinosIterativo {
public static void  main(String[] args){
    
    int linhas =4;
    System.out.println("Para "+ linhas + " linhas o total é: " + pinositerativo(linhas));

}  
    
static int pinositerativo(int numeroLinhas){
    int totalPinos = 0;
    
    for(int linha =1; linha <= numeroLinhas; linha++){
        totalPinos += linha;
    }
    
    return totalPinos;
}
}
