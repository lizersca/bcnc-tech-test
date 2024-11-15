package org.bcnc.h2;

import org.bcnc.application.mapper.PriceMapperIn;
import org.bcnc.domain.entities.Price;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
class PriceMapperInH2 implements PriceMapperIn<PriceH2> {

    @Override
    public Price map(PriceH2 price) {
        return null;
    }
}
