/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itensDeVenda.lanche;

import itensDeVenda.ItensDeVenda;

/**
 *
 * @author leona
 */
public abstract class Lanche extends ItensDeVenda {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract float custo();

    public void cortaPao() {

    }

    public void adicionarCondimento() {
    }

    public void adicionarRecheioPrincipal() {
    }

    public void prensar() {

    }

    public void servir() {

    }

    public final void prepararLanche() {
        this.cortaPao();
        this.adicionarCondimento();
        this.adicionarRecheioPrincipal();
        this.prensar();
        this.servir();
    }
}
