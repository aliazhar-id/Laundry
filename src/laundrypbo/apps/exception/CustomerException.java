/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundrypbo.apps.exception;

/**
 *
 * @author azkaz
 */
public class CustomerException extends Exception {
    
    public CustomerException(){
        
    }
    
    public CustomerException(String msg){
        super(msg);
    }
    
}
