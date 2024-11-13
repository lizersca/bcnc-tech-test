package org.bcnc.application.usecase;

import lombok.AllArgsConstructor;
import org.bcnc.application.port.ManagePricesOut;
import org.bcnc.domain.entities.Price;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@AllArgsConstructor
public class FindPrices {

    private ManagePricesOut managePricesOut;

    public Price findPriceBy(Instant applicationDate, Integer productId, Integer brandId) {
        return managePricesOut.findPricesBy(applicationDate, productId, brandId);
    }
}
