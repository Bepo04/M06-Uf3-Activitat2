package com.elhueso.PicaPolloTCG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing;

@EnableReactiveMongoAuditing 
@SpringBootApplication
public class PicaPolloTcgApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicaPolloTcgApplication.class, args);
	}

}
