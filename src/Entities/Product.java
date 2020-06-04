/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Eduardo
 */
public class Product {
    
    public String nome;
    public Double preco;
    public Integer quant;
    
    /*Construtor*/
    
    public Product(String nome, Double preco, Integer quant) {
        
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }
    
    public double total(){
        
        return (preco * quant);
    }
    
    public void adProduto(Integer quant ){
        
        this.quant = this.quant + quant;
    }
    
    public void removeProduto(Integer quant ){
        
        this.quant = this.quant - quant;
    }
    
    public String toString( ){
        
        return nome
                + " , $ "
                + preco
                + ", "
                + quant
                + " unidades, total: $ "
                + total();
    }
    
}
