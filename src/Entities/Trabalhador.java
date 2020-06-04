/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class Trabalhador {
    
    private String nome;
    private NivelTrab nivel;
    private Double salarioBase;
    
    private Departamento departamento;
    private List <ContratoHora> contratos = new ArrayList<>();
    
    public Trabalhador(){
        
    }

    public Trabalhador(String nome, NivelTrab nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrab getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrab nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }

    
    public void addContrato(ContratoHora contrato){
        
        contratos.add(contrato);
    }
    
    public void removeContrato(ContratoHora contrato){
        
        contratos.remove(contrato);
    }
    
    public Double income(int ano, int mes){
        
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
        
        for (ContratoHora c : contratos){
            
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            
            if(ano == c_ano && mes == c_mes){
                soma += c.valorTotal();
            }
            
        }
        return soma;
    }
    
    
}
