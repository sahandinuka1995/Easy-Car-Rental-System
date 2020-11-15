package lk.scodelabs.carrent.service.impl;

import lk.scodelabs.carrent.dto.CustomerDTO;
import lk.scodelabs.carrent.entity.Customer;
import lk.scodelabs.carrent.repo.CustomerRepo;
import lk.scodelabs.carrent.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    CustomerRepo repo;

    @Override
    public void saveCustomer(CustomerDTO dto) {
        if (!repo.existsById(dto.getNic())) {
            repo.save(modelMapper.map(dto, Customer.class));
        } else {
            throw new RuntimeException("Customer Already Exist!");
        }
    }

    @Override
    public void updateCustomer(CustomerDTO dto) {
        if (repo.existsById(dto.getNic())) {
            repo.save(modelMapper.map(dto, Customer.class));
        } else {
            throw new RuntimeException("Customer Not Found!");
        }
    }

    @Override
    public CustomerDTO searchCustomer(String id) {
        Optional<Customer> cus = repo.findById(id);
        if (cus.isPresent()) {
            return modelMapper.map(cus.get(), CustomerDTO.class);
        } else {
            throw new RuntimeException("Customer does not exist!");
        }
    }

    @Override
    public void deleteCustomer(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Couldn't to delete Customer!");
        }
    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
        return modelMapper.map(repo.findAll(), new TypeToken<List<CustomerDTO>>() {
        }.getType());
    }
}
