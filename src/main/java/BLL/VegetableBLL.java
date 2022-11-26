/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.VegetableDAL;
import DTO.Vegetable;
import java.util.List;

/**
 *
 * @author nguye
 */
public class VegetableBLL {
    VegetableDAL vdal=new VegetableDAL();
    Vegetable vegetable=new Vegetable();
    
    
    public  List<Vegetable> getAllVegetable() {
        return vdal.getAllProduct();
    }
    
    public Vegetable addVegetable( int Categoryid, String VegetableName, String img, String unit, int Amount,int price) {
        
        vegetable.setCatagoryID(Categoryid);
        vegetable.setVegetableName(VegetableName);
        vegetable.setImage(img);
        vegetable.setUnit(unit);
        vegetable.setAmount(Amount);
        vegetable.setPrice(price);
       
        return vdal.addVegetable(vegetable);
    }
    public void updateVegetable(int vegetableId,String VegetableName, String unit , int amount, float price,String url) {
        vegetable.setVegetableName(VegetableName);
        vegetable.setUnit(unit);
        vegetable.setAmount(amount);
        vegetable.setPrice(price);
        vegetable.setImage(url);



}
    
    public void deletevegetable(int id) {
        vdal.deleteVegetable(id);
}
    
    public Vegetable findVegetable(int id) {
        return vdal.findVegetable(id);
    }


}
