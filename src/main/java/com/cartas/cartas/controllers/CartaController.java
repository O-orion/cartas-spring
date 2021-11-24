package com.cartas.cartas.controllers;
import java.util.List;

//import do modelo
import com.cartas.cartas.models.CartaModel;
import com.cartas.cartas.servicos.CartaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//imports do spring
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "carta")
public class CartaController {

    @Autowired
    public CartaService cartaService;
    
    @GetMapping
    public ResponseEntity<List<CartaModel>> carta(){
         //CartaModel carta = new CartaModel("Lucas","Jesus","Eu te amo Jesus Cristo"); //ok 200
        return ResponseEntity.status(HttpStatus.OK).body(cartaService.cartasList());
    }

    @PostMapping
    public ResponseEntity<CartaModel> novaCarta(@RequestBody CartaModel carta){
        CartaModel cartaNova = cartaService.salvarCarta(carta);
        return ResponseEntity.status(HttpStatus.CREATED).body(cartaNova);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CartaModel> alteraCarta(@RequestBody CartaModel carta,@PathVariable("id") int id){
        return ResponseEntity.ok(cartaService.atualizarCarta(id, carta));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerCarta(@PathVariable("id") int id){
        cartaService.excluirCarta(id);
        return ResponseEntity.noContent().build();
    }
}
