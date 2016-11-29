package bupt.tjlcast.study.DataDemo;

import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 文件下载
 * 1. 显示下载文件列表
 * 2. 文件下载
 * @author tangjialiang
 *
 */
public class DownAction extends ActionSupport{
	private static final long serialVersionUID = 1L;

	public String list() {
		// 得到所有的文件
		String path = ServletActionContext.getServletContext().getRealPath("/upload") ;
		// 得到文件的句柄 
		File file = new File(path) ;
		if (file.isDirectory() == false) {
			throw new RuntimeException("director is fail to open") ;
		}
		String[] files = file.list();
		ActionContext context = ActionContext.getContext() ;
		
		@SuppressWarnings("unchecked")
		Map<String, Object> request = (Map<String, Object>)context.get("request") ;
		request.put("files", files) ;
		
		return "list" ;
	}
	
	
	public String downFile() {
		return "download" ;
	}
	
	/**
	 * 获取下载的文件名
	 */
	private String fileName ;
	
	public void setFileName(String fileName) {
		try {
			fileName = new String(fileName.getBytes("ISO8859-1"), "UTF-8") ;
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e) ;
		}
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}

	
	/**
	 * 返回文件流 
	 */
	public InputStream getAttrInputStream() {
		return ServletActionContext.getServletContext().getResourceAsStream("/upload/" + fileName) ;
	}
	
	public String getDownFileName() {
		String uri = null ;
		try {
			uri = URLEncoder.encode(getFileName(), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e) ;
		}
		return uri ;
	}

}
