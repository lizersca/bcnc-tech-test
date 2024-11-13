package org.bcnc.rest;

import lombok.AllArgsConstructor;
import org.bcnc.application.port.ManagePricesIn;
import org.bcnc.application.usecase.FindPrices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("prices")
@AllArgsConstructor
public class ManagePricesInRest implements ManagePricesIn<ResponseEntity<PriceRest>> {

    private final FindPrices findPrices;

    private final PricesMapperRest pricesMapper;

    @Override
    @GetMapping(params = {"applicationDate", "productId", "brandId"}, produces = "application/json")
    public ResponseEntity<PriceRest> findPricesBy(
            @RequestParam(value = "application_date", required = false) Instant applicationDate,
            @RequestParam(value = "product_id", required = false) Integer productId,
            @RequestParam(value = "brand_id", required = false) Integer brandId) {
        return pricesMapper.mapToAdapter(
                findPrices.findPriceBy(applicationDate, productId, brandId));
    }

    //signed commit test.
}
