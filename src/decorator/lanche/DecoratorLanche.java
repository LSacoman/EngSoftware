/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.lanche;

import decorator.Decorador;
import itensDeVenda.lanche.Lanche;

/**
 *
 * @author leona
 */
public abstract class DecoratorLanche extends Lanche implements Decorador {

    public abstract String getNome();
}
