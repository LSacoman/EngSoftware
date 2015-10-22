/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import proxy.PedidoProxy;
import itensDeVenda.bebida.Cafe;
import itensDeVenda.bebida.Bebida;
import itensDeVenda.lanche.Lanche;
import itensDeVenda.lanche.XCalabresa;
import decorator.bebida.Chantilly;
import decorator.lanche.Calabresa;
import decorator.*;
import modelo.*;
import pagamento.*;
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
        Pessoa garcom = new Garcom("root", "123");
        Pessoa gerente = new Gerente("joao", "123");
        Pessoa cozinheiro = new Cozinheiro("jose", "12364567");
        Pagamento pagamento = new CartaoDeCredito();

        PedidoProxy pp = new PedidoProxy(garcom, cozinheiro);

        pp.setP(gerente);

        Bebida cafe = new Cafe();
        cafe = new Chantilly(cafe);

        Lanche xC = new XCalabresa();
        xC = new Calabresa(xC);

        pp.addItem(xC);
        System.out.println("::NAO VAI FAZER PEDIDO::");

        pp.fecharPedido();
        System.out.println("::NAO VAI FECHAR::");

        pp.setP(garcom);
        pp.addItem(xC);
        System.out.println("::Adicionou XCalabresa + calabresa::");
        System.out.println(" Custo: R$" + pp.calculaTotal());
        //Lanche xS = new XSalada();
        //fp.fazerPedido(xS);
        pp.fecharPedido();
        System.out.println("::NAO VAI FECHAR::");
        pp.addItem(cafe);
        System.out.println("::Adicionou o Cafe::");
        System.out.println(" Custo: R$" + pp.calculaTotal());
        pp.fecharPedido();
        pp.abrirPedido();
        pp.fecharPedido();
        System.out.println("::FECHOU O PEDIDO::");
        pp.pagar(pagamento);
        System.out.println("PAGOU");
        pp.abrirPedido();
        pp.addItem(cafe);
        System.out.println("::Adicionou o Cafe::");
        System.out.println(" Custo: R$" + pp.calculaTotal());
    }

}
