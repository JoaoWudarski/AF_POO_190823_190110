package com.example.af.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.joda.time.DateTime;

public class Reserva {
    private int codigo;
    private double preco;
    private Cliente cliente;
    private Veiculo veiculo;

    @JsonFormat( pattern = "dd/MM/yyyy")
    private DateTime dataInicio;
    @JsonFormat( pattern = "dd/MM/yyyy")
    private DateTime dataFim;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public DateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(DateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public DateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(DateTime dataFim) {
        this.dataFim = dataFim;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    
    public Reserva(DateTime dataInicio, DateTime dataFim, Cliente cliente, Veiculo veiculo){
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.preco = calcularPreco();
    }
    
    public double calcularPreco(){
        long temp = dataFim.getMillis() - dataInicio.getMillis();
        
        double preco = temp/86400000;
        preco *= getVeiculo().getDiaria();
        
        return preco; 
    }

    public Reserva(){}

    


}
