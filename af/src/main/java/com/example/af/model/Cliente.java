package com.example.af.model;

import java.util.ArrayList;

import javax.validation.constraints.Size;

public class Cliente {
    
    private int codigo;

    private String nome;
    @Size(min = 4, max = 200, message = "Endereço do cliente deve ter entre 4 e 200 caracteres")
    private String endereco;
    
    private int cpf;

    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente [codigo=" + codigo +", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco +  "]";
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    
}
