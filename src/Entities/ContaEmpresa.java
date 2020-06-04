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
public class ContaEmpresa extends Conta {
    
    private Double limite;

    public ContaEmpresa() {
    
        super();
    }

    public ContaEmpresa(Double limite, Integer numero, String titular, Double saldo) {
        super(numero, titular, saldo);
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
    
    public void emprestimo(double valor){
        if(valor <= limite ){
           saldo +=  valor - 10.0;
        }
        
    }
    
    //Override indica que é uma sobreposição de metodo(este metodo vai substituir)
    //A palavra super indica que está usando o metodo da super classe.
    @Override
    public void saque(double valor){
        super.saque(valor);
        this.saldo -= 2.00;
    }
    
    
    
}

