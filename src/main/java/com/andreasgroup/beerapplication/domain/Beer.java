package com.andreasgroup.beerapplication.domain;

import com.andreasgroup.beerapplication.web.model.v2.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created on 23/Oct/2020 to beer-application
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;
    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;
}
