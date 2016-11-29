package bupt.tjlcast.study.DataDemo;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DataAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware{

	private static final long serialVersionUID = 1L;
	private Map<String, Object> request ;
	private Map<String, Object> session ;
	private Map<String, Object> application ;

	@Override
	public String execute() throws Exception {
		// 1.请求数据封装

		// 2. 调用Service处理业务路径，得到结果

		// 3.把数据保存到对象中

		// 方式一：直接拿到ServletApi，执行操作
//		 HttpServletRequest request = ServletActionContext.getRequest() ;
//		 HttpSession session = request.getSession() ;
//		 ServletContext servletContext =
//		 ServletActionContext.getServletContext() ;
//		 request.setAttribute("request_data", "request_data");
//		 session.setAttribute("session_data", "session_data");
//		 servletContext.setAttribute("context_data", "context_data");

		// 方式二：直接使用ActionContext类,(仅能向域对象进行增删改查)
		// 得到Struts对HttpServletRequest对象进行了封装，封装为一个map
		// ActionContext actionContext = ActionContext.getContext() ;
		// Map<String, Object> request = actionContext.getContextMap() ;
		// Map<String, Object> session = actionContext.getSession() ;
		// Map<String, Object> application = actionContext.getApplication() ;
		//
		// request.put("request_data", "request_data") ;
		// session.put("session_data", "session_data") ;
		// application.put("context_data", "context_data") ;

		// 方式三： 通过实现接口的方式 implements
		//例如 implements RequestAware 会把request的map对象注入 
		request.put("request_data", "request_data") ;
		session.put("session_data", "session_data") ;
		application.put("context_data", "context_data") ;
		return DataAction.SUCCESS;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request ;
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application ;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session ;
	}
}
