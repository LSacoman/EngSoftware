/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedido;

import bebida.*;
import pagamento.*;

/**
 *
 * @author leona
 */
public interface Status {

    public abstract void addItem(Bebida b);

    public abstract void fecharPedido();

    public abstract void abrirPedido();

    public abstract void Pagar(Pagamento p);
}
