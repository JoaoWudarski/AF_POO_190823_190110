package com.example.af.repository;

import java.util.List;
import java.util.Optional;

import com.example.af.model.Veiculo;

import org.springframework.stereotype.Component;

@Component
public class VeiculoRepository {

    private List<Veiculo> veiculos;
    private int nextcode = 0;

    public List<Veiculo> getAllVeiculos() {
        return veiculos;
    }

    public Optional<Veiculo> getVeiculoByCodigo(int codigo){
        for(Veiculo aux : veiculos){
            if(aux.getCodigo() == codigo){
                return Optional.of(aux);
            }
        }
        return Optional.empty();
    }

    public Veiculo save (Veiculo veiculo){
        veiculo.setCodigo(nextcode++);
        veiculos.add(veiculo);
        return veiculo;
    }

    public void remove(Veiculo veiculo) {
        veiculos.remove(veiculo);
    }

    public Veiculo update (Veiculo veiculo){

        Veiculo aux = getVeiculoByCodigo(veiculo.getCodigo()).get();

        if(aux != null){
            aux.setDiaria(veiculo.getDiaria());
        }

        return aux;
}
}
