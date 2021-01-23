/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13Ex3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Edgar
 */
public class Cliente {
    private String nomeCliente;
    private String email;
    private Date aniversario;
    
    private static final SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy");    

    public Cliente() {
    }

    public Cliente(String nomeCliente, String email, Date aniversario) {
        this.nomeCliente = nomeCliente;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }

    @Override
    public String toString() {
        return nomeCliente  + ", aniversario: [" + formatacao.format(aniversario) +"] - " + email ;
    }
    
    
}
