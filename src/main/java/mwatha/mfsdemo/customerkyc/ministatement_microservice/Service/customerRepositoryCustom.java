package mwatha.mfsdemo.customerkyc.ministatement_microservice.Service;


import mwatha.mfsdemo.customerkyc.ministatement_microservice.Model.Customer;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface customerRepositoryCustom {
    List<Customer> findAll();
    List<Customer> findAllById_number(@Param("id_number") Integer id_number);
}
