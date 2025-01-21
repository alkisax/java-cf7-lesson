package gr.aueb.cf.ch16.interfaces;

import gr.aueb.cf.ch16.interfaces.model.Customer;

public class CustomerDAOImpl implements ICustomerDAO{
    @Override
    public void addCustomer(Customer customer) {

    }

    @Override
    public void updateCustomer(Customer customer, Long id) {

    }

    @Override
    public boolean removeCustomer(Long id) {
        return false;
    }

    @Override
    public Customer getCustomerByID(Long id) {
        return null;
    }

    @Override
    public Customer getCustomerByPhoneNumber(String phoneNumber) {
        return null;
    }

    @Override
    public Customer[] getCustomersByRegion(String region) {
        return new Customer[0];
    }

    @Override
    public Customer getCustomerByVat(String vat) {
        return null;
    }
}
