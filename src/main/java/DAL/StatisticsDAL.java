/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.Order1;
import DTO.Statistics;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author nguye
 */
public class StatisticsDAL {
    Session session;
    Transaction transaction;
    Statistics statistics=new Statistics();
    
    public List<Statistics> getStatisticses() {

    List <Statistics> st = null;
    try {
        session = HibernateUtils.getFactory().openSession();
        transaction=session.beginTransaction();           
        st = session.createQuery("from statistics ").list();
        session.getTransaction().commit();
    } catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
    }finally {
        session.clear();
        session.close();
    }
    return st;      
}
    
    
     public Statistics addStatistics(Statistics statistics) {
      
        try {
            session = HibernateUtils.getFactory().openSession();
          transaction= session.beginTransaction();
            session.save(statistics);
            
            session.getTransaction().commit();
        } catch (Exception e) {
            if (transaction != null) {
              transaction.rollback();
            }
        }finally {
            session.clear();
            session.close();
        }
        return statistics;
 }
     
     
           public Statistics findStatistics(int id) {
       
        try {
            session = HibernateUtils.getFactory().openSession();
        transaction=  session.beginTransaction();
             statistics = session.get(Statistics.class, id);
            session.getTransaction().commit();
        } catch (Exception e) {
            if (transaction != null) {
              transaction.rollback();
            }
        }finally {
            session.clear();
            session.close();
        }
        return statistics;  
}
    
}
