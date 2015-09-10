/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import bebida.Bebida;
import bebida.Cafe;
import decorator.Canela;
import decorator.Chantilly;

/**
 *
 * @author leona
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bebida cafe = new Cafe();
        System.out.println("Dados Do Cafe");
        System.out.println("Nome: " + cafe.getNome());
        System.out.println("Custo: " + cafe.custo());

        System.out.println("Adicionando Um Condimento");
        cafe = new Chantilly(cafe);
        System.out.println("Novos Dados Do Cafe");
        System.out.println("Nome: " + cafe.getNome());
        System.out.println("Custo: " + cafe.custo());
        
        System.out.println("Adicionando Outro Condimento");
        cafe = new Canela(cafe);
        System.out.println("Novos Dados Do Cafe");
        System.out.println("Nome: " + cafe.getNome());
        System.out.println("Custo: " + cafe.custo());

    }

}
