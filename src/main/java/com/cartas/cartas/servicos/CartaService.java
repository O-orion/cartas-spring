package com.cartas.cartas.servicos;

import java.util.ArrayList;
import java.util.List;

import com.cartas.cartas.models.CartaModel;

import org.springframework.stereotype.Service;

@Service //declarando service
public class CartaService {
    List<CartaModel> cartas = new ArrayList<CartaModel>();

    public CartaModel obterCarta(int indice){
        return cartas.get(indice);
    }

    public List<CartaModel> cartasList(){
        return cartas;
    }

    public CartaModel salvarCarta(CartaModel carta){
        int id = cartas.size() + 1;
        carta.setId(id);
        cartas.add(carta);
        

        return cartas.get(id-1);
    }

    public CartaModel atualizarCarta(int id,CartaModel carta){
        carta.setId(id);
        cartas.set(id-1,carta);
        return cartas.get(id-1);
    }

    public void excluirCarta(int id){
        cartas.remove(id-1);
    }
}