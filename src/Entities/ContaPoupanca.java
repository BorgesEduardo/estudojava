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
public class ContaPoupanca extends Conta {
    
    private Double taxaJuros;

    public ContaPoupanca() {
    
        super();
    }

    public ContaPoupanca(Double taxaJuros, Integer numero, String titular, Double saldo) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
    public void updateSaldo(){
        
        saldo += (saldo * taxaJuros);
    }
    
    
    //Override indica que é uma sobreposição de metodo(este metodo vai substituir)
    @Override
    public void saque(double valor){
        
        this.saldo -= valor;
    }
    
    
}
