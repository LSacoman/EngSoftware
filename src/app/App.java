/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Proxy.*;
import bebida.*;
import decorator.*;
import decoratorLanche.*;
import lanche.*;
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
        Pagamento pagamento = new CartaoDeCredito();

        FolderProxy fp = FolderProxy.getInstance();

        fp.setP(gerente);

        Bebida cafe = new Cafe();
        cafe = new Chantilly(cafe);

        Lanche xC = new XCalabresa();
        xC = new Calabresa(xC);

        fp.fazerPedido(xC);
        System.out.println("::NAO VAI FAZER PEDIDO::");

        fp.fecharPedido();
        System.out.println("::NAO VAI FECHAR::");

        fp.setP(garcom);
        fp.fazerPedido(xC);
        System.out.println("::Adicionou XCalabresa + calabresa::");
        System.out.println(" Custo: R$" + fp.calculaTotal());
        //Lanche xS = new XSalada();
        //fp.fazerPedido(xS);
        fp.fecharPedido();
        System.out.println("::NAO VAI FECHAR::");
        fp.fazerPedido(cafe);
        System.out.println("::Adicionou o Cafe::");
        System.out.println(" Custo: R$" + fp.calculaTotal());
        fp.fecharPedido();
        fp.abrirPedido();
        fp.fecharPedido();
        System.out.println("::FECHOU O PEDIDO::");
        fp.pagar(pagamento);
        System.out.println("PAGOU");
        fp.abrirPedido();
        fp.fazerPedido(cafe);
        System.out.println("::Adicionou o Cafe::");
        System.out.println(" Custo: R$" + fp.calculaTotal());
    }

}
