package org.bcnc.h2;

import org.bcnc.application.mapper.PricesMapper;
import org.bcnc.domain.entities.Price;
import org.springframework.stereotype.Component;

@Component
class PricesMapperH2 implements PricesMapper<PriceH2> {

    @Override
    public PriceH2 mapToAdapter(Price price) {
        return null;
    }
}
