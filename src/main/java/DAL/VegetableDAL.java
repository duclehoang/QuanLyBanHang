package DAL;

import DTO.Category;
import DTO.Vegetable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class VegetableDAL {
    Vegetable vegetable =new Vegetable();
    Transaction transaction;
    Session session;
    public VegetableDAL(){
        session = HibernateUtils.getFactory().openSession();
    }
    public List<Vegetable> getAllProduct() {

        List <Vegetable> vegetable = null;
        try {
            
            transaction=session.beginTransaction();       
            vegetable = session.createQuery("from vegetable").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            if (transaction != null) {
              transaction.rollback();
            }
        }finally {
            session.clear();
            session.close();
        }
        return vegetable; 
    }
    
    public Vegetable addVegetable(Vegetable vegetable) {
        Vegetable vegetable1 = null;
        try {
            session = HibernateUtils.getFactory().openSession();
          transaction= session.beginTransaction();
            session.save(vegetable);
            vegetable1 = vegetable;
            session.getTransaction().commit();
        } catch (Exception e) {
            if (transaction != null) {
              transaction.rollback();
            }
        }finally {
            session.clear();
            session.close();
        }
        return vegetable1;
 }
    
    public void updateVegetable(int id ,String vegetableName, int amount,float price,String url) {
        try {
            session = HibernateUtils.getFactory().openSession();
            transaction= session.beginTransaction();
            String hql = "UPDATE vegetable SET VegetableName = :VegetableName, Amount=:Amount,Image=:Image, Price:price WHERE VegetableID = :id"; 
            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            query.setParameter("VegetableName", vegetableName);
            query.setParameter("Amount", amount);
            query.setParameter("Price", price);
             query.setParameter("Image", url);
            query.executeUpdate();           
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
    
    public void deleteVegetable(int id) {    
        try {
            session = HibernateUtils.getFactory().openSession();
            vegetable = session.get(Vegetable.class, id);
            transaction= session.beginTransaction();
            session.delete(vegetable);
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
    
    
    public Vegetable findVegetable(int id) {
       
        try {
            session = HibernateUtils.getFactory().openSession();
        transaction=  session.beginTransaction();
            vegetable = session.get(Vegetable.class, id);
            session.getTransaction().commit();
        } catch (Exception e) {
            if (transaction != null) {
              transaction.rollback();
            }
        }finally {
            session.clear();
            session.close();
        }
        return vegetable;  
}





}
