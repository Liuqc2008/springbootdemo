package springboot.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import springboot.web.model.Category;

@Mapper
public interface CategoryMapper {
	
	public List<Category> findAll();
    
    public int save(Category category);  
    
    public int delete(int id); 
        
    public Category get(int id); 
      
    public int update(Category category);  
}