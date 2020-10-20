package com.andreasgroup.beerapplication.services;

import com.andreasgroup.beerapplication.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created on 19/Oct/2020 to beer-application
 */
public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomerById(UUID customerId);
}
