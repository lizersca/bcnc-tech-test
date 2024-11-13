package org.bcnc.h2;

import lombok.AllArgsConstructor;
import org.bcnc.application.port.ManagePricesIn;
import org.bcnc.application.port.ManagePricesOut;
import org.bcnc.domain.entities.Price;
import org.springframework.stereotype.Repository;

import java.time.Instant;

@Repository
@AllArgsConstructor
public class ManagePricesH2 implements ManagePricesOut {

    private PricesMapperH2 pricesMapper;

    @Override
    public Price findPricesBy(Instant applicationDate, Integer productId, Integer brandId) {
        return null;
    }
}
