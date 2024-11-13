package org.bcnc.application.port;

import org.bcnc.domain.entities.Price;

import java.time.Instant;

public interface ManagePricesOut {

    Price findPricesBy(Instant applicationDate, Integer productId, Integer brandId);
}
