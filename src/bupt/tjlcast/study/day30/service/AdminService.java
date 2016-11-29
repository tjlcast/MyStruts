package bupt.tjlcast.study.day30.service;

import java.util.List;

import bupt.tjlcast.study.day30.dao.AdminDao;
import bupt.tjlcast.study.day30.entity.Admin;

public class AdminService {
	
	AdminDao adminDao = new AdminDao() ;
	
	public Admin login(Admin admin) {
		return adminDao.login(admin) ;
	}
	
	public List<Admin> getAll() {
		return adminDao.list() ;
	}
}
