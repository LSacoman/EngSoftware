/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorLanche;

import lanche.*;

/**
 *
 * @author leona
 */
public class Salada extends DecoratorLanche {

    Lanche x;

    public Salada(Lanche x) {
        this.x = x;
    }

    @Override
    public String getNome() {
        if (x instanceof XSalada) {
            return (this.x.getNome() + ", com mais Salada");
        } else {
            return (this.x.getNome() + ", com Salada");
        }
    }

    @Override
    public float custo() {
        return (this.x.custo() + 0.50f);
    }

}
