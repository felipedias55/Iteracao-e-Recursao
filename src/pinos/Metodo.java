/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pinos;

/**
 *
 * @author felip
 */
public class Metodo {
public static void main(String [] args){
    
    metodo1();
    System.out.println("Final do programa");
    
}
    
public static void metodo1(){
    System.out.println("Inicio do metodo 1");
    metodo2();
    System.out.println("Iinal do metodo 1");
}

public static void metodo2(){
    System.out.println("metodo 2");
    metodo3();
    System.out.println("Final do metodo 2");
}

public static void metodo3(){
    System.out.println("metodo 3");
    System.out.println("Final do metodo 3");
}

}
