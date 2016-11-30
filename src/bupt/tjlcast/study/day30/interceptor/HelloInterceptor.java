package bupt.tjlcast.study.day30.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class HelloInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	public HelloInterceptor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
	
	/* 
	 * 启动服务器时执行
	 */
	@Override
	public void init() {
		System.out.println("启动拦截器");
	}

	/* 
	 * 拦截器业务处理： 在执行Action之前
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// 调用下一个拦截器或执行Action （相当与chain.doFilter）
		// 读取的是：execute 方法的返回值
		System.out.println("执行Action之前");
		
		String resultFlag = invocation.invoke() ;
		
		System.out.println("拦截器，业务处理结束, resultFlag:" + resultFlag);
		
		return resultFlag;
	}

}
