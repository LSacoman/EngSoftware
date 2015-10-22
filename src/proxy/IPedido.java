/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import itensDeVenda.ItensDeVenda;
import pagamento.Pagamento;
import pedido.*;

/**
 *
 * @author leona
 */
public interface IPedido {
    public abstract void addItem(ItensDeVenda i);
    public abstract void fecharPedido();
    public abstract void pagar(Pagamento pgto);
    public abstract void abrirPedido();
    public abstract float calculaTotal();
}
