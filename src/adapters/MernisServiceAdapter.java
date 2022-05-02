package adapters;

import Mernis.FRSKPSPublicSoap;
import abstracts.CustomerCheckService;
import entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        Mernis.FRSKPSPublicSoap client = new FRSKPSPublicSoap();
        return client.TCKimlikNoDogrula(customer.getLastName(),customer.getFirstName(),customer.getDateOfBirth(),customer.getNationalityId());
    }
}
