/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.lanche;

import itensDeVenda.lanche.Lanche;
import itensDeVenda.lanche.XCalabresa;

/**
 *
 * @author leona
 */
public class Calabresa extends DecoratorLanche {

    Lanche x;

    public Calabresa(Lanche x) {
        this.x = x;
    }

    @Override
    public String getNome() {
        if (x instanceof XCalabresa) {
            return (this.x.getNome() + ", com mais Calabresa");
        } else {
            return (this.x.getNome() + ", com Calabresa");
        }
    }

    @Override
    public float custo() {
        return (this.x.custo() + 1.5f);
    }
}
