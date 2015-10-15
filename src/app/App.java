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
        Pedido p = new Pedido();
        Pagamento pagamento = new CartaoDeCredito();
        Item cafe = new Cafe();
        cafe = new Chantilly(cafe);
        p.addItem(cafe);
        /*Lanche xS = new XSalada();
         p.addItem(xS);*/
        System.out.println("O valor total é: " + p.caculaTotal());
        p.fecharPedido();
        p.pagar(pagamento);

        System.out.println("\n\n\n");

        Lanche xC = new XCalabresa();
        xC = new Calabresa(xC);
        p.addItem(xC);
        System.out.println(" Custo: R$" + p.caculaTotal());
        p.fecharPedido();
        p.pagar(pagamento);
    }

}
