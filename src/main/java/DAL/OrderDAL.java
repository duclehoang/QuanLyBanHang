package DAL;

import DTO.Customers;
import DTO.Order;
import DTO.Vegetable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class OrderDAL {
    Order order =new Order();
    Session session;
    Transaction transaction;
    
  public List<Order> getALLOrder() {

    List <Order> order = null;
    try {
        session = HibernateUtils.getFactory().openSession();
        transaction=session.beginTransaction();           
        order = session.createQuery("from order ").list();
        session.getTransaction().commit();
    } catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
    }finally {
        session.clear();
        session.close();
    }
    return order;      
}
  
    public Order addOrder(Order order1) {
      
        try {
            session = HibernateUtils.getFactory().openSession();
          transaction= session.beginTransaction();
            session.save(order1);
            
            session.getTransaction().commit();
        } catch (Exception e) {
            if (transaction != null) {
              transaction.rollback();
            }
        }finally {
            session.clear();
            session.close();
        }
        return order1;
        
 }
    
    
  public void updateOrder(Order order) {
        try {
            session = HibernateUtils.getFactory().openSession();
            transaction = session.beginTransaction();
            session.update(order);
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
  
          public void deleteOrder(int id) {          
        try {
            session = HibernateUtils.getFactory().openSession();
            Order order1 = session.get(Order.class, id);          
          
                transaction = session.beginTransaction();
                session.delete(order1);
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
          
          
             public Order findOder(int id) {
       
        try {
            session = HibernateUtils.getFactory().openSession();
        transaction=  session.beginTransaction();
             order = session.get(Order.class, id);
            session.getTransaction().commit();
        } catch (Exception e) {
            if (transaction != null) {
              transaction.rollback();
            }
        }finally {
            session.clear();
            session.close();
        }
        return order;  
}
    
}
