package bupt.tjlcast.study.DataDemo;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name ;
	
	private String pwd ;
	
	private int age ;
	
	private Date birth ;

	public String getName() {
		return name;
	}

	public String getPwd() {
		return pwd;
	}

	public int getAge() {
		return age;
	}

	public Date getBirth() {
		return birth;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("execute");
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getPwd());
		System.out.println(getBirth());
		return SUCCESS;
	}
	

}
