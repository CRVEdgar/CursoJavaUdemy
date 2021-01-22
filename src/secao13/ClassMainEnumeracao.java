/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13;


import java.util.Date;
import secao13.entitiesEnum.StatusPedido;

/**
 *
 * @author Edgar
 */
public class ClassMainEnumeracao {
    
    public static void main(String[] args) {
        
        Pedidos order = new Pedidos(0001, new Date(), StatusPedido.ENTREGUE);
        
        System.out.println("PEDIDO: " + order);
        
        StatusPedido ped1 = StatusPedido.AGUARDANDO_PAGAMENTO;
        StatusPedido ped2 = StatusPedido.valueOf("PROCESSADO");
        String stringPedido = ("ENVIADO");
        StatusPedido ped3 = StatusPedido.valueOf(stringPedido);
        
        
        System.out.println("PEDIDO 1 "+ped1+" || PEDIDO 2: "+ped2+" || PEDIDO 3: "+ped3);
        
    }
}
