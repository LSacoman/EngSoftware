/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itensDeVenda.bebida;

import itensDeVenda.ItensDeVenda;

/**
 *
 * @author leona
 */
public abstract class Bebida extends ItensDeVenda{

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract float custo();
}
