package DAL;

import DTO.Customers;
import DTO.Order1;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class OrderDAL {
    Order1 order =new Order1();
    Session session;
    Transaction transaction;
    
  public List<Order1> getALLOrder() {

    List <Order1> order = null;
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
    
}
