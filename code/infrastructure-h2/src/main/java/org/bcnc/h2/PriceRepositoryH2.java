package org.bcnc.h2;

import lombok.AllArgsConstructor;
import org.bcnc.application.port.PriceRepository;
import org.bcnc.domain.entities.Price;
import org.springframework.stereotype.Repository;

import java.time.Instant;

@Repository
@AllArgsConstructor
public class PriceRepositoryH2 implements PriceRepository {

    private PriceMapperH2 pricesMapper;

    @Override
    public Price findPricesBy(Instant applicationDate, Integer productId, Integer brandId) {
        return null;
    }
}
