/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import modelo.*;
import pagamento.Pagamento;
import itensDeVenda.ItensDeVenda;
import pedido.Pedido;

/**
 *
 * @author leona
 */
public class PedidoProxy implements IPedido{

    Pessoa p;
    Pedido pe;
    Pessoa garcom;
    Pessoa cozinheiro;

    private static PedidoProxy instance;

    public PedidoProxy(Pessoa garcom, Pessoa cozinheiro) {
        this.garcom = garcom;
        this.cozinheiro = cozinheiro;
        pe = new Pedido();
    }

  /*  public static FolderProxy getInstance() {
        if (instance == null) {
            instance = new FolderProxy();
        }
        return instance;
    }*/

    public void setP(Pessoa p) {
        this.p = p;
    }

    public void addItem(ItensDeVenda i) {
        if ((p instanceof Garcom)) {
            pe.addItem(i);
            pe.addObservador(cozinheiro);
            pe.addObservador(garcom);
            pe.notificarTodos();
        } else {
            System.out.println(":: Warning :: Acess Denied! ::");
        }
    }

    @Override
    public void fecharPedido() {
        pe.fecharPedido();
    }

    @Override
    public void pagar(Pagamento pgto) {
        pe.pagar(pgto);
    }

    @Override
    public void abrirPedido() {
        pe.abrirPedido();
    }

    @Override
    public float calculaTotal() {
        return pe.calculaTotal();
    }
    
}
