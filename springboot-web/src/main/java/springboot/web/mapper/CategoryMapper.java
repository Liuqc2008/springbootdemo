package springboot.web.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import springboot.web.model.Category;

@Mapper
public interface CategoryMapper {
	
	public List<Map<String,Object>> GetCategoryList(Map<String, Object> map);
	
	public List<Category> findAll();
    
    public int save(Category category);  
    
    public int delete(int id); 
        
    public Category get(int id); 
      
    public int update(Category category);  
}