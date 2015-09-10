/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import bebida.Bebida;

/**
 *
 * @author leona
 */
public abstract class Decoradores extends Bebida {

    private Bebida b;

    @Override
    public abstract String getNome();
}
