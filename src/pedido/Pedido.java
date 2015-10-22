/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedido;

import itensDeVenda.bebida.Bebida;
import itensDeVenda.ItensDeVenda;
import java.util.ArrayList;
import itensDeVenda.lanche.Lanche;
import modelo.Pessoa;
import observer.Observer;
import observer.Subject;
import pagamento.*;
import proxy.IPedido;
import state.*;

/**
 *
 * @author leona
 */
public class Pedido implements Subject, IPedido{

    private Status estado;
    ArrayList<ItensDeVenda> item;
    private ArrayList<Observer> observadores;

    public Pedido() {
        this.item = new ArrayList<>();
        this.observadores = new ArrayList<>();
        this.estado = new Aberto(this);
    }

    public void pagar(Pagamento p) {
        estado.Pagar(p);
    }

    public void pago() {
        item.clear();
    }

    public void fecharPedido() {
        estado.fecharPedido();
    }

    public void abrirPedido() {
        estado.abrirPedido();
    }

    public boolean verificaPedido() {
        boolean l = false;
        boolean b = false;
        boolean t = false;
        for (ItensDeVenda item1 : item) {
            if (item1 instanceof Bebida) {
                b = true;
            }
            if (item1 instanceof Lanche) {
                l = true;
            }
            if (((l == true) && (b == true))) {
                t = true;
            }
        }
        return t;
    }

    public float calculaTotal() {
        float valorTotal = 0;
        for (ItensDeVenda item1 : item) {
            valorTotal += item1.custo();
        }
        return valorTotal;
    }

    public void addItem(ItensDeVenda i) {
        estado.addItem(i);
    }

    public Status getEstado() {
        return estado;
    }

    public void setEstado(Status estado) {
        this.estado = estado;
    }

    public ArrayList<ItensDeVenda> getItem() {
        return item;
    }

    public void setItem(ArrayList<ItensDeVenda> item) {
        this.item = item;
    }

    @Override
    public void addObservador(Pessoa p) {
        observadores.add(p);
    }

    @Override
    public void removeObservador(Pessoa p) {
        observadores.remove(p);
    }

    @Override
    public void notificarTodos() {
        for (Observer observador : observadores) {
            observador.notificar();
        }
    }

}
