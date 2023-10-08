package ecart.com.controller;

import ecart.com.model.Category;
import ecart.com.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/addcat")
    public Category addCategory(@RequestBody Category category){
        return categoryService.addCategory(category);
    }

    //delate category//
    @DeleteMapping("/removecategory/{catId}")
    public String remove(@PathVariable("catId") int catId){
        if (categoryService.removeCategory(catId)){
            return "Sucessfully Delate";
        }
        else {
            return "Unable to delate";
        }
    }

    //findall category//
    @GetMapping("/getalldata")
  public List<Category> getAlldata(){
        return categoryService.getAllCategoryes();
  }

}
