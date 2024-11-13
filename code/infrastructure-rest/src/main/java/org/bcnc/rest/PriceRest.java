package org.bcnc.rest;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

@Builder
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class PriceRest implements Serializable {

    @Serial
    private static final long serialVersionUID = -1731633789764308382L;

    private Integer productId;

    private Integer brandId;

    private Integer priceList;

    private Instant startDate;

    private Instant endDate;

    private Float price;
}
