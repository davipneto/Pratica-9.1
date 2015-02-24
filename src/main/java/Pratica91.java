/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1608398
 */
public class Pratica91 {
    public static void main(String[] args){
        System.out.println("Nome do Sistema Operacional: "
            + System.getProperty("os.name"));
        System.out.println("Número de processadores: " 
            + Runtime.getRuntime().availableProcessors());
        System.out.println("Memória total: "
            + Runtime.getRuntime().totalMemory()/(1048576.0) + " MB");
        System.out.println("Memória livre: "
            + Runtime.getRuntime().freeMemory()/(1048576.0) + " MB");
        System.out.println("Máxma quantidade de memória usada: "
            + Runtime.getRuntime().maxMemory()/(1048576.0) + " MB");
    }
}
