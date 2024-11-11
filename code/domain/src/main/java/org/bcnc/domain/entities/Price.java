package org.bcnc.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

@Builder
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Price {

    private Integer id;

    private Instant startDate;

    private Instant endDate;

    private Integer priceList;

    private Integer productId;

    private Integer priority;

    private Float price;

    private String curr;

    private Integer brandId;
}
