/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.OrderDAL;
import DTO.Customers;
import DTO.Order;
import DTO.Vegetable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nguye
 */
public class OrderBLL {
    OrderDAL odal=new OrderDAL();
    Order order=new Order();
     public  List<Order> getAllOrder() {
        return odal.getALLOrder();
    }
     
        public void addOrder( int id,Date Date,float Total,String note){
        order.setCustomerID(id);
        order.setDate(Date);
        order.setTotal(Total);
        order.setNote(note); //role = 1 is customer; role = 2 is  employee
        odal.addOrder(order);
}
        public void updateOrder(Date date,float total,String note){
       
        order.setDate(date);
        order.setTotal(total);
        order.setNote(note);
     
     
    }
    public void deleteOrder(int id) {
        odal.deleteOrder(id);
}

    public Order findOrder(int id) {
        return odal.findOder(id);
    }
}
