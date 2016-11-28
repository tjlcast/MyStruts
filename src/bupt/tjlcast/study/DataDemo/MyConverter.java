package bupt.tjlcast.study.DataDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

/**
 * @author tangjialiang
 * 把String转换为指定类型
 */
public class MyConverter extends StrutsTypeConverter {
	
	/* 
	 * @param context 	当前的上下文环境
	 * @param values 	jsp表单提交的字符串的值
	 * @param toClass	要转换为的目标类型
	 */
	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		try {
			if (values == null || values.length==0) {
				return null ;
			}
			
			if (Date.class != toClass) {
				return null ;
			}
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd") ;
			return sdf.parse(values[0]) ;
		} catch (ParseException e) {
			throw new RuntimeException(e) ;
		}
	}

	@Override
	public String convertToString(Map context, Object o) {
		return null;
	}

}
