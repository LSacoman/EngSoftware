/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import bebida.*;
import pagamento.*;
import pedido.*;

/**
 *
 * @author leona
 */
public class Aberto implements Status {

    Pedido p;

    public Aberto() {
    }

    public Aberto(Pedido p) {
        this.p = p;
    }

    @Override
    public void addItem(Bebida b) {
        System.out.println("Adicionando ao seu pedido " + b.getNome());
        p.getBebidas().add(b);
    }

    @Override
    public void fecharPedido() {
        System.out.println("ok, vamos lá. Fecharemos o seu pedido.");
        p.setEstado(new Fechado(p));
    }

    @Override
    public void abrirPedido() {
        System.out.println("Seu pedido já esta aberto. Não pode ser reaberto");
    }

    @Override
    public void Pagar(Pagamento p) {
        System.out.println("Seu pedido esta aberto."
                + " Nao é possivel fazer o pagamento");
    }

}
