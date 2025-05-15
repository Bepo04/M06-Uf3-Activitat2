package com.elhueso.PicaPolloTCG.Mappers;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.stereotype.Repository;

import com.elhueso.PicaPolloTCG.Model.Card;

@Repository
@EnableReactiveMongoRepositories
public interface XXXXXRepo extends ReactiveMongoRepository<Card, String> {

    
}
