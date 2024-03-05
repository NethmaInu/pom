package com.springbootaccadamy.batch8.pos1.controller;

import com.springbootaccadamy.batch8.pos1.DTO.CustomerDTO;
import com.springbootaccadamy.batch8.pos1.DTO.request.CustomerUpdateDTO;
import com.springbootaccadamy.batch8.pos1.service.CustomerService;
import com.springbootaccadamy.batch8.pos1.service.impl.CustomerServiceIMPL;
import com.springbootaccadamy.batch8.pos1.utill.StandedResponce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){

        customerService.saveCustomer(customerDTO);
        return "Saved";
    }
@PutMapping("/update")
public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO){
String customer=customerService.updateCustomer(customerUpdateDTO);

        return customer;
}
@GetMapping(
        path = "/get-by-id",
        params = "id"

)
public CustomerDTO getCusomerById(@RequestParam(value = "id") int customerId){
CustomerDTO customerDTO=customerService.getCustomerId(customerId);
return customerDTO;
    }
    @GetMapping(
            path = "/get-all-customer"

    )
    public ResponseEntity<StandedResponce> getAllCustomer(){
        List<CustomerDTO> allCustomers=customerService.getAllCustomer();
        return new ResponseEntity<StandedResponce>(new StandedResponce
                (201,"sucessfully created", allCustomers),
                HttpStatus.ACCEPTED
                );
    }
    @DeleteMapping(
            path = "/Delete-by-id/{id}"
    )
    public String deleteCustomer(@PathVariable(value = "id") int customerId){
        String deleted=customerService.deleteById(customerId);
        return deleted;
    }
    @GetMapping(
            path = "/get-all-customer-by-state/{state}"

    )
    public List<CustomerDTO> getAllCustomerById(@PathVariable(value = "state")boolean state){
        List<CustomerDTO> allCustomers=customerService.getAllCustomerById(state);
        return allCustomers;
    }
}
