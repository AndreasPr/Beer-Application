package com.andreasgroup.beerapplication.web.mappers;

import com.andreasgroup.beerapplication.domain.Beer;
import com.andreasgroup.beerapplication.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created on 23/Oct/2020 to beer-application
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);

}
