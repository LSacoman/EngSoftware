/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.bebida;

import itensDeVenda.bebida.Bebida;
import decorator.Decorador;

/**
 *
 * @author leona
 */
public abstract class DecoradorBebida extends Bebida implements Decorador {

    private Bebida b;

    @Override
    public abstract String getNome();
}
