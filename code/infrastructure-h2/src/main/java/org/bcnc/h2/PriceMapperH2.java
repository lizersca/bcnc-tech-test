package org.bcnc.h2;

import org.bcnc.application.mapper.PriceMapper;
import org.bcnc.domain.entities.Price;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
class PriceMapperH2 implements PriceMapper<PriceH2> {

    @Override
    public PriceH2 mapToAdapter(Price price) {
        return null;
    }
}
