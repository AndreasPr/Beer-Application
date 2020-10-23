package com.andreasgroup.beerapplication.web.mappers;

import com.andreasgroup.beerapplication.domain.Customer;
import com.andreasgroup.beerapplication.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * Created on 23/Oct/2020 to beer-application
 */
@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDTO(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
