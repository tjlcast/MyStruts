package bupt.tjlcast.study.day30.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author tangjialiang
 * 判断用户是否登录的拦截器
 * 
 */
public class UserInterceptor extends AbstractInterceptor{
	private static final long serialVersionUID = 3187519727466885439L;

	/* 
	 * 拦截器的业务处理方法
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// 得到当前的方法名(如果当前的方法不是login，则需要进行login)
		ActionContext ac = invocation.getInvocationContext() ;	
		
		ActionProxy proxy = invocation.getProxy() ; // 得到action的代理类
		String methodName = proxy.getMethod() ;
		
		if (!"login".equals(methodName)) {
			// 需要判断是否登录
			Map<String, Object> session = ac.getSession() ;
			Object userInfo = session.get("userInfo") ;
			if (userInfo == null) {
				// 没有登录, 跳转到登录页面（login.jsp）
				return "input" ;
			} else {
				// 已经登录，继续调用
				return invocation.invoke() ;
			}
		}
		// 正在登录
		return invocation.invoke() ; 
	}
	
}
