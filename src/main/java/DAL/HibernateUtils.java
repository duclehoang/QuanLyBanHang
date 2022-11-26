/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import java.util.List;
import java.util.Properties;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.cfg.Environment;
import org.hibernate.query.Query;

/**
 *
 * @author nguye
 */
public class HibernateUtils {

    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties p = new Properties();
        p.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        p.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        p.put(Environment.URL, "jdbc:mysql://localhost:3306/market2");
        p.put(Environment.USER, "root");
        p.put(Environment.PASS, "");
        p.put(Environment.SHOW_SQL, "true");
        
        conf.addAnnotatedClass(Category.class);
        conf.addAnnotatedClass(Vegetable.class);
        conf.addAnnotatedClass(Customers.class);
        conf.addAnnotatedClass(Order1.class);
        conf.addAnnotatedClass(Statistics.class);
        conf.addAnnotatedClass(Orderdetail.class);
       

        conf.setProperties(p);
        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFactory() {
        return FACTORY;
    }

   
}
