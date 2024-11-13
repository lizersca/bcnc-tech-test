package org.bcnc.rest;

import org.bcnc.application.mapper.PricesMapper;
import org.bcnc.domain.entities.Price;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class PricesMapperRest implements PricesMapper<ResponseEntity<PriceRest>> {

    @Override
    public ResponseEntity<PriceRest> mapToAdapter(Price price) {
        return null;
    }
}
