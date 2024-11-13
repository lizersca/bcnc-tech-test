package org.bcnc.application.mapper;

import org.bcnc.domain.entities.Price;

public interface PricesMapper<T> {

    T mapToAdapter(Price price);
}
