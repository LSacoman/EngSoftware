/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import bebida.*;
import decorator.*;
import decoratorLanche.*;
import lanche.*;
import pagamento.*;
import pedido.*;

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
        
        /*
        cafe = new Chantilly(cafe);
        Pagamento pagamento = new CartaoDeCredito();
        Pedido p = new Pedido();

        p.addItem(cafe);
        System.out.println("O valor total é: " + p.caculaTotal());

        System.out.println("fechando o pedido");
        p.fecharPedido();
        p.addItem(cafe);
        System.out.println("O valor total é: " + p.caculaTotal());

        System.out.println("abrindo o pedido");
        p.abrirPedido();
        p.addItem(cafe);
        System.out.println("O valor total é: " + p.caculaTotal());

        p.fecharPedido();
        p.pagar(pagamento);*/
        
        Lanche x = new XSalada();
        x.prepararLanche();
        System.out.println("Nome: " + x.getNome() + " Custo: R$" + x.custo());
        x = new Bacon(x);
        System.out.println("Nome: "+x.getNome()+" Custo: R$"+x.custo());
        System.out.println("------- Fechado!----------");
        Lanche s = new XCalabresa();
        s.prepararLanche();
        System.out.println("Nome: " + s.getNome() + " Custo: R$" + s.custo());
        s = new Calabresa(s);
        System.out.println("Nome: " + s.getNome() + " Custo: R$" + s.custo());
    }

}
