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
public class Bacon extends DecoratorLanche {

    Lanche x;

    public Bacon(Lanche x) {
        this.x = x;
    }

    @Override
    public float custo() {
        return (x.custo() + 1.5f);
    }

    @Override
    public String getNome() {
        if (x instanceof XBacon) {
            return (this.x.getNome() + ", com mais Bacon");
        } else {
            return (this.x.getNome() + ", com Bacon");
        }
    }
}
