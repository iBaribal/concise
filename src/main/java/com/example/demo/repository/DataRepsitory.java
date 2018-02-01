package com.example.demo.repository;

import com.example.demo.model.Data;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DataRepsitory extends CrudRepository<Data, Long> {

    /**
     * Custom query for retrieving all records from database
     * that include the parameter 'customer'.
     * @param customer
     * @return List of Data objects.
     */
    @Query("Select c from Data c where c.data LIKE %?1%")
    public List<Data> findByCustomer(@Param("customer") String customer);
}
