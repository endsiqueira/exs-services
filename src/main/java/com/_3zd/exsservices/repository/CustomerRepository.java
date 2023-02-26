package com._3zd.exsservices.repository;

import com._3zd.exsservices.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
