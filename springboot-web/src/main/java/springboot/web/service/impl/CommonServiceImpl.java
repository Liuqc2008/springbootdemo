package springboot.web.service.impl;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import springboot.infrastructure.common.PageData;
import springboot.web.service.CommonService;
import springboot.web.util.ApplicationContextProvider;

@Service("CommonService")
public class CommonServiceImpl implements CommonService {
	
	public Object GetPageData(Map<String, Object> map) throws Exception {
		PageData pageData = new PageData();
		pageData.setData(GetServiceData(map));
		
		map.put("count", true);
		map.remove("page");
		Map<String, Object> listCount =  GetServiceData(map).get(0);
		pageData.setCount(Integer.parseInt(listCount.get("totalNum").toString()));
		
		return pageData;
	}
	
	public static List<Map<String,Object>> GetServiceData(Map<String, Object> map)  throws Exception{
		String serviceName = CommonServiceImpl.ReportNameConfig().get(map.get("reportName"));
				
		Class<?> classType= Class.forName("springboot.web.service." + serviceName);	
		Method method = classType.getDeclaredMethod(map.get("reportName").toString(), Map.class);	
		Object bean = ApplicationContextProvider.getBean(serviceName);
		List<Map<String,Object>> result = (List<Map<String, Object>>) method.invoke(bean, map);	
		

		return result;
	}
	
	public static Map<String, String> ReportNameConfig(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("GetCategoryList", "CategoryService");
		map.put("GetAccountRoleList", "AccountService");
		map.put("GetAccountList", "AccountService");
		
		return map;
	}
}
