/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import itensDeVenda.ItensDeVenda;
import pagamento.*;
import pedido.*;

/**
 *
 * @author leona
 */
public class Fechado implements Status {

    Pedido p;
    Pagamento pgto;

    public Fechado(Pedido p) {
        this.p = p;
    }

    @Override
    public void addItem(ItensDeVenda i) {
        System.out.println("Seu pedido esta fechado. Item nao pode ser adicionado");
    }

    @Override
    public void fecharPedido() {
        System.out.println("Este pedido ja esta fechado. Voce nao pode fecha-lo");
    }

    @Override
    public void abrirPedido() {
        System.out.println("Ok. Vamos lá. Estamos reabrindo seu pedido");
        p.setEstado(new Aberto(p));
    }

    @Override
    public void Pagar(Pagamento pgto) {
        pgto.Pagar();
        p.pago();
    }
}
