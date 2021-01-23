/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


                // CLASSE QUE MARCA A QUANTIDADE E PRECO DO ITEM PEDIDO
package secao13Ex3;

/**
 *
 * @author Edgar
 */
public class ClasseItemPedido { 
    
    private Integer quantidade;
    private Double preco;
    
    private ClasseProduto item;

    public ClasseItemPedido() {
    }

    public ClasseItemPedido(Integer quantidade, Double preco, ClasseProduto item) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.item = item;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public ClasseProduto getItem() {
        return item;
    }

    public void setItem(ClasseProduto item) {
        this.item = item;
    }
    
    public double subTotal(){
        return preco *quantidade;
    }

    @Override
    public String toString() {
        return item.getNomeProd() + ", " +
                "quantidade: " + quantidade + 
                ", preco= $" + String.format("%.2f", preco) + 
                ", Subtotal: $"+ String.format("%.2f", subTotal()) ;
    }
    
    
}
