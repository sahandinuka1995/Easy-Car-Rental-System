package lk.scodelabs.carrent.service;

import lk.scodelabs.carrent.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDTO dto);

    void updateCustomer(CustomerDTO dto);

    CustomerDTO searchCustomer(String id);

    void deleteCustomer(String id);

    List<CustomerDTO> getAllCustomer();
}
