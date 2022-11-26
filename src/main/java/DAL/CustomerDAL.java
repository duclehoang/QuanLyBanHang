/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import BLL.CustomersBLL;
import DTO.Category;
import DTO.Customers;
import DTO.Vegetable;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author nguye
 */
public class CustomerDAL {
    
    Customers customer=new Customers();
    Session session=null;
    Transaction transaction=null;
    
    public List<Customers> getAllCustomer() {

    List <Customers> customer = null;
    try {
        session = HibernateUtils.getFactory().openSession();
        transaction=session.beginTransaction();           
        customer = session.createQuery("from customers ").list();
        session.getTransaction().commit();
    } catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
    }finally {
        session.clear();
        session.close();
    }
    return customer;      
}
    
    
      public void addCustomers(Customers customers ) {
        try {
            
           transaction= session.beginTransaction();
            session.save(customers);
          session.getTransaction().commit();
        } catch (Exception e) {
            if (transaction != null) {
               transaction.rollback();
            }
        }finally {
            session.clear();
            session.close();
        }


        
     
}

    
        
        public void updateCustomer(Customers customer) {
        try {
            session = HibernateUtils.getFactory().openSession();
            transaction = session.beginTransaction();
            session.update(customer);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }

        }finally {
            session.clear();
            session.close();
        }
        
        
}
    
    
    
     
          public void deleteCustomer(int id) {          
        try {
            session = HibernateUtils.getFactory().openSession();
            Customers customer = session.get(Customers.class, id);          
          
                transaction = session.beginTransaction();
                session.delete(customer);
                transaction.commit();
            
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }finally {
            session.clear();
            session.close();
        }  
  }

          
      public Customers findCustomer(int id) {
       
        try {
            session = HibernateUtils.getFactory().openSession();
        transaction=  session.beginTransaction();
            customer = session.get(Customers.class, id);
            session.getTransaction().commit();
        } catch (Exception e) {
            if (transaction != null) {
              transaction.rollback();
            }
        }finally {
            session.clear();
            session.close();
        }
        return customer;  
}
       
    
            
        
        
}
        

   
    

