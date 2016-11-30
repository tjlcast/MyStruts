package bupt.tjlcast.study.day30.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import bupt.tjlcast.study.day30.entity.Admin;
import bupt.tjlcast.study.day30.service.AdminService;

public class UserAction extends ActionSupport{

	private static final long serialVersionUID = -7889953317563232185L;
	
	/**
	 * 封装请求数据
	 */
	private Admin admin ;
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	/**
	 * 调用service
	 */
	private AdminService adminService = new AdminService();
	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	/**
	 * 登录
	 */
	public String login() {
		Admin userInfo = adminService.login(admin) ;
		if (userInfo==null) {
			return "input" ;
		}
		// 保存数据到session
		ActionContext ac = ActionContext.getContext() ;
		Map<String, Object> session = ac.getSession() ;
		session.put("userInfo", userInfo) ;
		return "loginSuccess" ;
	}
	
	/**
	 * 列表
	 */
	public String list() {
		System.out.println("into list");
		
		try {
			List<Admin> listAdmin = adminService.getAll() ;
			// 保存到request中(very important)
			ActionContext.getContext().getContextMap().put("listAdmin", listAdmin) ;
			return "list" ;
		} catch (Exception e) {
			return "error" ;
		}
	}
}
