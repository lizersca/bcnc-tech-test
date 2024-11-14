package org.bcnc.rest;

import org.bcnc.application.mapper.PriceMapper;
import org.bcnc.domain.entities.Price;
import org.mapstruct.Mapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Mapper
@Component
public class PriceMapperRest implements PriceMapper<ResponseEntity<PriceRest>> {

    @Override
    public ResponseEntity<PriceRest> mapToAdapter(Price price) {
        return null;
    }
}
