package bupt.tjlcast.study.day30.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import bupt.tjlcast.study.day30.entity.Admin;
import bupt.tjlcast.study.day30.utils.JdbcUtils;

public class AdminDao {
	
	public Admin login(Admin admin) {
		String sql = "select * from user where userName=? and pwd=?" ;
		try {
			return new JdbcUtils().getQueryRunner().query(sql, new BeanHandler<Admin>(Admin.class), admin.getUserName(), admin.getPwd()) ;
		} catch (SQLException e) {
			throw new RuntimeException(e) ;
		}
	}
	
	public List<Admin> list() {
		String sql = "select * from user" ;
		try {
			return new JdbcUtils().getQueryRunner().query(sql, new BeanListHandler<Admin>(Admin.class)) ;
		} catch (SQLException e) {
			throw new RuntimeException(e) ;
		}
	}
}
