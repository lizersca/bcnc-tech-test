package org.bcnc.application.mapper;

import org.bcnc.domain.entities.Price;

public interface PriceMapper<T> {

    T mapToAdapter(Price price);
}
