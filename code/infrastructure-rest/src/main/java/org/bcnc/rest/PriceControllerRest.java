package org.bcnc.rest;

import lombok.AllArgsConstructor;
import org.bcnc.application.port.PricesApi;
import org.bcnc.application.FindPriceUseCase;
import org.bcnc.rest.exception.MissingParameterException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

import static java.util.Objects.isNull;

@RestController
@RequestMapping("prices")
@AllArgsConstructor
public class PriceControllerRest implements PricesApi<ResponseEntity<PriceRest>> {

    private final FindPriceUseCase findPriceUseCase;

    private final PriceMapperRest pricesMapper;

    @Override
    @GetMapping(produces = "application/json")
    public ResponseEntity<PriceRest> findPriceBy(
            @RequestParam(value = "application_date", required = false) Instant applicationDate,
            @RequestParam(value = "product_id", required = false) Integer productId,
            @RequestParam(value = "brand_id", required = false) Integer brandId) {
        if (isNull(applicationDate) && isNull(productId) && isNull(brandId)) {
            throw new MissingParameterException();
        }
        return pricesMapper.map(
                findPriceUseCase.findPriceBy(applicationDate, productId, brandId));
    }
}
