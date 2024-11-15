package org.bcnc.h2;

import lombok.RequiredArgsConstructor;
import org.bcnc.application.port.PriceRepository;
import org.bcnc.domain.entities.Price;
import org.springframework.stereotype.Repository;

import java.time.Instant;

@Repository
@RequiredArgsConstructor
public class PriceRepositoryH2 implements PriceRepository {

    private final PriceRepositoryJPA priceRepositoryJPA;

    private final PriceMapperInH2 pricesMapper;

    @Override
    public Price findPricesBy(Instant applicationDate, Integer productId, Integer brandId) {
        return pricesMapper.map(priceRepositoryJPA.findBy(applicationDate, productId, brandId));
    }
}
