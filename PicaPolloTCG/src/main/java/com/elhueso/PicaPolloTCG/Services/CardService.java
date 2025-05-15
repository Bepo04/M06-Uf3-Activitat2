package com.elhueso.PicaPolloTCG.Services;

import com.elhueso.PicaPolloTCG.DTO.CardDTO;
import com.elhueso.PicaPolloTCG.Model.Card;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CardService {

    public Mono<Card> save(CardDTO dtoCard);
    public Mono<Card> findById(String id);
    public Flux<Card> findAll();
    public Mono<Card> update(CardDTO dtoCard);
    public Mono<Void> delete(String id);

}
