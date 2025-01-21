package gr.aueb.cf.ch16.interfaces;

import gr.aueb.cf.ch16.interfaces.model.Customer;

public interface ICustomerDAO {
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer, Long id);
    boolean removeCustomer(Long id);
    Customer getCustomerByID(Long id);
    Customer getCustomerByPhoneNumber(String phoneNumber);
    Customer[] getCustomersByRegion (String region);
    Customer getCustomerByVat (String vat);
}
