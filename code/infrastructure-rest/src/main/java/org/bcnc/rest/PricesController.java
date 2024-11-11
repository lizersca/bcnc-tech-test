package org.bcnc.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("prices")
public class PricesController {

    @GetMapping(params = {"applicationDate", "productId", "brandId "}, produces = "application/json")
    public ResponseEntity<Price> getPrice(
            @RequestParam(value = "application_date", required = false) Instant applicationDate,
            @RequestParam(value = "product_id", required = false) Integer productId,
            @RequestParam(value = "brand_id", required = false) Integer brandId) {
        return null;
    }
}
