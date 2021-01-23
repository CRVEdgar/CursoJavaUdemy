/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13Ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Edgar
 */
public class ClassMain {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Post p1 = new Post(formatacao.parse("21/06/2018 13:05:44"), 
                "Vijando para Sao Luis-MA", 
                "Eu estarei sempre na minha cidade", 
                12);
        
        p1.addComentario(new Comentario("Boa viagem"));
        p1.addComentario(new Comentario("Seja bem vindo, mas ja é de casa"));
        
        Post p2 = new Post(formatacao.parse("28/07/2018 23:14:19"), 
                "Ola, bom dia", 
                "Um novo dia na minha cidade", 
                5);
        
        p2.addComentario(new Comentario("bom dia"));
        p2.addComentario(new Comentario("que bom ter voce por aqui"));
        
        System.out.println(p1);
    }
}
