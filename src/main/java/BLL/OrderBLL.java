/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.OrderDAL;
import DTO.Order1;
import DTO.Vegetable;
import java.util.List;

/**
 *
 * @author nguye
 */
public class OrderBLL {
    OrderDAL odal=new OrderDAL();
     public  List<Order1> getAllOrder() {
        return odal.getALLOrder();
    }
    
}
