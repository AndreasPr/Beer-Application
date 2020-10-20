package com.andreasgroup.beerapplication.services;

import com.andreasgroup.beerapplication.web.model.BeerDto;

import java.util.UUID;

/**
 * Created on 19/Oct/2020 to beer-application
 */
public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
