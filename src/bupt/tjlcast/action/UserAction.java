package bupt.tjlcast.action;

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
		return name;
	}

}
