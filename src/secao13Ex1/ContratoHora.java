/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13Ex1;

import java.util.Date;

/**
 *
 * @author Edgar
 */
public class ContratoHora {
    private Date date;
    private double ValorPorHora;
    private Integer horas;

    public ContratoHora() {
    }
    
    public ContratoHora(Date date, double ValorPorHora, Integer horas) {
        this.date = date;
        this.ValorPorHora = ValorPorHora;
        this.horas = horas;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValorPorHora() {
        return ValorPorHora;
    }

    public void setValorPorHora(double ValorPorHora) {
        this.ValorPorHora = ValorPorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    
    public double totalHoraTrab(){
        return ValorPorHora * horas;
    }
}
