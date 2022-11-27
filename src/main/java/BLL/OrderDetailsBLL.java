/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.HibernateUtils;
import DAL.OrderDetailsDAL;
import DTO.Order;
import DTO.Orderdetail;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author nguye
 */
public class OrderDetailsBLL {
        OrderDetailsDAL orderDetailsDAL=new OrderDetailsDAL();
          public  List<Orderdetail> getAllOrderDt() {
        return orderDetailsDAL.getALLOrderDt();
    }
     public Orderdetail findOrderDt(int id) {
        return orderDetailsDAL.findOderDt(id);
    }
}
