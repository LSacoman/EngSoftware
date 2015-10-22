/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.bebida;

import itensDeVenda.bebida.Bebida;

/**
 *
 * @author leona
 */
public class Canela extends DecoradorBebida {

    Bebida b;

    public Canela(Bebida b) {
        this.b = b;
    }

    @Override
    public float custo() {
        return b.custo() + 0.25f;
    }

    @Override
    public String getNome() {
        return b.getNome() + " com Canela";
    }

}
