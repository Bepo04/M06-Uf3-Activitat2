package com.elhueso.PicaPolloTCG.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elhueso.PicaPolloTCG.DTO.CardCreateDTO;
import com.elhueso.PicaPolloTCG.DTO.CardDTO;
import com.elhueso.PicaPolloTCG.Mappers.CardMapper;
import com.elhueso.PicaPolloTCG.Repositories.CardRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CardServiceImpl implements CardService {
    
    private CardRepo repo;
    private CardMapper mapper;

    @Autowired
    public CardServiceImpl(CardRepo repo, CardMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public Mono<CardDTO> save(CardCreateDTO dtoCard) {
        return repo.save(mapper.cardCreateDTOTOCard(dtoCard)).map(mapper::toDTO);
    }

    @Override
    public Mono<CardDTO> findById(String id) {
        return repo.findById(id).map(mapper::toDTO);
    }

    @Override
    public Flux<CardDTO> findAll() {
        return repo.findAll().map(mapper::toDTO);
    }

    @Override
    public Mono<CardDTO> update(CardDTO dtoCard) {
        return repo.findById(dtoCard.id()).map(mapper::toDTO);
    }

    @Override
    public Mono<Void> delete(String id) {
         return repo.findById(id).switchIfEmpty(Mono.error(new IllegalArgumentException("Card not found"))).flatMap(card -> repo.deleteById(id));
    }
}