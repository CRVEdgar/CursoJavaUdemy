/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13Ex2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Edgar
 */
public class Post {
    
    private static SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    private Date data;
    private String titulo;
    private String conteudo;
    private Integer likes;

    List<Comentario> comentarios = new ArrayList<>();

     public Post() {
     }

     public Post(Date data, String titulo, String conteudo, Integer likes) {
         this.data = data;
         this.titulo = titulo;
         this.conteudo = conteudo;
         this.likes = likes;
     }

     public Date getData() {
         return data;
     }

     public void setData(Date data) {
         this.data = data;
     }

     public String getTitulo() {
         return titulo;
     }

     public void setTitulo(String titulo) {
         this.titulo = titulo;
     }

     public String getConteudo() {
         return conteudo;
     }

     public void setConteudo(String conteudo) {
         this.conteudo = conteudo;
     }

     public Integer getLikes() {
         return likes;
     }

     public void setLikes(Integer likes) {
         this.likes = likes;
     }

     public List<Comentario> getComentarios() {
         return comentarios;
     }

    public void addComentario(Comentario parComentario){
        comentarios.add(parComentario);
    }

     public void removeComentario(Comentario parComentario){
        comentarios.remove(parComentario);
    }

     @Override
     public String toString() {
         StringBuilder impresaoSb = new StringBuilder();
         impresaoSb.append(titulo + "\n");
         impresaoSb.append(likes + " Likes" + " - ");
         impresaoSb.append(formatacao.format(data) + "\n");
         impresaoSb.append(conteudo + "\n");
         impresaoSb.append("Comentarios: \n");
         for(Comentario c : comentarios){
             impresaoSb.append(c.getComentarios() + "\n");
         }
         return impresaoSb.toString();
     }
    
    
}
