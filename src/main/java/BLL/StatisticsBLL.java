/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.StatisticsDAL;
import DTO.Order1;
import DTO.Statistics;
import java.util.Date;
import java.util.List;
import org.hibernate.stat.SessionStatistics;

/**
 *
 * @author nguye
 */
public class StatisticsBLL {
    StatisticsDAL sdal=new StatisticsDAL();
    Statistics statistics=new Statistics();
            
      public  List<Statistics> getListStatisticses() {
        return sdal.getStatisticses();
    }
           public void addStatic(int totalOrder,float totalMonney){
        statistics.setTotalOrder(totalOrder);
        statistics.setTotalMoney(totalMonney);
     
}
      public Statistics findStatic(int id) {
        return sdal.findStatistics(id);
    }
    
}
