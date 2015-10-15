/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import bebida.*;
import pedido.Item;

/**
 *
 * @author leona
 */
public class Chantilly extends DecoradorBebida {

    Item b;

    public Chantilly(Item b) {
        this.b = b;
    }

    @Override
    public float custo() {
        return b.custo() + 0.5f;
    }

    @Override
    public String getNome() {
        return b.getNome() + " com Chantilly";
    }
}
