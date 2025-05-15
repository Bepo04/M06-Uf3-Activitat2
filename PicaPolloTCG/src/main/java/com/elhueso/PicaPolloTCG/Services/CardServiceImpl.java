package com.elhueso.PicaPolloTCG.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elhueso.PicaPolloTCG.DTO.CardDTO;
import com.elhueso.PicaPolloTCG.Mappers.CardMapper;
import com.elhueso.PicaPolloTCG.Model.Card;
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
    public Mono<Card> save(CardDTO dtoCard) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Mono<Card> findById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Flux<Card> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Mono<Card> update(CardDTO dtoCard) {
        return repo.findById(dtoCard.id()).map(std -> mapper.)
    }

    @Override
    public Mono<Void> delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    
}