/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class EntradaDeDados {
    public static void main(String[] args) {
        
        String a;
        int y, b;
        double z, c;

        Scanner rcb = new Scanner(System.in);
        
        Locale.setDefault(Locale.US); // usado somente em caso de pontos 
        /*System.out.println("DIGITE: ");
        a = rcb.next(); // defire do nextLine porque o nextline captura o elemento ate da proxima quebra de linha(le a linha inteira) , enquanto o next captura ate o espaco (le so uma palavra)
        y = rcb.nextInt();
        z = rcb.nextDouble();
        
        b = y*5;
        c = z/2;
        System.out.println("DADOS DIGITADOS: ");
        System.out.println(a);
        System.out.println(y);
        System.out.println(z);
        System.out.println(b);
        System.out.println(c);*/
        String original = "abcde FGHIJ ABC abc DEFG ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc"); // captura o primeiro indice da string indicada
        int j = original.lastIndexOf("bc"); // captura o ultimo indice da string indicada
        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);
    } 
    
}
