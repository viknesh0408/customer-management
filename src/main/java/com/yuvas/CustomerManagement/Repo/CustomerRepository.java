package com.yuvas.CustomerManagement.Repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.yuvas.CustomerManagement.Entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
