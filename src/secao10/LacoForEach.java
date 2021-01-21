/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao10;

/**
 *
 * @author Edgar
 */
public class LacoForEach {
    public static void main(String[] args) {
        int[] num = new int[15];
        int[] numero2 = new int[15];
        
        /*for(int i=0;i<15;i++){
            num[i] = i+2;
        }*/
        int k=0;
        for(int numadd: num){
            num[k] = k;
            System.out.println("NUM[K]: "+num[k]);
            System.out.println("NUMADD: "+numadd);
            System.out.println("K: "+k);
            k++;
            
        }
        
        
        for(int numImpre: num){
            System.out.println("VALOR DE NUM[K]: " +numImpre);
        }
        
        int x=0;
        for(int numerolaco: num){
            numero2[x] = numerolaco*2;
            System.out.println("indice: "+numerolaco);
            x++;
        }
        
        for(int num2Impre: numero2){
            System.out.println("VALOR DO NUMERO MULT 2: " +num2Impre);
        }
        
        //System.out.println("VALOR UNITARIO ");
    }
}
