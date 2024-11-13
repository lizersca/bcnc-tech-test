package org.bcnc.application.port;

import java.time.Instant;

public interface ManagePricesIn<T> {

    T findPricesBy(Instant applicationDate, Integer productId, Integer brandId);
}
