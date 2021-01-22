/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13Ex1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Edgar
 */
//import secao13Ex1.NivelExperiencia;

public class Funcionario {
    private String name;
    private double salarioBase;
    private NivelExperiencia nivel;
    
    private Departamento departamento;
    private List<ContratoHora> contrato = new ArrayList<>();

    public Funcionario() {
    }

    public Funcionario(String name, double salarioBase, NivelExperiencia nivel, Departamento departamento) {
        this.name = name;
        this.salarioBase = salarioBase;
        this.nivel = nivel;
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public NivelExperiencia getNivel() {
        return nivel;
    }

    public void setNivel(NivelExperiencia nivel) {
        this.nivel = nivel;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContrato() {
        return contrato;
    }
    
    public void addContrato(ContratoHora condicoes){
        contrato.add(condicoes);
    }
    
    public void removeContrato(ContratoHora condicoesRemove){
        contrato.remove(condicoesRemove);
    }
    
    public double salarioMes(int ano, int mes){
        double soma = salarioBase;
        Calendar calendario = Calendar.getInstance();
        
        for(ContratoHora c: contrato){
            calendario.setTime(c.getDate()); //capturando e adicionando a data ao calendario
            int c_mes = 1 + calendario.get(Calendar.MONTH); //capturando o ano do calendario tem que add 1 porque o mes comeca com zero 0
            int c_ano = calendario.get(Calendar.YEAR); //capturando o mes do calendario
            System.out.println("ANO: " + ano +" || MES: " + mes + " || C_MES: " + c_mes+ " || C_ANO: " + c_ano);
            if(ano == c_ano && mes == c_mes ) {
                soma += c.totalHoraTrab();
            }      
        }
        return soma;
    }
}
