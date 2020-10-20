package com.andreasgroup.beerapplication.services.v2;

import com.andreasgroup.beerapplication.web.model.v2.BeerDtoV2;

import java.util.UUID;

/**
 * Created on 20/Oct/2020 to beer-application
 */
public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}
