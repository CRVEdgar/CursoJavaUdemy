/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13Ex1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class ClassMain {
    public static void main(String[] args) throws ParseException {
        Scanner rcb = new Scanner(System.in);
        SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Qual o nome do departamento? ");
        String dpto = rcb.nextLine();
        System.out.println("Qual o nome do funcionario? ");
        String nome = rcb.nextLine();
        System.out.println("Qual o nivel do funcionario? ");
        String nivel = rcb.nextLine();
        System.out.println("Qual o salario base? ");
        double soldo = rcb.nextDouble();
        
        
        Funcionario func = new Funcionario(nome, soldo, NivelExperiencia.valueOf(nivel), new Departamento(dpto));
        
        System.out.println("Quantos contratos o funcionario tem? ");
        int qtdContra = rcb.nextInt();
        rcb.nextLine();
        
        for(int i=0; i<qtdContra; i++){
            System.out.println("Entre com o dados do contrato nº"+i);
            System.out.println("Data: (dd/MM/YYYY)");
            Date dataContrato = formatacao.parse(rcb.next());
            System.out.println("Qual o valor por hora? ");
            double RsHora = rcb.nextDouble();
            System.out.println("Tempo de trabalho: ");
            int hora = rcb.nextInt();
            ContratoHora contrato = new ContratoHora(dataContrato, RsHora, hora);
            func.addContrato(contrato);
        }
        
        rcb.nextLine();
        System.out.println("Informe a data que deseja realizar a busca: (MM/yyyy)");
        String mesAno = rcb.nextLine();
        int mes = Integer.parseInt(mesAno.substring(0 , 2));
        int ano = Integer.parseInt(mesAno.substring(3));
        
        System.out.println("Nome do funcionario: " + func.getName() +" || departamento: " + func.getDepartamento().getName());
        System.out.println("Salario recebido no periodo solicitado:" + String.format("%2.f", func.salarioMes(ano, mes)));
    }
}
