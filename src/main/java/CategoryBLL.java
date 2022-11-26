import DAL.CategoryDAL;
import DTO.Category;

import java.util.List;

public class CategoryBLL {
    CategoryDAL categoryDAL=new CategoryDAL();
    public List<Category> listCategory() {
        return categoryDAL.getAllCategorys();
    }
}
