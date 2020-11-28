package com.example.af.dto;


import java.util.Optional;

import com.example.af.model.Cliente;
import com.example.af.model.Reserva;
import com.example.af.model.Veiculo;
import com.fasterxml.jackson.annotation.JsonFormat;

import org.joda.time.DateTime;


public class ReservaDTO {
    @JsonFormat( pattern = "dd/MM/yyyy")
    private DateTime dataInicio;
    @JsonFormat( pattern = "dd/MM/yyyy")
    private DateTime dataFim;
    private Cliente cliente;
    private Veiculo veiculo;

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

    public Optional<Reserva> criarReserva(){
        if(dataFim. (dataInicio) ) {
            return Optional.empty();
        }
        Reserva reserva = new Reserva(dataInicio, dataFim, cliente, veiculo);
        return Optional.of(reserva);
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
}       
        
   
        
   
        
   
        
   
        
   
        
