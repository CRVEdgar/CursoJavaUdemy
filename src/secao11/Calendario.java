/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao11;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Calendario {
    public static void main(String[] args) {
        /*
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(d));
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        System.out.println(sdf.format(d));
        */
        Scanner rcb = new Scanner(System.in);
        //String[] nome = new String[7];
        Calendar calendario = Calendar.getInstance();
        
        SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dataSitema = new Date();
        Date[] dataloop = new Date[15];
        
        System.out.println("FORMATACAO: " + formatacao.format(dataSitema));
        
        List<String> listaDatas = new ArrayList<>();
        List<Date> arraylistData = new ArrayList<>();
        
        for(int i=0; i<dataloop.length; i++ ){
            calendario.setTime(dataSitema);
            calendario.add(Calendar.DAY_OF_MONTH, i+1);
            
            //System.out.println("NOME: ");
           // nome[i] = rcb.nextLine();
            dataloop[i] = calendario.getTime();
            listaDatas.add(formatacao.format(calendario.getTime()));
            arraylistData.add(calendario.getTime());
        }
        
        for(int x=0; x<dataloop.length;x++){
            //System.out.println("NOME [" + (x+1) + "] :" + nome[x]);
            System.out.print("DATA ACRESCIDA : " + formatacao.format(dataloop[x]));
            System.out.print("  || LISTAS CONVERTIDA P/ STRING : " + listaDatas.get(x));
            System.out.println("  ||  FORMATACAO COM OBJ TIPO DATE: " + formatacao.format(arraylistData.get(x)));
        }
        
    }
}
