package mwatha.mfsdemo.customerkyc.ministatement_microservice.Controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javafx.application.Application;
import mwatha.mfsdemo.customerkyc.ministatement_microservice.Model.Customer;
import mwatha.mfsdemo.customerkyc.ministatement_microservice.Repository.customerRepository;
import mwatha.mfsdemo.customerkyc.ministatement_microservice.Service.customerRepositoryCustom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/customerloan")
@Api(value="loan status", description="Operations pertaining to loan status")
public class customerController {
    @Autowired
    private customerRepositoryCustom service;
    private customerRepository repository;

    // Single item
    @ApiOperation(value = "loan status")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved loan status"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )

    @RequestMapping(value ="/ministatement/{id_number}", method= RequestMethod.GET,produces = "application/json")
      public List<Customer> getLoan(@PathVariable int id_number) {
//        List<Customer> loans = service.findAll();
        List<Customer> c_loans = service.findAllById_number(id_number);
        return c_loans;
    }
}