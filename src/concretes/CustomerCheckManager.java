package concretes;

import abstracts.CustomerCheckService;
import entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
