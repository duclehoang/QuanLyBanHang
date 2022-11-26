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
            
            session.beginTransaction();       
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
           session.beginTransaction();
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
    
    public void updateVegetable(int id ,String vegetableName, int amount,int price) {
        try {
            session = HibernateUtils.getFactory().openSession();
             session.beginTransaction();
            String hql = "UPDATE vegetable SET VegetableName = :VegetableName, Amount=:Amount, Price:price  WHERE VegetableID = :id"; 
            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            query.setParameter("VegetableName", vegetableName);
            query.setParameter("Amount", amount);
            query.setParameter("Price", price);
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



}
