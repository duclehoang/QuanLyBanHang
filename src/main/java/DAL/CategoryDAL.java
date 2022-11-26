package DAL;

import DTO.Category;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CategoryDAL {
    Transaction transaction;
    Session session;
     Category category = null;

    public  CategoryDAL(){
         session = HibernateUtils.getFactory().openSession();
    }

    public List<Category> getAllCategory() {
        List<Category> category = null;
        try {
        
            session.beginTransaction();
            category = session.createQuery("from Category").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }finally {
            session.clear();
            session.close();
        }
        return category;
    }
    
       public void addCategory(Category category ) {
        try {
            
            session.beginTransaction();
            session.save(category);
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
        public void updateCategory(Category category) {
        try {
            
          session.beginTransaction();
            session.update(category);
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
    public void delCategory(int id) {    
        try {
          
            Category category = session.get(Category.class, id);
                session.beginTransaction();
                session.delete(category);
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
    
            
   public Category FindCategoryById(int id) {
       
        try {
            session = HibernateUtils.getFactory().openSession();
             session.beginTransaction();
            category = session.get(Category.class, id);
            session.getTransaction().commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }finally {
            session.clear();
            session.close();
        }
        return category;    
    }


}
