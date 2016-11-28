package config2;

public class UserAction {
	
	private String userName ;

	public UserAction() {
	}
	
	public String login() {
		System.out.println("UserAction.login2()" + userName);
		return "success" ;
	}
	
	public String register() {
		System.out.println("UserAction.register2()" + userName);
		return "register";
		
	}

}
