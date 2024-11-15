package org.bcnc.rest;

import org.bcnc.application.mapper.PriceMapperIn;
import org.bcnc.application.mapper.PriceMapperOut;
import org.bcnc.domain.entities.Price;
import org.mapstruct.Mapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Mapper
@Component
public class PriceMapperRest implements PriceMapperOut<ResponseEntity<PriceRest>> {

    @Override
    public ResponseEntity<PriceRest> map(Price price) {
        return null;
    }
}
