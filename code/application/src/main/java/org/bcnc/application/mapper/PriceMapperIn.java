package org.bcnc.application.mapper;

import org.bcnc.domain.entities.Price;

public interface PriceMapperIn<T> {

    Price map(T price);
}
