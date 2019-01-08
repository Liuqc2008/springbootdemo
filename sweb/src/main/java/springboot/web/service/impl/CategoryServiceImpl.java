package springboot.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.web.mapper.CategoryMapper;
import springboot.web.model.Category;
import springboot.web.service.CategoryService;

@Service("CategoryService")
public class CategoryServiceImpl  implements CategoryService{
	@Autowired
	CategoryMapper categoryMapper;
	
	public List<Category> findAll(){
		return categoryMapper.findAll();
	}
	
	public int save(Category category) {
		return categoryMapper.save(category);
	}
	
	public int delete(int id) {
		return categoryMapper.delete(id);
	}
	
	public Category get(int id) {
		return categoryMapper.get(id);
	}
	
	public int update(Category category) {
		return categoryMapper.update(category);
	}
}
