/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13Ex3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class ClasseMain {
    public static void main(String[] args) throws ParseException {
        Scanner rcb = new Scanner(System.in);
        
        
        SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Nome do Cliente: ");
        String nomCli = rcb.nextLine();
        System.out.println("Email: ");
        String email = rcb.nextLine();
        System.out.println("Data de aniversario: (dd/MM/yyyy)");
        String dataAniv = rcb.nextLine();
        
        Cliente cliente = new Cliente(nomCli, email, formatacao.parse(dataAniv));
        
        System.out.println("status: ");
        StatusPedido status = StatusPedido.valueOf(rcb.next());  rcb.nextLine();
        
        System.out.println("Quantos itens estao no pedido? ");
        int tPed = rcb.nextInt(); rcb.nextLine();
        
        
        ClassePedido pedido = new ClassePedido(new Date(), status, cliente);
        
        for(int i=0; i<tPed ; i++){
            System.out.println("Nome do Produto: ");
            String nomProd = rcb.nextLine();
            System.out.println("PReco do Produto: ");
            Double precProd = rcb.nextDouble(); rcb.nextLine();
            System.out.println("Quantidade desse produto: ");
            Integer qtdProd = rcb.nextInt(); rcb.nextLine();
            
            ClasseProduto produto = new ClasseProduto(nomProd, precProd);
            ClasseItemPedido itemPedido = new ClasseItemPedido(qtdProd, precProd, produto);
            
            pedido.addItem(itemPedido);
        }
        System.out.println();
        System.out.println("Pedidos: ");
        System.out.println(pedido);
        
    }
}
