/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13Ex3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Edgar
 */
public class ClassePedido {
    Date data;
    StatusPedido status;
    private static final SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
    
    private Cliente cliente;
    
    List<ClasseItemPedido> listaPedidos = new ArrayList<>();

    public ClassePedido() {
    }

    public ClassePedido(Date data, StatusPedido status, Cliente cliente) {
        this.data = data;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ClasseItemPedido> getListaPedidos() {
        return listaPedidos;
    }
    
    public void addItem(ClasseItemPedido item){
        listaPedidos.add(item);
    }
    
    public void removeItem(ClasseItemPedido item){
        listaPedidos.remove(item);
    }
    
    public double totalGeral(){
        double valTotal=0;
        for(ClasseItemPedido c : listaPedidos){
            valTotal += c.subTotal();
        }
        return valTotal;
    }

    @Override
    public String toString() {
        StringBuilder impresaoSb = new StringBuilder();
        impresaoSb.append("momento da Compra: ");
        impresaoSb.append(formatacao.format(getData()) + "\n");
        impresaoSb.append("Status do pedido: " + status +"\n");
        impresaoSb.append(cliente + "\n");
        //impresaoSb.append("Cliente: " + cliente.getNomeCliente() + " " + formatacao.format(cliente.getAniversario()) + " - " + cliente.getEmail());
        for(ClasseItemPedido c : listaPedidos){
            impresaoSb.append(c +"\n");
        }
        impresaoSb.append("Preco total: $");
        impresaoSb.append(String.format("%.2f", totalGeral()));
        return impresaoSb.toString();
    }
    
    
}
