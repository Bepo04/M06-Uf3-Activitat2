package com.elhueso.PicaPolloTCG.Services;


import com.elhueso.PicaPolloTCG.DTO.CardCreateDTO;
import com.elhueso.PicaPolloTCG.DTO.CardDTO;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CardService {

    public Mono<CardDTO> save(CardCreateDTO cardCreateDTO);
    public Mono<CardDTO> findById(String id);
    public Flux<CardDTO> findAll();
    public Mono<CardDTO> update(CardDTO dtoCard);
    public Mono<Void> delete(String id);
    
    Flux<CardDTO> findByNameLike(String name);

}
