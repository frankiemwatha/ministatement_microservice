package mwatha.mfsdemo.customerkyc.ministatement_microservice.Service;

import mwatha.mfsdemo.customerkyc.ministatement_microservice.Model.Customer;
import mwatha.mfsdemo.customerkyc.ministatement_microservice.Repository.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class CustomerRepositoryImpl implements customerRepositoryCustom {
    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    private customerRepository repository;

    @Override
    public List<Customer> findAll() {
        List<Customer> loans = (List<Customer>) repository.findAll();
        return loans;
    }

    @Override
    public List<Customer> findAllById_number(Integer id_number) {
        List<Customer> loanDetails = entityManager.createQuery("SELECT c FROM Customer c WHERE c.id_number =:id_number")
                .setParameter("id_number",id_number).getResultList();
        return loanDetails;
    }


//    @Override
//    public List<customerModel> findAllById_number(Integer id_number) {
//        List<customerModel> customerLoans = (List<customerModel>) repository.findAllById(Iterable<Integer> id_number);
//        return null;
//    }

}
