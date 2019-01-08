package springboot.web.service;

import java.util.List;
import java.util.Map;

import springboot.web.model.Category;

public interface CategoryService {

	public List<Category> findAll();
	
	public int save(Category category);  
	
	public int delete(int id); 
	
	public Category get(int id); 
	
	public int update(Category category);  
}
