package DTO;

import DTO.Category;
import DTO.Orderdetail;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-11-25T01:05:58", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Vegetable.class)
public class Vegetable_ { 

    public static volatile SingularAttribute<Vegetable, String> image;
    public static volatile SingularAttribute<Vegetable, String> unit;
    public static volatile SingularAttribute<Vegetable, Integer> amount;
    public static volatile SingularAttribute<Vegetable, String> vegetableName;
    public static volatile SingularAttribute<Vegetable, Float> price;
    public static volatile ListAttribute<Vegetable, Orderdetail> orderdetailList;
    public static volatile SingularAttribute<Vegetable, Integer> catagoryID;
    public static volatile SingularAttribute<Vegetable, Category> category;
    public static volatile SingularAttribute<Vegetable, Integer> vegetableID;

}