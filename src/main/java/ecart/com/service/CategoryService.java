package ecart.com.service;

import ecart.com.model.Category;
import ecart.com.repository.CatogoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CatogoryRepository catogoryRepository;

    //This is add category method
    public Category addCategory(Category category){
        try {
            return catogoryRepository.save(category);
        }
        catch (Exception e){
            System.err.println("exception Acourd in addCategory method"+e.getMessage()+e.getCause());
        }
        return null;
    }
  //This is Remove Category Method
    public boolean removeCategory(int catId){

        try {
            catogoryRepository.deleteById(catId);
            return true;
        }
        catch (Exception ex){
            System.err.println("exception Acourd in removeCategory method"+ex.getMessage()+ex.getCause());
            return  false;
        }
    }

    public List<Category> getAllCategoryes(){

        try {
            return catogoryRepository.findAll();
        }
        catch (Exception  ex){
            System.err.println("Not Able to Find Data"+ ex.getCause()+ex.getMessage());
        }
        return null;
    }


}
