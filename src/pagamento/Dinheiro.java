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
public class Dinheiro implements Pagamento {

    @Override
    public void Pàgar() {
        System.out.println("Recebendo o dinheiro...");
        System.out.println("Contando as cedulas...");
        System.out.println("Confirmando o pagamento!");
    }

}
