/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.CustomerDAL;
import DTO.Customers;
import DTO.Vegetable;
import java.util.List;

/**
 *
 * @author nguye
 */
public class CustomersBLL {
    CustomerDAL customerDAL=new CustomerDAL();
    Customers c=new Customers();
    
    
    
        public List<Customers> getListCustomers() {
        return customerDAL.getAllCustomer();
 }
        public void addCustomer( String name,String Address,String City,String NumberPhone){
        c.setFullname(name);
        c.setAddress(Address);
        c.setCity(City);
        c.setPhoneNumber(name); //role = 1 is customer; role = 2 is  employee
        customerDAL.addCustomers(c);
}

        
        
public void updateCustomer(String name,String Address,String City,String Phone){
       
        c.setFullname(name);
        c.setPhoneNumber(Phone);
        c.setAddress(Address);
        c.setCity(City);
     
    }

public void deleteCustomer(int id) {
        customerDAL.deleteCustomer(id);
}

    public Customers findCustomers(int id) {
        return customerDAL.findCustomer(id);
    }

   
 }
    

