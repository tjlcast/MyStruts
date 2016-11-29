package bupt.tjlcast.study.DataDemo;

import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author tangjialiang
 *
 */
public class FileAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private String name;
	private File file1;
	private String file1FileName;
	private String file1ContentType;

	public File getFile1() {
		return file1;
	}

	public String getFile1FileName() {
		return file1FileName;
	}

	public String getFile1ContentType() {
		return file1ContentType;
	}

	public void setFile1(File file1) {
		this.file1 = file1;
	}

	public void setFile1FileName(String file1FileName) {
		this.file1FileName = file1FileName;
	}

	public void setFile1ContentType(String file1ContentType) {
		this.file1ContentType = file1ContentType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/** 
	 * 文件的
	 */
	@Override
	public String execute() throws Exception {
		String path = ServletActionContext.getServletContext().getRealPath("/upload") ;
		String fileName = UUID.randomUUID().toString().replaceAll("-", "") + this.getFile1FileName() ;
		File file = new File(path, fileName) ;
		FileUtils.copyFile(getFile1(), file);
		
		return SUCCESS;
	}
	
	/**
	 * 下载
	 */
	private String fileName ;
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		try {
			fileName = new String(fileName.getBytes("ISO8859-1"), "UTF-8") ;
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e) ;
		}
		this.fileName = fileName;
	}
	
	public String down() {
		return "download" ;
	}
	
	private InputStream inputStream ;
	public InputStream getInputStream() {
		return inputStream ;
	}
}
