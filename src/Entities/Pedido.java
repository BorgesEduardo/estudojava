/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;

/**
 *
 * @author Eduardo
 */
public class Pedido {
    
    private int id;
    private Date moment;
    private Status statusPedido;
    
    public Pedido(){
        
        
    }
    
    public Pedido(Integer id, Date moment, Status statusPedido){
    
        this.id = id;
        this.moment = moment;
        this.statusPedido = statusPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Status getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(Status statusPedido) {
        this.statusPedido = statusPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", moment=" + moment + ", statusPedido=" + statusPedido + '}';
    }
    
    
    
    
}
