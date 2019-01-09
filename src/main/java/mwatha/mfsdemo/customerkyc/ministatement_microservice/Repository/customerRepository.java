package mwatha.mfsdemo.customerkyc.ministatement_microservice.Repository;


import mwatha.mfsdemo.customerkyc.ministatement_microservice.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//SELECT * FROM customerloans WHERE id_number = 28848199;
// @Query("SELECT a FROM Article a WHERE a.title=:title and a.category=:category")


@RestController
//@RestController
public interface customerRepository extends JpaRepository<Customer, Integer> {

//   List<customerModel> findById(int id);
   List<Customer> findAllById_number(@Param("id_number") Integer id_number);
   }
