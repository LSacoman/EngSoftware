/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedido;

import java.util.ArrayList;
import bebida.*;
import pagamento.*;
import state.*;

/**
 *
 * @author leona
 */
public class Pedido {

    private Status estado;
    ArrayList<Bebida> bebidas;

    public Pedido() {
        this.bebidas = new ArrayList();
        this.estado = new Aberto(this);
    }

    public void pagar(Pagamento p) {
        estado.Pagar(p);
    }

    public void fecharPedido() {
        //Pagamento p = new Dinheiro();

        estado.fecharPedido();
    }

    public void abrirPedido() {
        estado.abrirPedido();
    }

    public float caculaTotal() {
        float valorTotal = 0;
        for (Bebida bebida : bebidas) {
            valorTotal += bebida.custo();
        }
        return valorTotal;
    }

    public void addItem(Bebida b) {
        estado.addItem(b);
    }

    public Status getEstado() {
        return estado;
    }

    public void setEstado(Status estado) {
        this.estado = estado;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

}
