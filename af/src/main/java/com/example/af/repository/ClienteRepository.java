package com.example.af.repository;

import java.util.List;
import java.util.Optional;

import com.example.af.model.Cliente;

import org.springframework.stereotype.Component;

@Component
public class ClienteRepository {
    
    private  List<Cliente> clientes;
    private int nextcode;

    public List<Cliente> getAllClientes(){
        return clientes;
    }    

    public Optional<Cliente> getClienteByCodigo(int codigo){
        for( Cliente aux : clientes){
            if(aux.getCodigo() == codigo){
                return Optional.of(aux);
            }
        }
        return Optional.empty();
    }

    public Cliente save (Cliente cliente){
        cliente.setCodigo(nextcode ++);
        clientes.add(cliente);
        return cliente;
    }

    public void remove(Cliente cliente){
        clientes.remove(cliente);
    }

    public Cliente update (Cliente cliente) {
        
        Cliente aux = getClienteByCodigo(cliente.getCodigo()).get();

        if(aux != null){
            aux.setNome(cliente.getEndereco());
            aux.setNome(cliente.getNome());
        }

        return aux;
    }
}
