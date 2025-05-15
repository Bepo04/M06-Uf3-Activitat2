package com.elhueso.PicaPolloTCG.Repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.stereotype.Repository;

import com.elhueso.PicaPolloTCG.Model.Card;

@Repository
@EnableReactiveMongoRepositories
public interface CardRepo extends ReactiveMongoRepository<Card, String>{
    
}
