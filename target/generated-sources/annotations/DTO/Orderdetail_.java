package DTO;

import DTO.Order1;
import DTO.Vegetable;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-25T01:05:58", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Orderdetail.class)
public class Orderdetail_ { 

    public static volatile SingularAttribute<Orderdetail, Short> quantity;
    public static volatile SingularAttribute<Orderdetail, Order1> orderID;
    public static volatile SingularAttribute<Orderdetail, Float> price;
    public static volatile SingularAttribute<Orderdetail, Integer> id;
    public static volatile SingularAttribute<Orderdetail, Vegetable> vegetableID;

}