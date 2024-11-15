package org.bcnc.application;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.bcnc.application.port.PriceRepository;
import org.bcnc.domain.entities.Price;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class FindPriceUseCase {

    private final PriceRepository priceRepository;

    public Price findPriceBy(Instant applicationDate, Integer productId, Integer brandId) {
        return priceRepository.findPricesBy(applicationDate, productId, brandId);
    }
}
