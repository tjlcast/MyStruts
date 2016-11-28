package config1;



public class UserAction {
	
	private String userName ;

	public UserAction() {
	}
	
	public String login() {
		System.out.println("UserAction.login1()" + userName);
		return "success" ;
	}
	
	public String register() {
		System.out.println("UserAction.register1()" + userName);
		return "success" ;
		
	}

}
