package DTO;

import DTO.Customers;
import DTO.Orderdetail;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-25T01:05:58", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Order.class)
public class Order1_ { 

    public static volatile SingularAttribute<Order, Date> date;
    public static volatile SingularAttribute<Order, String> note;
    public static volatile SingularAttribute<Order, Float> total;
    public static volatile SingularAttribute<Order, Integer> orderID;
    public static volatile ListAttribute<Order, Orderdetail> orderdetailList;
    public static volatile SingularAttribute<Order, Customers> customerID;

}