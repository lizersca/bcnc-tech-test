package org.bcnc.application.port;

import java.time.Instant;

public interface PricesApi<T> {

    T findPriceBy(Instant applicationDate, Integer productId, Integer brandId);
}
