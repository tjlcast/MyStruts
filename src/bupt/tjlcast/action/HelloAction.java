package bupt.tjlcast.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 开发action
 * @author tangjialiang
 *	
 */
public class HelloAction extends ActionSupport{
	private static final long serialVersionUID = 1L;

	public HelloAction() {
	}

	
	@Override
	public String execute() throws Exception {
		System.out.println("访问到了action");
		System.out.println("调用servlet");
		return "success" ;
	}
	
}
