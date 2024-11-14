package org.bcnc.application.port;

import org.bcnc.domain.entities.Price;

import java.time.Instant;

public interface PriceRepository {

    Price findPricesBy(Instant applicationDate, Integer productId, Integer brandId);
}
