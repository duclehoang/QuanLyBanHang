/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.Order1;
import DTO.Orderdetail;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author nguye
 */
public class OrderDetailsDAL {
    
    
       Session session;
    Transaction transaction;
     Orderdetail orderdetail ;
      public List<Orderdetail> getALLOrderDt() {

    List <Orderdetail> orderdetails = null;
    try {
        session = HibernateUtils.getFactory().openSession();
        transaction=session.beginTransaction();           
        orderdetails = session.createQuery("from orderdetail ").list();
        session.getTransaction().commit();
    } catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
    }finally {
        session.clear();
        session.close();
    }
    return orderdetails;      
}
      
      
         public Orderdetail findOderDt(int id) {
       
        try {
            session = HibernateUtils.getFactory().openSession();
        transaction=  session.beginTransaction();
           orderdetail = session.get(Orderdetail.class, id);
            session.getTransaction().commit();
        } catch (Exception e) {
            if (transaction != null) {
              transaction.rollback();
            }
        }finally {
            session.clear();
            session.close();
        }
        return orderdetail;  
}
    
}
