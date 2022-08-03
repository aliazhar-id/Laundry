/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundrypbo.apps.service;

import java.util.List;
import laundrypbo.apps.entity.Customer;
import laundrypbo.apps.exception.CustomerException;

/**
 *
 * @author azkaz
 */
public interface CustomerDao {
    
    //Abstract Method untuk melakukan operasi Insert
    public void InsertCustomer(Customer customer) throws CustomerException;
    //Abstract Method untuk melakukan operasi Update
    public void UpdateCustomer(Customer customer) throws CustomerException;
    //Abstract Method untuk melakukan operasi Delete
    public void DeleteCustomer(Customer customer) throws CustomerException;
    //Abstract Method untuk melakukan operasi Select BY Id
    public void getCustomerId(Customer customer) throws CustomerException;
    
    //Abstract Method untuk melakukan operasi Select seluruh Data di Tabel anggota
    public List<Customer> selectAllCustomer() throws CustomerException;
    
}
