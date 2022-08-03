/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundrypbo.apps.impl;

import java.sql.Connection;
import laundrypbo.apps.entity.Customer;
import laundrypbo.apps.exception.CustomerException;
import laundrypbo.apps.service.CustomerDao;

/**
 *
 * @author azkaz
 */
public class CustomerImpl implements CustomerDao{

    private Connection connection; //Atribut bertipe COnnection sebagai object koneksi database
    @Override
    public void InsertCustomer(Customer customer) throws CustomerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public CustomerImpl(Connection connection){
        this.connection = connection;
    }

    @Override
    public void UpdateCustomer(Customer customer) throws CustomerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeleteCustomer(Customer customer) throws CustomerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getCustomerId(Customer customer) throws CustomerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <any> selectAllCustomer() throws CustomerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
