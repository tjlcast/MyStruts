package bupt.tjlcast.study.day30.utils;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtils {

	/**
	 * 初始化连接池
	 */
	private static DataSource dataSource ;
	static {
		dataSource = new ComboPooledDataSource("mySource") ;
		System.out.println("Pool initial finish!") ;
	}

	
	/**
	 * 得到dataSource
	 */
	public static DataSource getDataSource() {
		return dataSource ;
	}
	
	/**
	 * 得到QueryRunner
	 */
	public QueryRunner getQueryRunner() {
		System.out.println("getQueryRunner");
		return new QueryRunner(dataSource) ;
	}
}
