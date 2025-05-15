package com.elhueso.PicaPolloTCG.Repositories;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.stereotype.Repository;

import com.elhueso.PicaPolloTCG.Model.Card;

import reactor.core.publisher.Flux;

@Repository
@EnableReactiveMongoRepositories
public interface CardRepo extends ReactiveMongoRepository<Card, String>{
    @Query("{ 'nom': { $regex: ?0, $options: 'i' } }")
    Flux<Card> findByName(String name);
}
