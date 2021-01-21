/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Edgar
 */
public class Listas {
    public static void main(String[] args) {
        
        Scanner rcb = new Scanner(System.in);
        String nome;
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");
        
        List<String> lista = new ArrayList<>();
        for(String insere : list){
            System.out.println("NOME A INSERIR: ");
            nome = rcb.nextLine();
            lista.add(nome);
        }
        
        System.out.println(list.size()); // TAMANHO DA LISTA
        int b=0;
        for (String x : list) {
            System.out.println("LIST: "+x);
            System.out.println("LISTA: "+lista.get(b)); //imprime confirme o indice passado no parametro
            b++;
        }
        
        
        System.out.println("---------------------");
        list.removeIf(x -> x.charAt(0) == 'M'); //remove o item que tem como indice 0 a letra M (remove a palavra que tem primeira letra M)
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); //imprime o indice da palavar
        System.out.println("Index of Marco: " + list.indexOf("Marco")); //imprime o indice da palavar // se nao houver, imprime -1
        System.out.println("---------------------");
        
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // filtra e insere na lista result os itens que comecam com letra A
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); //encontra o primeiro elemento cujo nome come;a com J // retorna NULL se nao satisifizer a condi;'ao
        System.out.println(name);
        
    }
}
