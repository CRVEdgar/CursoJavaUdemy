/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13Ex3;

/**
 *
 * @author Edgar
 */
public class ClasseProduto {
    private String nomeProd;
    private Double precoProd;

    public ClasseProduto() {
    }

    public ClasseProduto(String nomeProd, Double precoProd) {
        this.nomeProd = nomeProd;
        this.precoProd = precoProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public double getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(double precoProd) {
        this.precoProd = precoProd;
    }
    
            
}
