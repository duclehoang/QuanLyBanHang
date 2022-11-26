package DTO;

import DTO.Order1;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-25T01:05:58", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Customers.class)
public class Customers_ { 

    public static volatile SingularAttribute<Customers, String> password;
    public static volatile SingularAttribute<Customers, String> address;
    public static volatile SingularAttribute<Customers, String> city;
    public static volatile SingularAttribute<Customers, Integer> customerID;
    public static volatile ListAttribute<Customers, Order1> order1List;
    public static volatile SingularAttribute<Customers, String> fullname;

}