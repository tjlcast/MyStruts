package bupt.tjlcast.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name ;
	private String pwd ;
	
	

	public String getName() {
		return name;
	}



	public String getPwd() {
		return pwd;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	public String login() {
		// 得到用户名
		System.out.println(this.getName());
		System.out.println(this.getPwd());
		
		// 保存到数据域
		ActionContext ac = ActionContext.getContext() ;
		// 得到代表request的map
		Map<String, Object> request = ac.getContextMap() ;
		// 得到代表session的map
		Map<String, Object> session = ac.getSession() ;
		// 得到代表servletContext的map
		Map<String, Object> application = ac.getApplication() ;
		
		return name;
	}

}
