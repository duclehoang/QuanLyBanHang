package DTO;

import DTO.Customers;
import DTO.Orderdetail;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-25T01:05:58", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Order1.class)
public class Order1_ { 

    public static volatile SingularAttribute<Order1, Date> date;
    public static volatile SingularAttribute<Order1, String> note;
    public static volatile SingularAttribute<Order1, Float> total;
    public static volatile SingularAttribute<Order1, Integer> orderID;
    public static volatile ListAttribute<Order1, Orderdetail> orderdetailList;
    public static volatile SingularAttribute<Order1, Customers> customerID;

}