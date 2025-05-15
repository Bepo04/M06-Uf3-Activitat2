package com.elhueso.PicaPolloTCG.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.elhueso.PicaPolloTCG.DTO.CardCreateDTO;
import com.elhueso.PicaPolloTCG.DTO.CardDTO;
import com.elhueso.PicaPolloTCG.Model.Card;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CardMapper {

    CardDTO toDTO(Card card);
    Card toEntity(CardDTO cardDTO);
    Card cardCreateDTOTOCard(CardCreateDTO cardCreateDTO);
}
