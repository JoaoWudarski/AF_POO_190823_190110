package com.example.af.model;

import java.util.ArrayList;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

public class Cliente {
    
    private int codigo;

    @NotBlank(message = "Nome é obrigatorio!")
    @Length(min=4,max = 200, message = "Nome mínimo de 4 e o máximo de 200 caracteres!")
    private String nome;

    @NotBlank(message = "Endereço é obrigatorio!")
    @Length(min=4,max = 200, message = "Endereço mínimo de 4 e o máximo de 200 caracteres!")
    private String endereco;

    @NotBlank(message = "CPF é obrigatorio!")
    @CPF
    private String cpf;

    @JsonIgnore
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
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

    public boolean addReserva(Reserva reserva) {
        return reservas.add(reserva);
    }

    public boolean removeReserva(Reserva reserva) {
        return reservas.remove(reserva);
    }
    
}
