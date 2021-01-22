/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13;

import java.text.SimpleDateFormat;
import java.util.Date;
import secao13.entitiesEnum.StatusPedido;

/**
 *
 * @author Edgar
 */
public class Pedidos {
    private Integer id;
    private Date moment;
    private StatusPedido status;
    SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Pedidos() {
    }

    public Pedidos(Integer id, Date moment, StatusPedido status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "id=" + id + ", moment= " + formatacao.format(moment) + ", status=" + status + '}';
    }
    
    
}
