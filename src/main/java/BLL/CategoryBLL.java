/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.CategoryDAL;
import DTO.Category;
import java.util.List;

/**
 *
 * @author nguye
 */
public class CategoryBLL {
    
    
    CategoryDAL categoryDAL=new CategoryDAL();
     Category category=new Category();
    
    
    public List<Category> getAllCategory() {
            return categoryDAL.getAllCategory();
}
    
    public void addCategory(String name){
        category.setName(name);
        categoryDAL.addCategory(category);
}
    
    public void updateCategory( String name){
      
        category.setName(name);
        categoryDAL.updateCategory(category);
}
    public void delCategory(int id) {
        categoryDAL.delCategory(id);
 }
    
    public Category FindCategoryById(int id) {
        return categoryDAL.FindCategoryById(id);
    }




}
