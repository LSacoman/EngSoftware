/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagamento;

/**
 *
 * @author leona
 */
public class CartaoDeCredito implements Pagamento {

    @Override
    public void Pàgar() {
        System.out.println("Inserindo o cartao...");
        System.out.println("Digitando o valor...");
        System.out.println("Digitando a senha...");
        System.out.println("Autorizando a transaçao...");
        System.out.println("pagamento confirmado!");
    }

}
