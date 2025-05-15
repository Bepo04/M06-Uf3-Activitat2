package com.elhueso.PicaPolloTCG.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elhueso.PicaPolloTCG.DTO.CardCreateDTO;
import com.elhueso.PicaPolloTCG.DTO.CardDTO;
import com.elhueso.PicaPolloTCG.Services.CardService;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
public class RESTController {

    private CardService cardService;

    @Autowired
    public RESTController(CardService cardService){
        this.cardService = cardService;
    }

    @GetMapping(value = "/products")
    public ResponseEntity<Flux<CardDTO>> getAllCards(){
        return ResponseEntity.ok(cardService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Mono<CardDTO>> findById(@PathVariable String id) {
        Mono<CardDTO> cardDTO = cardService.findById(id);
        if (cardDTO == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(cardDTO);
    }

    @GetMapping("/products/search")
    public Flux<CardDTO> searchByName(@RequestParam String name) {
        return cardService.findByNameLike(name);
    }

    @PostMapping(value = "/products")
    public ResponseEntity<Mono<CardDTO>> saveCard(@RequestBody CardCreateDTO cardCreateDTO){
        Mono<CardDTO> saved = cardService.save(cardCreateDTO);
        return ResponseEntity.ok(saved); 
    }

    @PatchMapping(value = "/products")
    public ResponseEntity<Mono<CardDTO>> updateCard(@RequestBody CardDTO cardDTO) {
        Mono<CardDTO> updated = cardService.update(cardDTO);
        return ResponseEntity.ok(updated);
    }
    
    

    @DeleteMapping(value = "/products")
    public ResponseEntity<Mono<String>> deleteCard(@PathVariable String id){
        cardService.delete(id);
        return ResponseEntity.ok(Mono.just("La carta ha sigut borrada."));
    }
}
