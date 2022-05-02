import Mernis.FRSKPSPublicSoap
import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {
    public static void main(String[] args) {

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1,"Kayra","Akın",1999,"38293674462"));
    }
}