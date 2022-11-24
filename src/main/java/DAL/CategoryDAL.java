package DAL;

import DTO.Category;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CategoryDAL {
    Transaction transaction;
    Session session;
    public List<Category> getAllCategory() {
        List<Category> category = null;
        try {
            Session session = HibernateUtils.getFactory().openSession();
           transaction = session.beginTransaction();
            category = session.createQuery("from Category").list();
            transaction.commit();
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
