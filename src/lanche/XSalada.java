/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanche;

/**
 *
 * @author leona
 */
public class XSalada extends Lanche{
    public XSalada(){
        this.setNome("Xsalada");
    }
    @Override
    public double custo() {
        return 6.00;
    }

    @Override
    public void adicionarCondimento() {
        System.out.println("Passando maionese ");
        System.out.println("Passando Ketchup ");
        System.out.println("Passando Mostarda ");
    }

    @Override
    public void adicionarRecheioPrincipal() {
        System.out.println("adicionando Tomate");
        System.out.println("adicionando Salada");
        System.out.println("adicionando Presunto e Queijo");
        System.out.println("adicionando Hamburguer");
    }
}
