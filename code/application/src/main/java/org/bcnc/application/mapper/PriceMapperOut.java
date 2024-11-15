package org.bcnc.application.mapper;

import org.bcnc.domain.entities.Price;

public interface PriceMapperOut<T> {

    T map(Price price);
}
